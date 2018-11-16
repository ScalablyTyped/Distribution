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
  
  val PAST_MONTH: PAST_MONTH with java.lang.String = js.native
  val PAST_WEEK: PAST_WEEK with java.lang.String = js.native
  val PAST_YEAR: PAST_YEAR with java.lang.String = js.native
  val TODAY: TODAY with java.lang.String = js.native
  val TOMORROW: TOMORROW with java.lang.String = js.native
  val YESTERDAY: YESTERDAY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.RelativeDate with java.lang.String
  ] = js.native
}

