package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCalendar.CustomDisabledDate event.
  */
@js.native
trait ASPxClientCalendarCustomDisabledDateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the date processed in the calendar.
    */
  var date: Date = js.native
  /**
    * Gets or sets a value specifying whether selection of the processed calendar date is disabled.
    */
  var isDisabled: Boolean = js.native
}

object ASPxClientCalendarCustomDisabledDateEventArgs {
  @scala.inline
  def apply(date: Date, isDisabled: Boolean): ASPxClientCalendarCustomDisabledDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCalendarCustomDisabledDateEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCalendarCustomDisabledDateEventArgsOps[Self <: ASPxClientCalendarCustomDisabledDateEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
  }
  
}

