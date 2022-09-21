package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief Redis 数据库客户端 Hash 对象，此对象为包含指定 key 的客户端，只有调用其方法才会操作数据库
  * @detail 用以操作 Redis 的 Hash 对象，创建方法：,```JavaScript,var db = require("db");,var rdb = new db.openRedis("redis-server");,var hash = rdb.getHash("test");,```
  */
@JSGlobal("Class_RedisHash")
@js.native
open class ClassRedisHash ()
  extends StObject
     with typings.fibjs.ClassRedisHash
