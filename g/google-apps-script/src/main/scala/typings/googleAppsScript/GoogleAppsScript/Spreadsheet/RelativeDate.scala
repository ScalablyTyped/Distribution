package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

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
  
}

