package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentToolTipShowing event.
  */
trait ASPxClientAppointmentToolTipShowingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the appointment.
    */
  var appointment: ASPxClientAppointment
}
object ASPxClientAppointmentToolTipShowingEventArgs {
  
  inline def apply(appointment: ASPxClientAppointment, cancel: Boolean): ASPxClientAppointmentToolTipShowingEventArgs = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentToolTipShowingEventArgs]
  }
  
  extension [Self <: ASPxClientAppointmentToolTipShowingEventArgs](x: Self) {
    
    inline def setAppointment(value: ASPxClientAppointment): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
  }
}
