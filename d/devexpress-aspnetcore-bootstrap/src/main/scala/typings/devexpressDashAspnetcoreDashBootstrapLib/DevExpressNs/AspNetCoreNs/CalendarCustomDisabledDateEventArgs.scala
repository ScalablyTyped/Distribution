package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarCustomDisabledDateEventArgs extends EventArgs {
  val date: stdLib.Date
  var isDisabled: scala.Boolean
}

object CalendarCustomDisabledDateEventArgs {
  @scala.inline
  def apply(date: stdLib.Date, isDisabled: scala.Boolean, sender: Control): CalendarCustomDisabledDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date, isDisabled = isDisabled, sender = sender)
  
    __obj.asInstanceOf[CalendarCustomDisabledDateEventArgs]
  }
}

