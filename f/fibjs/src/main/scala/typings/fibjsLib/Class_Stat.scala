package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 文件的基础信息对象
	* @detail Stat 对象通过 fs.stat, File.stat, fs.readdir 查询，不可独立创建
	*/

@JSGlobal("Class_Stat")
@js.native
class Class_Stat () extends Class__object {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 文件最后访问时间
  	 * 
  	 * @readonly
  	 * @type Date
  	 */
  var atime: stdLib.Date = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 文件创建时间
  	 * 
  	 * @readonly
  	 * @type Date
  	 */
  var ctime: stdLib.Date = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 文件所属的组id
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var gid: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 文件权限，Windows 不支持此属性
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var mode: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 文件最后修改时间
  	 * 
  	 * @readonly
  	 * @type Date
  	 */
  var mtime: stdLib.Date = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 文件名称
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var name: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 文件尺寸
  	 * 
  	 * @readonly
  	 * @type Long
  	 */
  var size: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 文件拥有者的id
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var uid: scala.Double = js.native
  /**
  	 * 
  	 * @brief 查询文件是否是目录
  	 * @return 为 true 则是目录
  	 * 
  	 * 
  	 * 
  	 */
  def isDirectory(): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 查询文件是否有执行权限
  	 * @return 为 true 则有执行权限
  	 * 
  	 * 
  	 * 
  	 */
  def isExecutable(): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 查询文件是否是文件
  	 * @return 为 true 则是文件
  	 * 
  	 * 
  	 * 
  	 */
  def isFile(): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 查询文件是否隐藏
  	 * @return 为 true 则隐藏
  	 * 
  	 * 
  	 * 
  	 */
  def isHidden(): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 查询文件是否是内存文件
  	 * @return 为 true 则是内存文件
  	 * 
  	 * 
  	 * 
  	 */
  def isMemory(): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 查询文件是否有读权限
  	 * @return 为 true 则有读权限
  	 * 
  	 * 
  	 * 
  	 */
  def isReadable(): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 查询文件是否是 Socket
  	 * @return 为 true 则是 Socket
  	 * 
  	 * 
  	 * 
  	 */
  def isSocket(): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 查询文件是否是符号链接
  	 * @return 为 true 则是符号链接
  	 * 
  	 * 
  	 * 
  	 */
  def isSymbolicLink(): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 查询文件是否有写入权限
  	 * @return 为 true 则有写入权限
  	 * 
  	 * 
  	 * 
  	 */
  def isWritable(): scala.Boolean = js.native
}

