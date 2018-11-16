package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_SQLite")
@js.native
class Class_SQLite () extends Class_DbConnection {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 当前数据库文件名
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var fileName: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置数据库超时时间，以毫秒为单位
  	 * 
  	 * 
  	 * @type Integer
  	 */
  var timeout: scala.Double = js.native
  /**
  	 * 
  	 * @brief 备份当前数据库到新文件
  	 * @param fileName 指定备份的数据库文件名
  	 * 
  	 * @async
  	 */
  def backup(fileName: java.lang.String): scala.Unit = js.native
}

