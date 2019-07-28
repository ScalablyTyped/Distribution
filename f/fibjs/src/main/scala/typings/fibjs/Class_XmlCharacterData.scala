package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_XmlCharacterData")
@js.native
class Class_XmlCharacterData () extends Class_XmlNode {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 该节点包含的文本
  	 * 
  	 * 
  	 * 
  	 * @type String
  	 */
  var data: String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 该节点包含的字符数
  	 * 
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var length: Double = js.native
  /**
  	 * 
  	 * @brief 把字符串附加到节点上
  	 * @param arg 要附加到节点的字符串
  	 * 
  	 * 
  	 * 
  	 */
  def appendData(arg: String): Unit = js.native
  /**
  	 * 
  	 * @brief 从节点删除文本
  	 * @param offset 要删除的第一个字符的位置
  	 * @param count 要删除的字符的数量
  	 * 
  	 * 
  	 * 
  	 */
  def deleteData(offset: Double, count: Double): Unit = js.native
  /**
  	 * 
  	 * @brief 把字符串插入节点
  	 * @param offset 要把字符串插入节点的字符位置
  	 * @param arg 要插入的字符串
  	 * 
  	 * 
  	 * 
  	 */
  def insertData(offset: Double, arg: String): Unit = js.native
  /**
  	 * 
  	 * @brief 用指定的字符串替换节点的字符
  	 * @param offset 节点要替换的字符位置
  	 * @param count 要替换的字符的数量
  	 * @param arg 要插入的字符串
  	 * 
  	 * 
  	 * 
  	 */
  def replaceData(offset: Double, count: Double, arg: String): Unit = js.native
  /**
  	 * 
  	 * @brief 从节点中提取子串
  	 * @param offset 要返回的第一个字符的位置
  	 * @param count 要返回的子串中的字符数
  	 * @return 返回提取的字符串
  	 * 
  	 * 
  	 * 
  	 */
  def substringData(offset: Double, count: Double): String = js.native
}

