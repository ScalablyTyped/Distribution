package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentToolTipShowingEventArgs extends CancelEventArgs {
  val appointment: BootstrapSchedulerAppointment
}

object AppointmentToolTipShowingEventArgs {
  @scala.inline
  def apply(appointment: BootstrapSchedulerAppointment, cancel: Boolean, sender: Control): AppointmentToolTipShowingEventArgs = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentToolTipShowingEventArgs]
  }
}

