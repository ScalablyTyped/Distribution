package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentClick and the ASPxClientScheduler.AppointmentDoubleClick events.
  */
@js.native
trait AppointmentClickEventArgs extends ASPxClientEventArgs {
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

object AppointmentClickEventArgs {
  @scala.inline
  def apply(appointmentId: String, handled: Boolean, htmlElement: js.Any): AppointmentClickEventArgs = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentClickEventArgs]
  }
  @scala.inline
  implicit class AppointmentClickEventArgsOps[Self <: AppointmentClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppointmentId(value: String): Self = this.set("appointmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlElement(value: js.Any): Self = this.set("htmlElement", value.asInstanceOf[js.Any])
  }
  
}

