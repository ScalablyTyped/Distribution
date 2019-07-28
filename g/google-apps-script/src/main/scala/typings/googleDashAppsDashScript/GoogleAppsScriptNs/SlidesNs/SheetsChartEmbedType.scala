package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetsChartEmbedType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.SheetsChartEmbedType")
@js.native
object SheetsChartEmbedType extends js.Object {
  @js.native
  sealed trait IMAGE extends SheetsChartEmbedType
  
  @js.native
  sealed trait UNSUPPORTED extends SheetsChartEmbedType
  
  /* 1 */ val IMAGE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SheetsChartEmbedType.IMAGE with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SheetsChartEmbedType.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SheetsChartEmbedType with Double] = js.native
}

