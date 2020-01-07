package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Assignee details about a coursework/announcement. This field is set if and
  * only if `assigneeMode` is `INDIVIDUAL_STUDENTS`.
  */
@js.native
trait Schema$IndividualStudentsOptions extends js.Object {
  /**
    * Identifiers for the students that have access to the
    * coursework/announcement.
    */
  var studentIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$IndividualStudentsOptions {
  @scala.inline
  def apply(studentIds: js.Array[String] = null): Schema$IndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    if (studentIds != null) __obj.updateDynamic("studentIds")(studentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IndividualStudentsOptions]
  }
}

