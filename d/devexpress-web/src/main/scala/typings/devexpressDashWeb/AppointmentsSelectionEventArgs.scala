package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the AppointmentsSelectionChanged event.
  */
trait AppointmentsSelectionEventArgs extends ASPxClientEventArgs {
  /**
    * Gets identifiers of the selected appointments.
    * Value: A comma separated list of string values, representing appointment IDs.
    */
  var appointmentIds: js.Array[String]
}

object AppointmentsSelectionEventArgs {
  @scala.inline
  def apply(appointmentIds: js.Array[String]): AppointmentsSelectionEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds)
  
    __obj.asInstanceOf[AppointmentsSelectionEventArgs]
  }
}

