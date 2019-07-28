package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the AppointmentDeleting event.
  */
trait ASPxClientAppointmentDeletingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets client IDs of the appointments to be removed.
    * Value: An array of client appointment identifiers, representing appointments passed for deletion.
    */
  var appointmentIds: js.Array[String]
}

object ASPxClientAppointmentDeletingEventArgs {
  @scala.inline
  def apply(appointmentIds: js.Array[String], cancel: Boolean): ASPxClientAppointmentDeletingEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds, cancel = cancel)
  
    __obj.asInstanceOf[ASPxClientAppointmentDeletingEventArgs]
  }
}

