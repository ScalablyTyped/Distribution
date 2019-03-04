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
    val __obj = js.Dynamic.literal(appointmentId = appointmentId, handled = handled, htmlElement = htmlElement, sender = sender)
  
    __obj.asInstanceOf[AppointmentClickEventArgs]
  }
}

