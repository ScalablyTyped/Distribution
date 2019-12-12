package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.RelativeDate.PAST_MONTH
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.RelativeDate.PAST_WEEK
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.RelativeDate.PAST_YEAR
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.RelativeDate.TODAY
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.RelativeDate.TOMORROW
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.RelativeDate.YESTERDAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelativeDate extends js.Object

/**
  * An enumeration representing the relative date options for calculating a value to be used in
  * date-based BooleanCriteria.
  */
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelativeDate with Double] = js.native
  /* 4 */ @js.native
  object PAST_MONTH extends TopLevel[PAST_MONTH with Double]
  
  /* 3 */ @js.native
  object PAST_WEEK extends TopLevel[PAST_WEEK with Double]
  
  /* 5 */ @js.native
  object PAST_YEAR extends TopLevel[PAST_YEAR with Double]
  
  /* 0 */ @js.native
  object TODAY extends TopLevel[TODAY with Double]
  
  /* 1 */ @js.native
  object TOMORROW extends TopLevel[TOMORROW with Double]
  
  /* 2 */ @js.native
  object YESTERDAY extends TopLevel[YESTERDAY with Double]
  
}

