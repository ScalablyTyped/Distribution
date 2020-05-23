package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentClick and the ASPxClientScheduler.AppointmentDoubleClick events.
  */
trait AppointmentClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the client appointment ID for the appointment being clicked.
    */
  var appointmentId: String
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    */
  var handled: Boolean
  /**
    * Gets the HTML element that the event was triggered on.
    */
  var htmlElement: js.Any
}

object AppointmentClickEventArgs {
  @scala.inline
  def apply(appointmentId: String, handled: Boolean, htmlElement: js.Any): AppointmentClickEventArgs = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentClickEventArgs]
  }
}

