package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomDisabledDate event.
  */
trait ASPxClientCalendarCustomDisabledDateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the date processed in the calendar.
    * Value: A DateTime value containing processed data.
    */
  var date: Date
  /**
    * Gets or sets a value specifying whether selection of the processed calendar date is disabled.
    * Value: true, if the date is disabled; otherwise, false.
    */
  var isDisabled: Boolean
}

object ASPxClientCalendarCustomDisabledDateEventArgs {
  @scala.inline
  def apply(date: Date, isDisabled: Boolean): ASPxClientCalendarCustomDisabledDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date, isDisabled = isDisabled)
  
    __obj.asInstanceOf[ASPxClientCalendarCustomDisabledDateEventArgs]
  }
}

