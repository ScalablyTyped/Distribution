package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentToolTipShowing event.
  */
@JSGlobal("ASPxClientAppointmentToolTipShowingEventArgs")
@js.native
class ASPxClientAppointmentToolTipShowingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentToolTipShowingEventArgs class.
    * @param appointment An ASPxClientAppointment object representing the appointment.
    */
  def this(appointment: ASPxClientAppointment) = this()
  /**
    * Gets the appointment.
    */
  var appointment: ASPxClientAppointment = js.native
}

