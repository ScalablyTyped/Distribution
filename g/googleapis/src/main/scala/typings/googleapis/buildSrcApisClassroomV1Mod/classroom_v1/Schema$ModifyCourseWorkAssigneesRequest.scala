package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to modify assignee mode and options of a coursework.
  */
@js.native
trait Schema$ModifyCourseWorkAssigneesRequest extends js.Object {
  /**
    * Mode of the coursework describing whether it will be assigned to all
    * students or specified individual students.
    */
  var assigneeMode: js.UndefOr[String] = js.native
  /**
    * Set which students are assigned or not assigned to the coursework. Must
    * be specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    */
  var modifyIndividualStudentsOptions: js.UndefOr[Schema$ModifyIndividualStudentsOptions] = js.native
}

object Schema$ModifyCourseWorkAssigneesRequest {
  @scala.inline
  def apply(
    assigneeMode: String = null,
    modifyIndividualStudentsOptions: Schema$ModifyIndividualStudentsOptions = null
  ): Schema$ModifyCourseWorkAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    if (assigneeMode != null) __obj.updateDynamic("assigneeMode")(assigneeMode.asInstanceOf[js.Any])
    if (modifyIndividualStudentsOptions != null) __obj.updateDynamic("modifyIndividualStudentsOptions")(modifyIndividualStudentsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ModifyCourseWorkAssigneesRequest]
  }
}

