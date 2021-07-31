package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassSQLite
  extends StObject
     with ClassDbConnection {
  
  /**
    * 
    * @brief 备份当前数据库到新文件
    * @param fileName 指定备份的数据库文件名
    * 
    * @async
    */
  def backup(fileName: String): Unit = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 当前数据库文件名
    * 
    * @readonly
    * @type String
    */
  var fileName: String = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置数据库超时时间，以毫秒为单位
    * 
    * 
    * @type Integer
    */
  var timeout: Double = js.native
}
