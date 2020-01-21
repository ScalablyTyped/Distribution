package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains fields to add or remove students from a course work or
  * announcement where the `assigneeMode` is set to `INDIVIDUAL_STUDENTS`.
  */
@js.native
trait SchemaModifyIndividualStudentsOptions extends js.Object {
  /**
    * Ids of students to be added as having access to this
    * coursework/announcement.
    */
  var addStudentIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Ids of students to be removed from having access to this
    * coursework/announcement.
    */
  var removeStudentIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyIndividualStudentsOptions {
  @scala.inline
  def apply(addStudentIds: js.Array[String] = null, removeStudentIds: js.Array[String] = null): SchemaModifyIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    if (addStudentIds != null) __obj.updateDynamic("addStudentIds")(addStudentIds.asInstanceOf[js.Any])
    if (removeStudentIds != null) __obj.updateDynamic("removeStudentIds")(removeStudentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModifyIndividualStudentsOptions]
  }
}

