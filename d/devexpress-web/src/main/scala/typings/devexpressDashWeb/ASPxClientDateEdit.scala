package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxDateEdit control.
  */
@JSGlobal("ASPxClientDateEdit")
@js.native
class ASPxClientDateEdit () extends ASPxClientDropDownEditBase {
  /**
    * Occurs when an end user clicks a calendar date cell.
    */
  var CalendarCellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientDateEdit]] = js.native
  /**
    * Allows you to disable the calendar's days.
    */
  var CalendarCustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientDateEdit]] = js.native
  /**
    * Fires after the selected date has been changed within the date editor.
    */
  var DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]] = js.native
  /**
    * Enables you to convert the value entered by an end user into the value that will be stored by the date editor.
    */
  var ParseDate: ASPxClientEvent[ASPxClientParseDateEventHandler[ASPxClientDateEdit]] = js.native
  /**
    * This event is not in effect for the ASPxClientDateEdit. Use the ASPxClientDateEdit.DateChanged event instead.
    */
  @JSName("TextChanged")
  var TextChanged_ASPxClientDateEdit: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]] = js.native
  /**
    * Returns the calendar of the date editor.
    */
  def GetCalendar(): ASPxClientCalendar = js.native
  /**
    * Gets the date that is the editor's value.
    */
  def GetDate(): Date = js.native
  /**
    * Gets the maximum date of the editor.
    */
  def GetMaxDate(): Date = js.native
  /**
    * Gets the minimum date of the editor.
    */
  def GetMinDate(): Date = js.native
  /**
    * Returns the number of days in a range selected within a date edit.
    */
  def GetRangeDayCount(): Double = js.native
  /**
    * Gets the range's length.
    */
  def GetRangeLength(): Double = js.native
  /**
    * Returns the built-in time edit control.
    */
  def GetTimeEdit(): ASPxClientTimeEdit = js.native
  /**
    * Specifies the date for the editor.
    * @param date The date.
    */
  def SetDate(date: Date): Unit = js.native
  /**
    * Sets the maximum date of the editor.
    * @param date A DateTime object representing the maximum date.
    */
  def SetMaxDate(date: Date): Unit = js.native
  /**
    * Sets the minimum date of the editor.
    * @param date A DateTime object representing the minimum date.
    */
  def SetMinDate(date: Date): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientDateEdit")
@js.native
object ASPxClientDateEdit extends js.Object {
  /**
    * Converts the specified object to the ASPxClientDateEdit type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientDateEdit = js.native
}

