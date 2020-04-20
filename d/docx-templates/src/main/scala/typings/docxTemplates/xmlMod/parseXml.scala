package typings.docxTemplates.xmlMod

import typings.docxTemplates.typesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates/lib/xml", "parseXml")
@js.native
object parseXml extends js.Object {
  def apply(templateXml: String): js.Promise[Node] = js.native
}

