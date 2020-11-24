package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds the information that determines what action types can be performed for appointments.
  */
@js.native
trait ASPxClientAppointmentFlags extends js.Object {
  
  /**
    * Gets a value that specifies whether an end-user is allowed to share the schedule time between two or more appointments.
    */
  var allowConflicts: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an end-user is allowed to copy appointments.
    */
  var allowCopy: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an end-user is allowed to delete appointments.
    */
  var allowDelete: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an end-user is allowed to drag and drop appointments to another time slot or date.
    */
  var allowDrag: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an end-user is allowed to drag and drop appointments between resources.
    */
  var allowDragBetweenResources: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an end-user is allowed to edit appointments.
    */
  var allowEdit: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an inplace editor can be activated for an appointment.
    */
  var allowInplaceEditor: Boolean = js.native
  
  /**
    * Gets a value that specifies whether an end-user is allowed to change the time boundaries of appointments.
    */
  var allowResize: Boolean = js.native
}
object ASPxClientAppointmentFlags {
  
  @scala.inline
  def apply(
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
  implicit class ASPxClientAppointmentFlagsOps[Self <: ASPxClientAppointmentFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowConflicts(value: Boolean): Self = this.set("allowConflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCopy(value: Boolean): Self = this.set("allowCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDelete(value: Boolean): Self = this.set("allowDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDrag(value: Boolean): Self = this.set("allowDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDragBetweenResources(value: Boolean): Self = this.set("allowDragBetweenResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEdit(value: Boolean): Self = this.set("allowEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInplaceEditor(value: Boolean): Self = this.set("allowInplaceEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowResize(value: Boolean): Self = this.set("allowResize", value.asInstanceOf[js.Any])
  }
}
