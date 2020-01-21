package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentDeleting event.
  */
@JSGlobal("ASPxClientAppointmentDeletingEventArgs")
@js.native
class ASPxClientAppointmentDeletingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Creates an ASPxClientAppointmentDeletingEventArgs instance with the specified client appointments.
    * @param appointments An array of ASPxClientAppointment objects.
    */
  def this(appointments: js.Array[ASPxClientAppointment]) = this()
  /**
    * Gets client IDs of the appointments to be removed.
    */
  var appointmentIds: js.Array[String] = js.native
}

