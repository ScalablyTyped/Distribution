package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentToolTipShowing event.
  */
@js.native
trait ASPxClientAppointmentToolTipShowingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the appointment.
    */
  var appointment: ASPxClientAppointment = js.native
}

object ASPxClientAppointmentToolTipShowingEventArgs {
  @scala.inline
  def apply(appointment: ASPxClientAppointment, cancel: Boolean): ASPxClientAppointmentToolTipShowingEventArgs = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentToolTipShowingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientAppointmentToolTipShowingEventArgsOps[Self <: ASPxClientAppointmentToolTipShowingEventArgs] (val x: Self) extends AnyVal {
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
    def setAppointment(value: ASPxClientAppointment): Self = this.set("appointment", value.asInstanceOf[js.Any])
  }
  
}

