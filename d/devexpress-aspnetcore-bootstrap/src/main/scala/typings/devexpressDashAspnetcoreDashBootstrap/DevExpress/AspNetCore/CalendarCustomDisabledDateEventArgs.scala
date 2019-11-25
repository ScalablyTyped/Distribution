package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarCustomDisabledDateEventArgs extends EventArgs {
  val date: Date
  var isDisabled: Boolean
}

object CalendarCustomDisabledDateEventArgs {
  @scala.inline
  def apply(date: Date, isDisabled: Boolean, sender: Control): CalendarCustomDisabledDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CalendarCustomDisabledDateEventArgs]
  }
}

