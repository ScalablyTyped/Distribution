package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Student extends js.Object {
  var courseId: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[UserProfile] = js.undefined
  var studentWorkFolder: js.UndefOr[DriveFolder] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object Student {
  @scala.inline
  def apply(
    courseId: String = null,
    profile: UserProfile = null,
    studentWorkFolder: DriveFolder = null,
    userId: String = null
  ): Student = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (studentWorkFolder != null) __obj.updateDynamic("studentWorkFolder")(studentWorkFolder.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Student]
  }
}

