package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentToolTipShowing event.
  */
@JSGlobal("ASPxClientAppointmentToolTipShowingEventArgs")
@js.native
class ASPxClientAppointmentToolTipShowingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientAppointmentToolTipShowingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentToolTipShowingEventArgs class.
    * @param appointment An ASPxClientAppointment object representing the appointment.
    */
  def this(appointment: typings.devexpressWeb.ASPxClientAppointment) = this()
  
  /**
    * Gets the appointment.
    */
  /* CompleteClass */
  var appointment: typings.devexpressWeb.ASPxClientAppointment = js.native
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
}
