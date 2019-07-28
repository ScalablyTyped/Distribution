package typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyCourseWorkAssigneesRequest extends js.Object {
  /**
    * Mode of the coursework describing whether it will be assigned to all
    * students or specified individual students.
    */
  var assigneeMode: js.UndefOr[String] = js.undefined
  /**
    * Set which students are assigned or not assigned to the coursework.
    * Must be specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    */
  var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.undefined
}

object ModifyCourseWorkAssigneesRequest {
  @scala.inline
  def apply(
    assigneeMode: String = null,
    modifyIndividualStudentsOptions: ModifyIndividualStudentsOptions = null
  ): ModifyCourseWorkAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    if (assigneeMode != null) __obj.updateDynamic("assigneeMode")(assigneeMode)
    if (modifyIndividualStudentsOptions != null) __obj.updateDynamic("modifyIndividualStudentsOptions")(modifyIndividualStudentsOptions)
    __obj.asInstanceOf[ModifyCourseWorkAssigneesRequest]
  }
}

