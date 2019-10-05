package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelativeDate extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.RelativeDate")
@js.native
object RelativeDate extends js.Object {
  @js.native
  sealed trait PAST_MONTH extends RelativeDate
  
  @js.native
  sealed trait PAST_WEEK extends RelativeDate
  
  @js.native
  sealed trait PAST_YEAR extends RelativeDate
  
  @js.native
  sealed trait TODAY extends RelativeDate
  
  @js.native
  sealed trait TOMORROW extends RelativeDate
  
  @js.native
  sealed trait YESTERDAY extends RelativeDate
  
  /* 4 */ val PAST_MONTH: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.RelativeDate.PAST_MONTH with Double = js.native
  /* 3 */ val PAST_WEEK: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.RelativeDate.PAST_WEEK with Double = js.native
  /* 5 */ val PAST_YEAR: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.RelativeDate.PAST_YEAR with Double = js.native
  /* 0 */ val TODAY: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.RelativeDate.TODAY with Double = js.native
  /* 1 */ val TOMORROW: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.RelativeDate.TOMORROW with Double = js.native
  /* 2 */ val YESTERDAY: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.RelativeDate.YESTERDAY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelativeDate with Double] = js.native
}

