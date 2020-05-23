package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentToolTipShowing event.
  */
trait ASPxClientAppointmentToolTipShowingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the appointment.
    */
  var appointment: ASPxClientAppointment
}

object ASPxClientAppointmentToolTipShowingEventArgs {
  @scala.inline
  def apply(appointment: ASPxClientAppointment, cancel: Boolean): ASPxClientAppointmentToolTipShowingEventArgs = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentToolTipShowingEventArgs]
  }
}

