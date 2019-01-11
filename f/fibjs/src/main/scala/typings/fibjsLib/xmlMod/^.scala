package typings
package fibjsLib.xmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ATTRIBUTE_NODE: /* 2 */ scala.Double = js.native
  val CDATA_SECTION_NODE: /* 4 */ scala.Double = js.native
  val COMMENT_NODE: /* 8 */ scala.Double = js.native
  val DOCUMENT_NODE: /* 9 */ scala.Double = js.native
  val DOCUMENT_TYPE_NODE: /* 10 */ scala.Double = js.native
  val ELEMENT_NODE: /* 1 */ scala.Double = js.native
  val PROCESSING_INSTRUCTION_NODE: /* 7 */ scala.Double = js.native
  val TEXT_NODE: /* 3 */ scala.Double = js.native
  def parse(source: fibjsLib.Class_Buffer): fibjsLib.Class_XmlDocument = js.native
  def parse(source: fibjsLib.Class_Buffer, `type`: java.lang.String): fibjsLib.Class_XmlDocument = js.native
  def parse(source: java.lang.String): fibjsLib.Class_XmlDocument = js.native
  def parse(source: java.lang.String, `type`: java.lang.String): fibjsLib.Class_XmlDocument = js.native
  def serialize(node: fibjsLib.Class_XmlNode): java.lang.String = js.native
}

