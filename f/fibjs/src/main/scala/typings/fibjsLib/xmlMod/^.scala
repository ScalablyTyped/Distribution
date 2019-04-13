package typings
package fibjsLib.xmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ATTRIBUTE_NODE: fibjsLib.fibjsLibNumbers.`2` = js.native
  val CDATA_SECTION_NODE: fibjsLib.fibjsLibNumbers.`4` = js.native
  val COMMENT_NODE: fibjsLib.fibjsLibNumbers.`8` = js.native
  val DOCUMENT_NODE: fibjsLib.fibjsLibNumbers.`9` = js.native
  val DOCUMENT_TYPE_NODE: fibjsLib.fibjsLibNumbers.`10` = js.native
  val ELEMENT_NODE: fibjsLib.fibjsLibNumbers.`1` = js.native
  val PROCESSING_INSTRUCTION_NODE: fibjsLib.fibjsLibNumbers.`7` = js.native
  val TEXT_NODE: fibjsLib.fibjsLibNumbers.`3` = js.native
  def parse(source: fibjsLib.Class_Buffer): fibjsLib.Class_XmlDocument = js.native
  def parse(source: fibjsLib.Class_Buffer, `type`: java.lang.String): fibjsLib.Class_XmlDocument = js.native
  def parse(source: java.lang.String): fibjsLib.Class_XmlDocument = js.native
  def parse(source: java.lang.String, `type`: java.lang.String): fibjsLib.Class_XmlDocument = js.native
  def serialize(node: fibjsLib.Class_XmlNode): java.lang.String = js.native
}

