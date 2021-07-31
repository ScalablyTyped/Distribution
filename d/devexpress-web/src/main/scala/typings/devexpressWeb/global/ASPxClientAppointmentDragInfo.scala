package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores information about an appointment drag operation.
  */
@JSGlobal("ASPxClientAppointmentDragInfo")
@js.native
class ASPxClientAppointmentDragInfo protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientAppointmentDragInfo {
  /**
    * Initializes a new instance of the ASPxClientAppointmentDragInfo class.
    * @param appointmentId A string containing an appointment identifier.
    * @param oldInterval An ASPxClientTimeInterval object specifying the appointment's interval before the drag operation.
    * @param oldResources A array of strings containing identifiers of resources that were associated with the appointment before the drag operation.
    * @param newInterval An ASPxClientTimeInterval object specifying the appointment's interval after the drag operation.
    * @param newResources A array of strings containing identifiers of resources associated with the appointment after the drag operation.
    */
  def this(
    appointmentId: String,
    oldInterval: typings.devexpressWeb.ASPxClientTimeInterval,
    oldResources: js.Array[String],
    newInterval: typings.devexpressWeb.ASPxClientTimeInterval,
    newResources: js.Array[String]
  ) = this()
  
  /**
    * Gets the dragged appointment's identifier.
    */
  /* CompleteClass */
  var appointmentId: String = js.native
  
  /**
    * Gets the appointment's interval after the drag operation.
    */
  /* CompleteClass */
  var newInterval: typings.devexpressWeb.ASPxClientTimeInterval = js.native
  
  /**
    * Gets resources associated with the appointment after the drag operation.
    */
  /* CompleteClass */
  var newResources: js.Array[String] = js.native
  
  /**
    * Gets the appointment's interval before the drag operation.
    */
  /* CompleteClass */
  var oldInterval: typings.devexpressWeb.ASPxClientTimeInterval = js.native
  
  /**
    * Gets resources that were associated with the appointment before the drag operation.
    */
  /* CompleteClass */
  var oldResources: js.Array[String] = js.native
}
