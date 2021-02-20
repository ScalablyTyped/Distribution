package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief xml 处理模块
  * @detail 
  */
object xmlMod {
  
  @JSImport("xml", "ATTRIBUTE_NODE")
  @js.native
  val ATTRIBUTE_NODE: /* 2 */ Double = js.native
  
  @JSImport("xml", "CDATA_SECTION_NODE")
  @js.native
  val CDATA_SECTION_NODE: /* 4 */ Double = js.native
  
  @JSImport("xml", "COMMENT_NODE")
  @js.native
  val COMMENT_NODE: /* 8 */ Double = js.native
  
  @JSImport("xml", "DOCUMENT_NODE")
  @js.native
  val DOCUMENT_NODE: /* 9 */ Double = js.native
  
  @JSImport("xml", "DOCUMENT_TYPE_NODE")
  @js.native
  val DOCUMENT_TYPE_NODE: /* 10 */ Double = js.native
  
  @JSImport("xml", "Document")
  @js.native
  class Document () extends ClassXmlDocument
  
  @JSImport("xml", "ELEMENT_NODE")
  @js.native
  val ELEMENT_NODE: /* 1 */ Double = js.native
  
  @JSImport("xml", "PROCESSING_INSTRUCTION_NODE")
  @js.native
  val PROCESSING_INSTRUCTION_NODE: /* 7 */ Double = js.native
  
  @JSImport("xml", "TEXT_NODE")
  @js.native
  val TEXT_NODE: /* 3 */ Double = js.native
  
  @JSImport("xml", "parse")
  @js.native
  def parse(source: String): ClassXmlDocument = js.native
  @JSImport("xml", "parse")
  @js.native
  def parse(source: String, `type`: String): ClassXmlDocument = js.native
  @JSImport("xml", "parse")
  @js.native
  def parse(source: ClassBuffer): ClassXmlDocument = js.native
  @JSImport("xml", "parse")
  @js.native
  def parse(source: ClassBuffer, `type`: String): ClassXmlDocument = js.native
  
  @JSImport("xml", "serialize")
  @js.native
  def serialize(node: ClassXmlNode): String = js.native
}
