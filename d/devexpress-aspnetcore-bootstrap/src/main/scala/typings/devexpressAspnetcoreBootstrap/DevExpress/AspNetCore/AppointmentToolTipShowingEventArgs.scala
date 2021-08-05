package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentToolTipShowingEventArgs
  extends StObject
     with CancelEventArgs {
  
  val appointment: BootstrapSchedulerAppointment
}
object AppointmentToolTipShowingEventArgs {
  
  inline def apply(appointment: BootstrapSchedulerAppointment, cancel: Boolean, sender: Control): AppointmentToolTipShowingEventArgs = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentToolTipShowingEventArgs]
  }
  
  extension [Self <: AppointmentToolTipShowingEventArgs](x: Self) {
    
    inline def setAppointment(value: BootstrapSchedulerAppointment): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
  }
}
