package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds the information that determines what action types can be performed for appointments.
  */
trait ASPxClientAppointmentFlags extends js.Object {
  /**
    * Gets a value that specifies whether an end-user is allowed to share the schedule time between two or more appointments.
    * Value: true if appointments with the same schedule time are allowed; otherwise, false. Default is true.
    */
  var allowConflicts: scala.Boolean
  /**
    * Gets a value that specifies whether an end-user is allowed to copy appointments.
    * Value: true if a user can copy appointments; otherwise, false. Default is true.
    */
  var allowCopy: scala.Boolean
  /**
    * Gets a value that specifies whether an end-user is allowed to delete appointments.
    * Value: true if an end-user can delete appointments; otherwise, false. Default is true.
    */
  var allowDelete: scala.Boolean
  /**
    * Gets a value that specifies whether an end-user is allowed to drag and drop appointments to another time slot or date.
    * Value: true if the user can drag and drop appointments; otherwise, false.
    */
  var allowDrag: scala.Boolean
  /**
    * Gets a value that specifies whether an end-user is allowed to drag and drop appointments between resources.
    * Value: true if the end-user can drag appointment from one resource to another; otherwise, false.
    */
  var allowDragBetweenResources: scala.Boolean
  /**
    * Gets a value that specifies whether an end-user is allowed to edit appointments.
    * Value: true if the end-user can edit appointments; otherwise, false.
    */
  var allowEdit: scala.Boolean
  /**
    * Gets a value that specifies whether an inplace editor can be activated for an appointment.
    * Value: true if an inplace editor is activated; otherwise, false. Default is true.
    */
  var allowInplaceEditor: scala.Boolean
  /**
    * Gets a value that specifies whether an end-user is allowed to change the time boundaries of appointments.
    * Value: true if appointment resizing is allowed; otherwise, false. Default is true.
    */
  var allowResize: scala.Boolean
}

object ASPxClientAppointmentFlags {
  @scala.inline
  def apply(
    allowConflicts: scala.Boolean,
    allowCopy: scala.Boolean,
    allowDelete: scala.Boolean,
    allowDrag: scala.Boolean,
    allowDragBetweenResources: scala.Boolean,
    allowEdit: scala.Boolean,
    allowInplaceEditor: scala.Boolean,
    allowResize: scala.Boolean
  ): ASPxClientAppointmentFlags = {
    val __obj = js.Dynamic.literal(allowConflicts = allowConflicts, allowCopy = allowCopy, allowDelete = allowDelete, allowDrag = allowDrag, allowDragBetweenResources = allowDragBetweenResources, allowEdit = allowEdit, allowInplaceEditor = allowInplaceEditor, allowResize = allowResize)
  
    __obj.asInstanceOf[ASPxClientAppointmentFlags]
  }
}

