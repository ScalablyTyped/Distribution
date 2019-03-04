package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentResizingEventArgs extends EventArgs {
  var allow: scala.Boolean
  val appointmentId: java.lang.String
  val mouseEvent: js.Any
  val newInterval: BootstrapTimeInterval
  val oldInterval: BootstrapTimeInterval
}

object AppointmentResizingEventArgs {
  @scala.inline
  def apply(
    allow: scala.Boolean,
    appointmentId: java.lang.String,
    mouseEvent: js.Any,
    newInterval: BootstrapTimeInterval,
    oldInterval: BootstrapTimeInterval,
    sender: Control
  ): AppointmentResizingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow, appointmentId = appointmentId, mouseEvent = mouseEvent, newInterval = newInterval, oldInterval = oldInterval, sender = sender)
  
    __obj.asInstanceOf[AppointmentResizingEventArgs]
  }
}

