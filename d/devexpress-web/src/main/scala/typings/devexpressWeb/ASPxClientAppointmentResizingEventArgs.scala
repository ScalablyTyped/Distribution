package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentResizing event.
  */
@js.native
trait ASPxClientAppointmentResizingEventArgs extends ASPxClientEventArgs {
  
  /**
    * Specifies whether or not an appointment can be resized to the new time interval.
    */
  var allow: Boolean = js.native
  
  /**
    * Gets the resized appointment's identifier.
    */
  var appointmentId: String = js.native
  
  /**
    * Gets a mouse event object related to the current appointment resizing operation.
    */
  var mouseEvent: js.Any = js.native
  
  /**
    * Gets the appointment's interval after resizing.
    */
  var newInterval: ASPxClientTimeInterval = js.native
  
  /**
    * Gets the appointment's interval before resizing.
    */
  var oldInterval: ASPxClientTimeInterval = js.native
}
object ASPxClientAppointmentResizingEventArgs {
  
  @scala.inline
  def apply(
    allow: Boolean,
    appointmentId: String,
    mouseEvent: js.Any,
    newInterval: ASPxClientTimeInterval,
    oldInterval: ASPxClientTimeInterval
  ): ASPxClientAppointmentResizingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], appointmentId = appointmentId.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentResizingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientAppointmentResizingEventArgsOps[Self <: ASPxClientAppointmentResizingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setAllow(value: Boolean): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentId(value: String): Self = this.set("appointmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEvent(value: js.Any): Self = this.set("mouseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewInterval(value: ASPxClientTimeInterval): Self = this.set("newInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldInterval(value: ASPxClientTimeInterval): Self = this.set("oldInterval", value.asInstanceOf[js.Any])
  }
}
