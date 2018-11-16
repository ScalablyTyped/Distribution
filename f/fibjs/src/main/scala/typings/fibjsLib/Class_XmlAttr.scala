package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief XmlAttr 对象表示 XmlElement 对象的属性
	* @detail 
	*/

@JSGlobal("Class_XmlAttr")
@js.native
class Class_XmlAttr () extends Class__object {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询元素的本地名称。如果选定的节点无命名空间，则该属性等同于 nodeName
  	 * 
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var localName: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 属性的名称
  	 * 
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var name: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询元素的命名空间的 URI。如果选定的节点无命名空间，则该属性返回 NULL
  	 * 
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var namespaceURI: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 属性的名称，为兼容的目的
  	 * 
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var nodeName: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 属性的值，为兼容的目的
  	 * 
  	 * 
  	 * 
  	 * @type String
  	 */
  var nodeValue: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置元素的命名空间前缀。如果选定的节点无命名空间，则该属性返回 NULL
  	 * 
  	 * 
  	 * 
  	 * @type String
  	 */
  var prefix: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 属性的值
  	 * 
  	 * 
  	 * 
  	 * @type String
  	 */
  var value: java.lang.String = js.native
}

