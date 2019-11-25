package typings.gapiDotClientDotClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyAnnouncementAssigneesRequest extends js.Object {
  /**
    * Mode of the announcement describing whether it will be accessible by all
    * students or specified individual students.
    */
  var assigneeMode: js.UndefOr[String] = js.undefined
  /**
    * Set which students can view or cannot view the announcement.
    * Must be specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    */
  var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.undefined
}

object ModifyAnnouncementAssigneesRequest {
  @scala.inline
  def apply(
    assigneeMode: String = null,
    modifyIndividualStudentsOptions: ModifyIndividualStudentsOptions = null
  ): ModifyAnnouncementAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    if (assigneeMode != null) __obj.updateDynamic("assigneeMode")(assigneeMode.asInstanceOf[js.Any])
    if (modifyIndividualStudentsOptions != null) __obj.updateDynamic("modifyIndividualStudentsOptions")(modifyIndividualStudentsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyAnnouncementAssigneesRequest]
  }
}

