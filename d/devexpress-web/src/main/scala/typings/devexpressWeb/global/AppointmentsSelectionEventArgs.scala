package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentsSelectionChanged event.
  */
@JSGlobal("AppointmentsSelectionEventArgs")
@js.native
class AppointmentsSelectionEventArgs protected ()
  extends typings.devexpressWeb.AppointmentsSelectionEventArgs {
  /**
    * Initializes a new instance of the class.
    * @param appointmentIds Represents an array of appointments' IDs.
    */
  def this(appointmentIds: js.Array[String]) = this()
  /**
    * Gets identifiers of the selected appointments.
    */
  /* CompleteClass */
  override var appointmentIds: js.Array[String] = js.native
}

