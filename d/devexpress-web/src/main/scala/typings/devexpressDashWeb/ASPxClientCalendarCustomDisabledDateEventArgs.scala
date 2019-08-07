package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCalendar.CustomDisabledDate event.
  */
@JSGlobal("ASPxClientCalendarCustomDisabledDateEventArgs")
@js.native
class ASPxClientCalendarCustomDisabledDateEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCalendarCustomDisabledDateEventArgs object.
    * @param date A DateTime object that is the currently processed date.
    */
  def this(date: Date) = this()
  /**
    * Gets the date processed in the calendar.
    */
  var date: Date = js.native
  /**
    * Gets or sets a value specifying whether selection of the processed calendar date is disabled.
    */
  var isDisabled: Boolean = js.native
}

