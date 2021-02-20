package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 数据库访问模块
  * @detail 基础模块。可用于创建和操作数据库资源，引用方式：,```JavaScript,var db = require('db');,```
  */
object dbMod {
  
  @JSImport("db", "escape")
  @js.native
  def escape(str: String): String = js.native
  @JSImport("db", "escape")
  @js.native
  def escape(str: String, mysql: Boolean): String = js.native
  
  @JSImport("db", "format")
  @js.native
  def format(sql: String, args: js.Any*): String = js.native
  
  @JSImport("db", "formatMSSQL")
  @js.native
  def formatMSSQL(sql: String, args: js.Any*): String = js.native
  
  @JSImport("db", "formatMySQL")
  @js.native
  def formatMySQL(sql: String, args: js.Any*): String = js.native
  
  @JSImport("db", "open")
  @js.native
  def open(connString: String): ClassObject = js.native
  
  @JSImport("db", "openLevelDB")
  @js.native
  def openLevelDB(connString: String): ClassLevelDB = js.native
  
  @JSImport("db", "openMSSQL")
  @js.native
  def openMSSQL(connString: String): ClassMSSQL = js.native
  
  @JSImport("db", "openMongoDB")
  @js.native
  def openMongoDB(connString: String): ClassMongoDB = js.native
  
  @JSImport("db", "openMySQL")
  @js.native
  def openMySQL(connString: String): ClassMySQL = js.native
  
  @JSImport("db", "openRedis")
  @js.native
  def openRedis(connString: String): ClassRedis = js.native
  
  @JSImport("db", "openSQLite")
  @js.native
  def openSQLite(connString: String): ClassSQLite = js.native
}
