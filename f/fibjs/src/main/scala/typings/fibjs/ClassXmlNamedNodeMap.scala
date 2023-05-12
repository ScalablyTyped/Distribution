package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief XmlNamedNodeMap 对象表示一个无顺序的属性列表
  * @detail
  */
@js.native
trait ClassXmlNamedNodeMap
  extends StObject
     with ClassObject {
  
  /**
    *
    * @brief 查询指定名称的属性
    * @param name 指定要查询的名称
    * @return 返回查询出的属性
    *
    *
    *
    */
  def getNamedItem(name: String): ClassXmlAttr = js.native
  
  /**
    *
    * @brief 返回属性列表中处于指定的索引号的属性
    * @param index 指定要查询的索引
    * @return 指定索引号的属性
    *
    *
    *
    */
  def item(index: Double): ClassXmlAttr = js.native
  
  /**
    * class prop
    *
    *
    * @brief 返回属性列表中的属性数目
    *
    *
    * @readonly
    * @note Assumed to be an integer.
    */
  var length: Double = js.native
}
