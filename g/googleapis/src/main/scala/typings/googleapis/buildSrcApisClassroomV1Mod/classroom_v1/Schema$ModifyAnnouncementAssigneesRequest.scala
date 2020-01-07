package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to modify assignee mode and options of an announcement.
  */
@js.native
trait Schema$ModifyAnnouncementAssigneesRequest extends js.Object {
  /**
    * Mode of the announcement describing whether it will be accessible by all
    * students or specified individual students.
    */
  var assigneeMode: js.UndefOr[String] = js.native
  /**
    * Set which students can view or cannot view the announcement. Must be
    * specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    */
  var modifyIndividualStudentsOptions: js.UndefOr[Schema$ModifyIndividualStudentsOptions] = js.native
}

object Schema$ModifyAnnouncementAssigneesRequest {
  @scala.inline
  def apply(
    assigneeMode: String = null,
    modifyIndividualStudentsOptions: Schema$ModifyIndividualStudentsOptions = null
  ): Schema$ModifyAnnouncementAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    if (assigneeMode != null) __obj.updateDynamic("assigneeMode")(assigneeMode.asInstanceOf[js.Any])
    if (modifyIndividualStudentsOptions != null) __obj.updateDynamic("modifyIndividualStudentsOptions")(modifyIndividualStudentsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ModifyAnnouncementAssigneesRequest]
  }
}

