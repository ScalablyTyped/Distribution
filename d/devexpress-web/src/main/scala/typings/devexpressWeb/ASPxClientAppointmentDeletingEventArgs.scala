package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentDeleting event.
  */
@js.native
trait ASPxClientAppointmentDeletingEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets client IDs of the appointments to be removed.
    */
  var appointmentIds: js.Array[String] = js.native
}
object ASPxClientAppointmentDeletingEventArgs {
  
  @scala.inline
  def apply(appointmentIds: js.Array[String], cancel: Boolean): ASPxClientAppointmentDeletingEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDeletingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientAppointmentDeletingEventArgsMutableBuilder[Self <: ASPxClientAppointmentDeletingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentIds(value: js.Array[String]): Self = StObject.set(x, "appointmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentIdsVarargs(value: String*): Self = StObject.set(x, "appointmentIds", js.Array(value :_*))
  }
}
