package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds the information that determines what action types can be performed for appointments.
  */
trait ASPxClientAppointmentFlags extends js.Object {
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
}

