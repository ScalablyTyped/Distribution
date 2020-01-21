package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyIndividualStudentsOptions extends js.Object {
  /**
    * Ids of students to be added as having access to this
    * coursework/announcement.
    */
  var addStudentIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Ids of students to be removed from having access to this
    * coursework/announcement.
    */
  var removeStudentIds: js.UndefOr[js.Array[String]] = js.undefined
}

object ModifyIndividualStudentsOptions {
  @scala.inline
  def apply(addStudentIds: js.Array[String] = null, removeStudentIds: js.Array[String] = null): ModifyIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    if (addStudentIds != null) __obj.updateDynamic("addStudentIds")(addStudentIds.asInstanceOf[js.Any])
    if (removeStudentIds != null) __obj.updateDynamic("removeStudentIds")(removeStudentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyIndividualStudentsOptions]
  }
}

