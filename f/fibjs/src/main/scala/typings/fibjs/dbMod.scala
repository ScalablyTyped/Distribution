package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 数据库访问模块
  * @detail 基础模块。可用于创建和操作数据库资源，引用方式：,```JavaScript,var db = require('db');,```
  */
object dbMod {
  
  @JSImport("db", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def escape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def escape(str: String, mysql: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any], mysql.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format(sql: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatMSSQL(sql: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMSSQL")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatMySQL(sql: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMySQL")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def open(connString: String): ClassObject = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassObject]
  
  @scala.inline
  def openLevelDB(connString: String): ClassLevelDB = ^.asInstanceOf[js.Dynamic].applyDynamic("openLevelDB")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassLevelDB]
  
  @scala.inline
  def openMSSQL(connString: String): ClassMSSQL = ^.asInstanceOf[js.Dynamic].applyDynamic("openMSSQL")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassMSSQL]
  
  @scala.inline
  def openMongoDB(connString: String): ClassMongoDB = ^.asInstanceOf[js.Dynamic].applyDynamic("openMongoDB")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassMongoDB]
  
  @scala.inline
  def openMySQL(connString: String): ClassMySQL = ^.asInstanceOf[js.Dynamic].applyDynamic("openMySQL")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassMySQL]
  
  @scala.inline
  def openRedis(connString: String): ClassRedis = ^.asInstanceOf[js.Dynamic].applyDynamic("openRedis")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassRedis]
  
  @scala.inline
  def openSQLite(connString: String): ClassSQLite = ^.asInstanceOf[js.Dynamic].applyDynamic("openSQLite")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassSQLite]
}
