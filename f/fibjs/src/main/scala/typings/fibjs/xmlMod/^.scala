package typings.fibjs.xmlMod

import typings.fibjs.Class_Buffer
import typings.fibjs.Class_XmlDocument
import typings.fibjs.Class_XmlNode
import typings.fibjs.fibjsNumbers.`10`
import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`2`
import typings.fibjs.fibjsNumbers.`3`
import typings.fibjs.fibjsNumbers.`4`
import typings.fibjs.fibjsNumbers.`7`
import typings.fibjs.fibjsNumbers.`8`
import typings.fibjs.fibjsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ATTRIBUTE_NODE: `2` = js.native
  val CDATA_SECTION_NODE: `4` = js.native
  val COMMENT_NODE: `8` = js.native
  val DOCUMENT_NODE: `9` = js.native
  val DOCUMENT_TYPE_NODE: `10` = js.native
  val ELEMENT_NODE: `1` = js.native
  val PROCESSING_INSTRUCTION_NODE: `7` = js.native
  val TEXT_NODE: `3` = js.native
  def parse(source: String): Class_XmlDocument = js.native
  def parse(source: String, `type`: String): Class_XmlDocument = js.native
  def parse(source: Class_Buffer): Class_XmlDocument = js.native
  def parse(source: Class_Buffer, `type`: String): Class_XmlDocument = js.native
  def serialize(node: Class_XmlNode): String = js.native
}

