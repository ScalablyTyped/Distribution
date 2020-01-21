package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentClick and the ASPxClientScheduler.AppointmentDoubleClick events.
  */
@JSGlobal("AppointmentClickEventArgs")
@js.native
class AppointmentClickEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the class.
    * @param appointmentId Specifies an appointment ID.
    * @param sourceEvent Specifies an event source.
    */
  def this(appointmentId: String, sourceEvent: js.Any) = this()
  /**
    * Gets the client appointment ID for the appointment being clicked.
    */
  var appointmentId: String = js.native
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    */
  var handled: Boolean = js.native
  /**
    * Gets the HTML element that the event was triggered on.
    */
  var htmlElement: js.Any = js.native
}

