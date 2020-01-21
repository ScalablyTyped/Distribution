package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds the information that determines what action types can be performed for appointments.
  */
@JSGlobal("ASPxClientAppointmentFlags")
@js.native
class ASPxClientAppointmentFlags () extends js.Object {
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

