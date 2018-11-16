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
  
  val ALTERNATE_SERIES: ALTERNATE_SERIES with java.lang.String = js.native
  val DEFAULT_SERIES: DEFAULT_SERIES with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.AutoFillSeries with java.lang.String
  ] = js.native
}

