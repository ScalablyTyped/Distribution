package typings
package devexpressDashWebLib

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
  var appointmentIds: js.Array[java.lang.String]
}

object ASPxClientAppointmentDeletingEventArgs {
  @scala.inline
  def apply(appointmentIds: js.Array[java.lang.String], cancel: scala.Boolean): ASPxClientAppointmentDeletingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appointmentIds")(appointmentIds)
    __obj.updateDynamic("cancel")(cancel)
    __obj.asInstanceOf[ASPxClientAppointmentDeletingEventArgs]
  }
}

