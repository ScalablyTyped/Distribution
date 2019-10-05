package typings.gapiDotClientDotClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Student extends js.Object {
  /**
    * Identifier of the course.
    *
    * Read-only.
    */
  var courseId: js.UndefOr[String] = js.undefined
  /**
    * Global user information for the student.
    *
    * Read-only.
    */
  var profile: js.UndefOr[UserProfile] = js.undefined
  /**
    * Information about a Drive Folder for this student's work in this course.
    * Only visible to the student and domain administrators.
    *
    * Read-only.
    */
  var studentWorkFolder: js.UndefOr[DriveFolder] = js.undefined
  /**
    * Identifier of the user.
    *
    * When specified as a parameter of a request, this identifier can be one of
    * the following:
    *
    * &#42; the numeric identifier for the user
    * &#42; the email address of the user
    * &#42; the string literal `"me"`, indicating the requesting user
    */
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
    if (courseId != null) __obj.updateDynamic("courseId")(courseId)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (studentWorkFolder != null) __obj.updateDynamic("studentWorkFolder")(studentWorkFolder)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[Student]
  }
}

