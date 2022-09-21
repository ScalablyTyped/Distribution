package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentsSelectionChanged event.
  */
@JSGlobal("AppointmentsSelectionEventArgs")
@js.native
open class AppointmentsSelectionEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.AppointmentsSelectionEventArgs {
  /**
    * Initializes a new instance of the class.
    * @param appointmentIds Represents an array of appointments' IDs.
    */
  def this(appointmentIds: js.Array[String]) = this()
  
  /**
    * Gets identifiers of the selected appointments.
    */
  /* CompleteClass */
  var appointmentIds: js.Array[String] = js.native
}
