package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_File")
@js.native
class Class_File () extends Class_SeekableStream {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询当前文件描述符
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var fd: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询当前文件名
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var name: java.lang.String = js.native
  /**
  	 * 
  	 * @brief 查询当前文件的访问权限，Windows 不支持此方法
  	 * @param mode 指定设定的访问权限
  	 * 
  	 * 
  	 * @async
  	 */
  def chmod(mode: scala.Double): scala.Unit = js.native
}

