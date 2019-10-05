package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentToolTipShowingEventArgs extends CancelEventArgs {
  val appointment: BootstrapSchedulerAppointment
}

object AppointmentToolTipShowingEventArgs {
  @scala.inline
  def apply(appointment: BootstrapSchedulerAppointment, cancel: Boolean, sender: Control): AppointmentToolTipShowingEventArgs = {
    val __obj = js.Dynamic.literal(appointment = appointment, cancel = cancel, sender = sender)
  
    __obj.asInstanceOf[AppointmentToolTipShowingEventArgs]
  }
}

