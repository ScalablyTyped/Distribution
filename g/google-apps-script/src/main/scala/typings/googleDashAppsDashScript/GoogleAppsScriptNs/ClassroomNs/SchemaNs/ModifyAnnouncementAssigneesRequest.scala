package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyAnnouncementAssigneesRequest extends js.Object {
  var assigneeMode: js.UndefOr[String] = js.undefined
  var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.undefined
}

object ModifyAnnouncementAssigneesRequest {
  @scala.inline
  def apply(
    assigneeMode: String = null,
    modifyIndividualStudentsOptions: ModifyIndividualStudentsOptions = null
  ): ModifyAnnouncementAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    if (assigneeMode != null) __obj.updateDynamic("assigneeMode")(assigneeMode)
    if (modifyIndividualStudentsOptions != null) __obj.updateDynamic("modifyIndividualStudentsOptions")(modifyIndividualStudentsOptions)
    __obj.asInstanceOf[ModifyAnnouncementAssigneesRequest]
  }
}

