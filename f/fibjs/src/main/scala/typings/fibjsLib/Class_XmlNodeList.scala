package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief XmlNodeList 对象代表一个有顺序的节点列表
	* @detail 
	*/

@JSGlobal("Class_XmlNodeList")
@js.native
class Class_XmlNodeList () extends Class__object {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 返回节点列表中的节点数目
  	 * 
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var length: scala.Double = js.native
  /**
  	 * 
  	 * @brief 返回节点列表中处于指定的索引号的节点
  	 * @param index 指定要查询的索引
  	 * @return 指定索引号的节点
  	 * 
  	 * 
  	 * 
  	 */
  def item(index: scala.Double): Class_XmlNode = js.native
}

