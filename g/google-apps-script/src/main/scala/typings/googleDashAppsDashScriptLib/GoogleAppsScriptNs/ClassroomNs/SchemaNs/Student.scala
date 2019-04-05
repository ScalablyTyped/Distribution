package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Student extends js.Object {
  var courseId: js.UndefOr[java.lang.String] = js.undefined
  var profile: js.UndefOr[UserProfile] = js.undefined
  var studentWorkFolder: js.UndefOr[DriveFolder] = js.undefined
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object Student {
  @scala.inline
  def apply(
    courseId: java.lang.String = null,
    profile: UserProfile = null,
    studentWorkFolder: DriveFolder = null,
    userId: java.lang.String = null
  ): Student = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (studentWorkFolder != null) __obj.updateDynamic("studentWorkFolder")(studentWorkFolder)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[Student]
  }
}

