package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the AppointmentToolTipShowing event.
  */
trait ASPxClientAppointmentToolTipShowingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the appointment.
    * Value: An ASPxClientAppointment object representing the appointment.
    */
  var appointment: ASPxClientAppointment
}

object ASPxClientAppointmentToolTipShowingEventArgs {
  @scala.inline
  def apply(appointment: ASPxClientAppointment, cancel: Boolean): ASPxClientAppointmentToolTipShowingEventArgs = {
    val __obj = js.Dynamic.literal(appointment = appointment, cancel = cancel)
  
    __obj.asInstanceOf[ASPxClientAppointmentToolTipShowingEventArgs]
  }
}

