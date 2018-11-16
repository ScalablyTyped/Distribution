package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_MySQL")
@js.native
class Class_MySQL () extends Class_DbConnection {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 数据库连接接收缓存尺寸
  	 * 
  	 * 
  	 * @type Integer
  	 */
  var rxBufferSize: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 数据库连接发送缓存尺寸
  	 * 
  	 * 
  	 * @type Integer
  	 */
  var txBufferSize: scala.Double = js.native
  /**
  	 * 
  	 * @brief 选择当前数据库连接的缺省数据库
  	 * @param dbName 指定数据库名
  	 * 
  	 * 
  	 * @async
  	 */
  def use(dbName: java.lang.String): scala.Unit = js.native
}

