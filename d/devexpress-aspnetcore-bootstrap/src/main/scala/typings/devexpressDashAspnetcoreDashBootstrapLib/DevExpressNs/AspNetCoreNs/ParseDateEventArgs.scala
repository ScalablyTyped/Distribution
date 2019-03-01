package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseDateEventArgs extends EventArgs {
  val date: stdLib.Date
  val handled: scala.Boolean
  val value: java.lang.String
}

object ParseDateEventArgs {
  @scala.inline
  def apply(date: stdLib.Date, handled: scala.Boolean, sender: Control, value: java.lang.String): ParseDateEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ParseDateEventArgs]
  }
}

