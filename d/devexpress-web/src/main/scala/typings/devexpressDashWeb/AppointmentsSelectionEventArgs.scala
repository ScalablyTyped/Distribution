package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentsSelectionChanged event.
  */
@JSGlobal("AppointmentsSelectionEventArgs")
@js.native
class AppointmentsSelectionEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the class.
    * @param appointmentIds Represents an array of appointments' IDs.
    */
  def this(appointmentIds: js.Array[String]) = this()
  /**
    * Gets identifiers of the selected appointments.
    */
  var appointmentIds: js.Array[String] = js.native
}

