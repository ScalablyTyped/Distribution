package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds the information that determines what action types can be performed for appointments.
  */
@JSGlobal("ASPxClientAppointmentFlags")
@js.native
class ASPxClientAppointmentFlags ()
  extends typings.devexpressWeb.ASPxClientAppointmentFlags {
  /**
    * Gets a value that specifies whether an end-user is allowed to share the schedule time between two or more appointments.
    */
  /* CompleteClass */
  override var allowConflicts: Boolean = js.native
  /**
    * Gets a value that specifies whether an end-user is allowed to copy appointments.
    */
  /* CompleteClass */
  override var allowCopy: Boolean = js.native
  /**
    * Gets a value that specifies whether an end-user is allowed to delete appointments.
    */
  /* CompleteClass */
  override var allowDelete: Boolean = js.native
  /**
    * Gets a value that specifies whether an end-user is allowed to drag and drop appointments to another time slot or date.
    */
  /* CompleteClass */
  override var allowDrag: Boolean = js.native
  /**
    * Gets a value that specifies whether an end-user is allowed to drag and drop appointments between resources.
    */
  /* CompleteClass */
  override var allowDragBetweenResources: Boolean = js.native
  /**
    * Gets a value that specifies whether an end-user is allowed to edit appointments.
    */
  /* CompleteClass */
  override var allowEdit: Boolean = js.native
  /**
    * Gets a value that specifies whether an inplace editor can be activated for an appointment.
    */
  /* CompleteClass */
  override var allowInplaceEditor: Boolean = js.native
  /**
    * Gets a value that specifies whether an end-user is allowed to change the time boundaries of appointments.
    */
  /* CompleteClass */
  override var allowResize: Boolean = js.native
}

