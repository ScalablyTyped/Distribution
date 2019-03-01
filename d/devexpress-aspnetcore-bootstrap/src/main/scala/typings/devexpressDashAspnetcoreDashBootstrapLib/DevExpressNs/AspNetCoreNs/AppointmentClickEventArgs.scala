package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentClickEventArgs extends EventArgs {
  val appointmentId: java.lang.String
  val handled: scala.Boolean
  val htmlElement: js.Object
}

object AppointmentClickEventArgs {
  @scala.inline
  def apply(appointmentId: java.lang.String, handled: scala.Boolean, htmlElement: js.Object, sender: Control): AppointmentClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appointmentId")(appointmentId)
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("htmlElement")(htmlElement)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[AppointmentClickEventArgs]
  }
}

