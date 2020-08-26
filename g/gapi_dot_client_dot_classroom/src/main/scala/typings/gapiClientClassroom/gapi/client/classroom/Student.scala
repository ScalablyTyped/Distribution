package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Student extends js.Object {
  /**
    * Identifier of the course.
    *
    * Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  /**
    * Global user information for the student.
    *
    * Read-only.
    */
  var profile: js.UndefOr[UserProfile] = js.native
  /**
    * Information about a Drive Folder for this student's work in this course.
    * Only visible to the student and domain administrators.
    *
    * Read-only.
    */
  var studentWorkFolder: js.UndefOr[DriveFolder] = js.native
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
  var userId: js.UndefOr[String] = js.native
}

object Student {
  @scala.inline
  def apply(): Student = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Student]
  }
  @scala.inline
  implicit class StudentOps[Self <: Student] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCourseId(value: String): Self = this.set("courseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourseId: Self = this.set("courseId", js.undefined)
    @scala.inline
    def setProfile(value: UserProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setStudentWorkFolder(value: DriveFolder): Self = this.set("studentWorkFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStudentWorkFolder: Self = this.set("studentWorkFolder", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

