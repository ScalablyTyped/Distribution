package typings.docxTemplates

import typings.docxTemplates.typesMod.Context
import typings.docxTemplates.typesMod.ReportData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates/lib/jsSandbox", JSImport.Namespace)
@js.native
object jsSandboxMod extends js.Object {
  def runUserJsAndGetRaw(data: js.UndefOr[scala.Nothing], code: String, ctx: Context): js.Promise[_] = js.native
  def runUserJsAndGetRaw(data: ReportData, code: String, ctx: Context): js.Promise[_] = js.native
}

