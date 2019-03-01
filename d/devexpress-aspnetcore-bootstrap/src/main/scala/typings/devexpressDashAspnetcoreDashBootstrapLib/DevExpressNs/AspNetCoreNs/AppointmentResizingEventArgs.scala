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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allow")(allow)
    __obj.updateDynamic("appointmentId")(appointmentId)
    __obj.updateDynamic("mouseEvent")(mouseEvent)
    __obj.updateDynamic("newInterval")(newInterval)
    __obj.updateDynamic("oldInterval")(oldInterval)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[AppointmentResizingEventArgs]
  }
}

