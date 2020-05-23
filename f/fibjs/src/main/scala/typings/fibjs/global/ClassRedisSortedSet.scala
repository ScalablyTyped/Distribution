package typings.fibjs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
  * @brief Redis 数据库客户端 SortedSet 对象，此对象为包含指定 key 的客户端，只有调用其方法才会操作数据库
  * @detail 用以操作 Redis 的 SortedSet 对象，创建方法：,```JavaScript,var db = require("db");,var rdb = new db.openRedis("redis-server");,var set = rdb.getSortedSet("test");,```
  */
@JSGlobal("Class_RedisSortedSet")
@js.native
class ClassRedisSortedSet ()
  extends typings.fibjs.ClassRedisSortedSet

