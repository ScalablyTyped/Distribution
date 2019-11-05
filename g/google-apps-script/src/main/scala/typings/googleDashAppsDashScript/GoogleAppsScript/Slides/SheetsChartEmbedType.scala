package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetsChartEmbedType extends js.Object

/**
  * The Sheets chart's embed type.
  */
@JSGlobal("GoogleAppsScript.Slides.SheetsChartEmbedType")
@js.native
object SheetsChartEmbedType extends js.Object {
  @js.native
  sealed trait IMAGE extends SheetsChartEmbedType
  
  @js.native
  sealed trait UNSUPPORTED extends SheetsChartEmbedType
  
  /* 1 */ val IMAGE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.SheetsChartEmbedType.IMAGE with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.SheetsChartEmbedType.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SheetsChartEmbedType with Double] = js.native
}

