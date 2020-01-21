package typings.fibjs

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
class ClassXmlAttr () extends ClassObject {
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
  var localName: String = js.native
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
  var name: String = js.native
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
  var namespaceURI: String = js.native
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
  var nodeName: String = js.native
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
  var nodeValue: String = js.native
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
  var prefix: String = js.native
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
  var value: String = js.native
}

