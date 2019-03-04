package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the AppointmentDoubleClick events.
  */
trait AppointmentClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the client appointment ID for the appointment being clicked.
    * Value: A string, representing the client ID of the appointment.
    */
  var appointmentId: java.lang.String
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    * Value: true if no default processing is required; otherwise, false.
    */
  var handled: scala.Boolean
  /**
    * Gets the HTML element that the event was triggered on.
    * Value: An object containing event data.
    */
  var htmlElement: js.Object
}

object AppointmentClickEventArgs {
  @scala.inline
  def apply(appointmentId: java.lang.String, handled: scala.Boolean, htmlElement: js.Object): AppointmentClickEventArgs = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId, handled = handled, htmlElement = htmlElement)
  
    __obj.asInstanceOf[AppointmentClickEventArgs]
  }
}

