package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents the client-side equivalent of the ASPxDateEdit control.
 */

trait ASPxClientDateEdit extends ASPxClientDropDownEditBase {
  /**
       * Allows you to disable the calendar's days.
       */
  var CalendarCustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientDateEdit]]
  /**
       * Fires after the selected date has been changed within the date editor.
       */
  var DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]
  /**
       * Enables you to convert the value entered by an end user into the value that will be stored by the date editor.
       */
  var ParseDate: ASPxClientEvent[ASPxClientParseDateEventHandler[ASPxClientDateEdit]]
  /**
       * This event is not in effect for the ASPxClientDateEdit. Use the DateChanged event instead.
       */
  @JSName("TextChanged")
  var TextChanged_ASPxClientDateEdit: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]
  /**
       * Returns the calendar of the date editor.
       */
  def GetCalendar(): ASPxClientCalendar
  /**
       * Gets the date that is the editor's value.
       */
  def GetDate(): stdLib.Date
  /**
       * Gets the maximum date of the editor.
       */
  def GetMaxDate(): stdLib.Date
  /**
       * Gets the minimum date of the editor.
       */
  def GetMinDate(): stdLib.Date
  /**
       * Returns the number of days in a range selected within a date edit.
       */
  def GetRangeDayCount(): scala.Double
  /**
       * Returns the built-in time edit control.
       */
  def GetTimeEdit(): ASPxClientTimeEdit
  /**
       * Specifies the date for the editor.
       * @param date A DateTime object that is the date.
       */
  def SetDate(date: stdLib.Date): scala.Unit
  /**
       * Sets the maximum date of the editor.
       * @param date A DateTime object representing the maximum date.
       */
  def SetMaxDate(date: stdLib.Date): scala.Unit
  /**
       * Sets the minimum date of the editor.
       * @param date A DateTime object representing the minimum date.
       */
  def SetMinDate(date: stdLib.Date): scala.Unit
}

