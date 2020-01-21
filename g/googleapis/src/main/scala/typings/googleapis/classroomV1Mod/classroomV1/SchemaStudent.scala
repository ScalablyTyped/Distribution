package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Student in a course.
  */
@js.native
trait SchemaStudent extends js.Object {
  /**
    * Identifier of the course.  Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  /**
    * Global user information for the student.  Read-only.
    */
  var profile: js.UndefOr[SchemaUserProfile] = js.native
  /**
    * Information about a Drive Folder for this student&#39;s work in this
    * course. Only visible to the student and domain administrators. Read-only.
    */
  var studentWorkFolder: js.UndefOr[SchemaDriveFolder] = js.native
  /**
    * Identifier of the user.  When specified as a parameter of a request, this
    * identifier can be one of the following:  * the numeric identifier for the
    * user * the email address of the user * the string literal
    * `&quot;me&quot;`, indicating the requesting user
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaStudent {
  @scala.inline
  def apply(
    courseId: String = null,
    profile: SchemaUserProfile = null,
    studentWorkFolder: SchemaDriveFolder = null,
    userId: String = null
  ): SchemaStudent = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (studentWorkFolder != null) __obj.updateDynamic("studentWorkFolder")(studentWorkFolder.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStudent]
  }
}

