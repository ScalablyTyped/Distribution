package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentDeleting event.
  */
trait ASPxClientAppointmentDeletingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets client IDs of the appointments to be removed.
    */
  var appointmentIds: js.Array[String]
}
object ASPxClientAppointmentDeletingEventArgs {
  
  inline def apply(appointmentIds: js.Array[String], cancel: Boolean): ASPxClientAppointmentDeletingEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDeletingEventArgs]
  }
  
  extension [Self <: ASPxClientAppointmentDeletingEventArgs](x: Self) {
    
    inline def setAppointmentIds(value: js.Array[String]): Self = StObject.set(x, "appointmentIds", value.asInstanceOf[js.Any])
    
    inline def setAppointmentIdsVarargs(value: String*): Self = StObject.set(x, "appointmentIds", js.Array(value*))
  }
}
