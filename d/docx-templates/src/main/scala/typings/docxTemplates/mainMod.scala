package typings.docxTemplates

import typings.docxTemplates.docxTemplatesStrings.JS
import typings.docxTemplates.docxTemplatesStrings.XML
import typings.docxTemplates.typesMod.Node
import typings.docxTemplates.typesMod.UserOptions
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates/lib/main", JSImport.Namespace)
@js.native
object mainMod extends js.Object {
  def default(options: UserOptions): js.Promise[Uint8Array] = js.native
  @JSName("default")
  def default_JS(options: UserOptions, _probe: JS): js.Promise[Node] = js.native
  @JSName("default")
  def default_XML(options: UserOptions, _probe: XML): js.Promise[String] = js.native
}

