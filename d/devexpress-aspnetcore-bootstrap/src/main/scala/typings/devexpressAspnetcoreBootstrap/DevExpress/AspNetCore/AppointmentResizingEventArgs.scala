package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentResizingEventArgs extends EventArgs {
  
  var allow: Boolean = js.native
  
  val appointmentId: String = js.native
  
  val mouseEvent: js.Any = js.native
  
  val newInterval: BootstrapTimeInterval = js.native
  
  val oldInterval: BootstrapTimeInterval = js.native
}
object AppointmentResizingEventArgs {
  
  @scala.inline
  def apply(
    allow: Boolean,
    appointmentId: String,
    mouseEvent: js.Any,
    newInterval: BootstrapTimeInterval,
    oldInterval: BootstrapTimeInterval,
    sender: Control
  ): AppointmentResizingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], appointmentId = appointmentId.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentResizingEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentResizingEventArgsMutableBuilder[Self <: AppointmentResizingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEvent(value: js.Any): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "newInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "oldInterval", value.asInstanceOf[js.Any])
  }
}
