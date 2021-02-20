package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentToolTipShowing event.
  */
@js.native
trait ASPxClientAppointmentToolTipShowingEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the appointment.
    */
  var appointment: ASPxClientAppointment = js.native
}
object ASPxClientAppointmentToolTipShowingEventArgs {
  
  @scala.inline
  def apply(appointment: ASPxClientAppointment, cancel: Boolean): ASPxClientAppointmentToolTipShowingEventArgs = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentToolTipShowingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientAppointmentToolTipShowingEventArgsMutableBuilder[Self <: ASPxClientAppointmentToolTipShowingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointment(value: ASPxClientAppointment): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
  }
}
