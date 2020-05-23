package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentsSelectionChanged event.
  */
trait AppointmentsSelectionEventArgs extends ASPxClientEventArgs {
  /**
    * Gets identifiers of the selected appointments.
    */
  var appointmentIds: js.Array[String]
}

object AppointmentsSelectionEventArgs {
  @scala.inline
  def apply(appointmentIds: js.Array[String]): AppointmentsSelectionEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentsSelectionEventArgs]
  }
}

