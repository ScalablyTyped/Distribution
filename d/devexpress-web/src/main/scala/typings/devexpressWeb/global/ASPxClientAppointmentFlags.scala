package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds the information that determines what action types can be performed for appointments.
  */
@JSGlobal("ASPxClientAppointmentFlags")
@js.native
open class ASPxClientAppointmentFlags ()
  extends StObject
     with typings.devexpressWeb.ASPxClientAppointmentFlags {
  
  /**
    * Gets a value that specifies whether an end-user is allowed to share the schedule time between two or more appointments.
    */
  /* CompleteClass */
  var allowConflicts: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an end-user is allowed to copy appointments.
    */
  /* CompleteClass */
  var allowCopy: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an end-user is allowed to delete appointments.
    */
  /* CompleteClass */
  var allowDelete: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an end-user is allowed to drag and drop appointments to another time slot or date.
    */
  /* CompleteClass */
  var allowDrag: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an end-user is allowed to drag and drop appointments between resources.
    */
  /* CompleteClass */
  var allowDragBetweenResources: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an end-user is allowed to edit appointments.
    */
  /* CompleteClass */
  var allowEdit: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an inplace editor can be activated for an appointment.
    */
  /* CompleteClass */
  var allowInplaceEditor: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an end-user is allowed to change the time boundaries of appointments.
    */
  /* CompleteClass */
  var allowResize: Boolean = js.native
}
