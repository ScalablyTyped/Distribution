package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Student in a course.
  */
@js.native
trait Schema$Student extends js.Object {
  /**
    * Identifier of the course.  Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  /**
    * Global user information for the student.  Read-only.
    */
  var profile: js.UndefOr[Schema$UserProfile] = js.native
  /**
    * Information about a Drive Folder for this student&#39;s work in this
    * course. Only visible to the student and domain administrators. Read-only.
    */
  var studentWorkFolder: js.UndefOr[Schema$DriveFolder] = js.native
  /**
    * Identifier of the user.  When specified as a parameter of a request, this
    * identifier can be one of the following:  * the numeric identifier for the
    * user * the email address of the user * the string literal
    * `&quot;me&quot;`, indicating the requesting user
    */
  var userId: js.UndefOr[String] = js.native
}

object Schema$Student {
  @scala.inline
  def apply(
    courseId: String = null,
    profile: Schema$UserProfile = null,
    studentWorkFolder: Schema$DriveFolder = null,
    userId: String = null
  ): Schema$Student = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (studentWorkFolder != null) __obj.updateDynamic("studentWorkFolder")(studentWorkFolder.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Student]
  }
}

