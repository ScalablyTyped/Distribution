package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelativeDate extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.RelativeDate")
@js.native
object RelativeDate extends js.Object {
  @js.native
  sealed trait PAST_MONTH
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.RelativeDate
  
  @js.native
  sealed trait PAST_WEEK
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.RelativeDate
  
  @js.native
  sealed trait PAST_YEAR
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.RelativeDate
  
  @js.native
  sealed trait TODAY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.RelativeDate
  
  @js.native
  sealed trait TOMORROW
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.RelativeDate
  
  @js.native
  sealed trait YESTERDAY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.RelativeDate
  
  /* 4 */ val PAST_MONTH: PAST_MONTH with scala.Double = js.native
  /* 3 */ val PAST_WEEK: PAST_WEEK with scala.Double = js.native
  /* 5 */ val PAST_YEAR: PAST_YEAR with scala.Double = js.native
  /* 0 */ val TODAY: TODAY with scala.Double = js.native
  /* 1 */ val TOMORROW: TOMORROW with scala.Double = js.native
  /* 2 */ val YESTERDAY: YESTERDAY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.RelativeDate with scala.Double
  ] = js.native
}

