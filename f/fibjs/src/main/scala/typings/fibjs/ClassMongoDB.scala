package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief mongodb 数据库连接对象
  * @detail 使用 db.open 或 db.openMongoDB 创建，创建方式：,```JavaScript,var mdb = db.openMongoDB("mongodb://host/db");,```
  */
@js.native
trait ClassMongoDB extends ClassObject {
  
  /**
    * 
    * @brief 关闭当前数据库连接
    * 
    * @async
    */
  def close(): Unit = js.native
  
  /**
    * 
    * @brief 获取指定集合访问对象
    * @param name 指定集合的名称
    * @return 返回指定的集合对象
    * 
    * 
    * 
    */
  def getCollection(name: String): ClassMongoCollection = js.native
  
  /**
    * 
    * @brief 生成一个 mongodb _objectid 对象
    * @param hexStr 初始化 16 进制字符串，缺省生成新的 id
    * @return 新 _objectid 对象
    * 
    * 
    * 
    */
  def oid(): ClassMongoID = js.native
  def oid(hexStr: String): ClassMongoID = js.native
  
  /**
    * 
    * @brief 指定一个简单的 MongoDB 数据库命令
    * @param cmd 指定命令名
    * @param arg 指定命令参数
    * @return 返回命令执行结果
    * 
    * 
    * 
    */
  def runCommand(cmd: String, arg: js.Any): js.Object = js.native
  /**
    * 
    * @brief 指定一个 MongoDB 数据库命令
    * @param cmd 指定命令和参数的字典对象
    * @return 返回命令执行结果
    * 
    * 
    * 
    */
  def runCommand(cmd: js.Object): js.Object = js.native
}
