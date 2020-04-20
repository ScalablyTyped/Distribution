package typings.docxTemplates.xmlMod

import typings.docxTemplates.typesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates/lib/xml", "buildXml")
@js.native
object buildXml extends js.Object {
  def apply(node: Node, options: XmlOptions): String = js.native
  def apply(node: Node, options: XmlOptions, indent: String): String = js.native
}

