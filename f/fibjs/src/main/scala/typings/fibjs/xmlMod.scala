package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief xml 处理模块
  * @detail 
  */
@JSImport("xml", JSImport.Namespace)
@js.native
object xmlMod extends js.Object {
  
  val ATTRIBUTE_NODE: /* 2 */ Double = js.native
  
  val CDATA_SECTION_NODE: /* 4 */ Double = js.native
  
  val COMMENT_NODE: /* 8 */ Double = js.native
  
  val DOCUMENT_NODE: /* 9 */ Double = js.native
  
  val DOCUMENT_TYPE_NODE: /* 10 */ Double = js.native
  
  val ELEMENT_NODE: /* 1 */ Double = js.native
  
  val PROCESSING_INSTRUCTION_NODE: /* 7 */ Double = js.native
  
  val TEXT_NODE: /* 3 */ Double = js.native
  
  def parse(source: String): ClassXmlDocument = js.native
  def parse(source: String, `type`: String): ClassXmlDocument = js.native
  def parse(source: ClassBuffer): ClassXmlDocument = js.native
  def parse(source: ClassBuffer, `type`: String): ClassXmlDocument = js.native
  
  def serialize(node: ClassXmlNode): String = js.native
  
  @js.native
  class Document () extends ClassXmlDocument
}
