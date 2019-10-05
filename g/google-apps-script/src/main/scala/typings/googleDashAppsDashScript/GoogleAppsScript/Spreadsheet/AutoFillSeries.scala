package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoFillSeries extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.AutoFillSeries")
@js.native
object AutoFillSeries extends js.Object {
  @js.native
  sealed trait ALTERNATE_SERIES extends AutoFillSeries
  
  @js.native
  sealed trait DEFAULT_SERIES extends AutoFillSeries
  
  /* 1 */ val ALTERNATE_SERIES: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.AutoFillSeries.ALTERNATE_SERIES with Double = js.native
  /* 0 */ val DEFAULT_SERIES: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.AutoFillSeries.DEFAULT_SERIES with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AutoFillSeries with Double] = js.native
}

