package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief XmlAttr 对象表示 XmlElement 对象的属性
  * @detail
  */
@js.native
trait ClassXmlAttr
  extends StObject
     with ClassObject {
  
  /**
    * class prop
    *
    *
    * @brief 查询元素的本地名称。如果选定的节点无命名空间，则该属性等同于 nodeName
    *
    *
    * @readonly
    *
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
    *
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
    *
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
    *
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
    *
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
    *
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
    *
    */
  var value: String = js.native
}
