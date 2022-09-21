package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentDeleting event.
  */
@JSGlobal("ASPxClientAppointmentDeletingEventArgs")
@js.native
open class ASPxClientAppointmentDeletingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientAppointmentDeletingEventArgs {
  /**
    * Creates an ASPxClientAppointmentDeletingEventArgs instance with the specified client appointments.
    * @param appointments An array of ASPxClientAppointment objects.
    */
  def this(appointments: js.Array[typings.devexpressWeb.ASPxClientAppointment]) = this()
  
  /**
    * Gets client IDs of the appointments to be removed.
    */
  /* CompleteClass */
  var appointmentIds: js.Array[String] = js.native
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
}
