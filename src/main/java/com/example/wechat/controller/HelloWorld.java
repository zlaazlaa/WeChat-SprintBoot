package com.example.wechat.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
public class HelloWorld {

    

    @RequestMapping("/hello")
    public String hello() throws Exception {

        JdbcTemplate jdbcTemplate = null;
        String sql="select runoob_id from runoob_title;";//SQL查询语句
        jdbcTemplate.query(sql, new ResultSetExtractor() {

            @Override
            public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
                System.out.println(rs);
                return null;
            }
        });
//        List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
        return "list";


//        return "Hello World";
    }
}
