package typings.docxTemplates

import typings.docxTemplates.typesMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates/lib/jsSandbox", JSImport.Namespace)
@js.native
object jsSandboxMod extends js.Object {
  def runUserJsAndGetRaw(data: js.Any, code: String, ctx: Context): js.Promise[_] = js.native
  def runUserJsAndGetString(data: js.Any, code: String, ctx: Context): js.Promise[String] = js.native
}

