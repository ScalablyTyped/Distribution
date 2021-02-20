package typings.docxTemplates

import typings.docxTemplates.typesMod.Context
import typings.docxTemplates.typesMod.ReportData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSandboxMod {
  
  @JSImport("docx-templates/lib/jsSandbox", "runUserJsAndGetRaw")
  @js.native
  def runUserJsAndGetRaw(data: js.UndefOr[scala.Nothing], code: String, ctx: Context): js.Promise[_] = js.native
  @JSImport("docx-templates/lib/jsSandbox", "runUserJsAndGetRaw")
  @js.native
  def runUserJsAndGetRaw(data: ReportData, code: String, ctx: Context): js.Promise[_] = js.native
}
