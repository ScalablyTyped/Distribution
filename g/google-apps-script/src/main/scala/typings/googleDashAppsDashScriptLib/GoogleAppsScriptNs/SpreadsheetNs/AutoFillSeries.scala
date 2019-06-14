package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoFillSeries extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.AutoFillSeries")
@js.native
object AutoFillSeries extends js.Object {
  @js.native
  sealed trait ALTERNATE_SERIES
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.AutoFillSeries
  
  @js.native
  sealed trait DEFAULT_SERIES
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.AutoFillSeries
  
  /* 1 */ val ALTERNATE_SERIES: ALTERNATE_SERIES with scala.Double = js.native
  /* 0 */ val DEFAULT_SERIES: DEFAULT_SERIES with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.AutoFillSeries with scala.Double
  ] = js.native
}

