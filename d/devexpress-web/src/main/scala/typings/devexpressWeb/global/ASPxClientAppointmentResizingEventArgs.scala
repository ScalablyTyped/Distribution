package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentResizing event.
  */
@JSGlobal("ASPxClientAppointmentResizingEventArgs")
@js.native
open class ASPxClientAppointmentResizingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientAppointmentResizingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentResizingEventArgs class.
    * @param mouseEvent A mouse event object related to the resizing operation.
    * @param appointmentId A string containing an appointment identifier.
    * @param oldInterval An  object specifying the appointment's interval before the resize operation.
    * @param newInterval An  object specifying the appointment's interval after the resize operation.
    */
  def this(
    mouseEvent: Any,
    appointmentId: String,
    oldInterval: typings.devexpressWeb.ASPxClientTimeInterval,
    newInterval: typings.devexpressWeb.ASPxClientTimeInterval
  ) = this()
  
  /**
    * Specifies whether or not an appointment can be resized to the new time interval.
    */
  /* CompleteClass */
  var allow: Boolean = js.native
  
  /**
    * Gets the resized appointment's identifier.
    */
  /* CompleteClass */
  var appointmentId: String = js.native
  
  /**
    * Gets a mouse event object related to the current appointment resizing operation.
    */
  /* CompleteClass */
  var mouseEvent: Any = js.native
  
  /**
    * Gets the appointment's interval after resizing.
    */
  /* CompleteClass */
  var newInterval: typings.devexpressWeb.ASPxClientTimeInterval = js.native
  
  /**
    * Gets the appointment's interval before resizing.
    */
  /* CompleteClass */
  var oldInterval: typings.devexpressWeb.ASPxClientTimeInterval = js.native
}
