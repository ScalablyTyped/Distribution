package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCalendar.CustomDisabledDate event.
  */
trait ASPxClientCalendarCustomDisabledDateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the date processed in the calendar.
    */
  var date: Date
  /**
    * Gets or sets a value specifying whether selection of the processed calendar date is disabled.
    */
  var isDisabled: Boolean
}

object ASPxClientCalendarCustomDisabledDateEventArgs {
  @scala.inline
  def apply(date: Date, isDisabled: Boolean): ASPxClientCalendarCustomDisabledDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCalendarCustomDisabledDateEventArgs]
  }
}

