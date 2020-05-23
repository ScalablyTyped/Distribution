package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentDeleting event.
  */
trait ASPxClientAppointmentDeletingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets client IDs of the appointments to be removed.
    */
  var appointmentIds: js.Array[String]
}

object ASPxClientAppointmentDeletingEventArgs {
  @scala.inline
  def apply(appointmentIds: js.Array[String], cancel: Boolean): ASPxClientAppointmentDeletingEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDeletingEventArgs]
  }
}

