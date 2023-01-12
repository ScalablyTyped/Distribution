package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds the information that determines what action types can be performed for appointments.
  */
trait ASPxClientAppointmentFlags extends StObject {
  
  /**
    * Gets a value that specifies whether an end-user is allowed to share the schedule time between two or more appointments.
    */
  var allowConflicts: Boolean
  
  /**
    * Gets a value that specifies whether an end-user is allowed to copy appointments.
    */
  var allowCopy: Boolean
  
  /**
    * Gets a value that specifies whether an end-user is allowed to delete appointments.
    */
  var allowDelete: Boolean
  
  /**
    * Gets a value that specifies whether an end-user is allowed to drag and drop appointments to another time slot or date.
    */
  var allowDrag: Boolean
  
  /**
    * Gets a value that specifies whether an end-user is allowed to drag and drop appointments between resources.
    */
  var allowDragBetweenResources: Boolean
  
  /**
    * Gets a value that specifies whether an end-user is allowed to edit appointments.
    */
  var allowEdit: Boolean
  
  /**
    * Gets a value that specifies whether an inplace editor can be activated for an appointment.
    */
  var allowInplaceEditor: Boolean
  
  /**
    * Gets a value that specifies whether an end-user is allowed to change the time boundaries of appointments.
    */
  var allowResize: Boolean
}
object ASPxClientAppointmentFlags {
  
  inline def apply(
    allowConflicts: Boolean,
    allowCopy: Boolean,
    allowDelete: Boolean,
    allowDrag: Boolean,
    allowDragBetweenResources: Boolean,
    allowEdit: Boolean,
    allowInplaceEditor: Boolean,
    allowResize: Boolean
  ): ASPxClientAppointmentFlags = {
    val __obj = js.Dynamic.literal(allowConflicts = allowConflicts.asInstanceOf[js.Any], allowCopy = allowCopy.asInstanceOf[js.Any], allowDelete = allowDelete.asInstanceOf[js.Any], allowDrag = allowDrag.asInstanceOf[js.Any], allowDragBetweenResources = allowDragBetweenResources.asInstanceOf[js.Any], allowEdit = allowEdit.asInstanceOf[js.Any], allowInplaceEditor = allowInplaceEditor.asInstanceOf[js.Any], allowResize = allowResize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentFlags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientAppointmentFlags] (val x: Self) extends AnyVal {
    
    inline def setAllowConflicts(value: Boolean): Self = StObject.set(x, "allowConflicts", value.asInstanceOf[js.Any])
    
    inline def setAllowCopy(value: Boolean): Self = StObject.set(x, "allowCopy", value.asInstanceOf[js.Any])
    
    inline def setAllowDelete(value: Boolean): Self = StObject.set(x, "allowDelete", value.asInstanceOf[js.Any])
    
    inline def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
    
    inline def setAllowDragBetweenResources(value: Boolean): Self = StObject.set(x, "allowDragBetweenResources", value.asInstanceOf[js.Any])
    
    inline def setAllowEdit(value: Boolean): Self = StObject.set(x, "allowEdit", value.asInstanceOf[js.Any])
    
    inline def setAllowInplaceEditor(value: Boolean): Self = StObject.set(x, "allowInplaceEditor", value.asInstanceOf[js.Any])
    
    inline def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
  }
}
