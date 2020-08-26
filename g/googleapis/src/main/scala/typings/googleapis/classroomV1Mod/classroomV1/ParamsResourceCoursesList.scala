package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCoursesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Restricts returned courses to those in one of the specified states The
    * default value is ACTIVE, ARCHIVED, PROVISIONED, DECLINED.
    */
  var courseStates: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum number of items to return. Zero or unspecified indicates that the
    * server may assign a maximum.  The server may return fewer than the
    * specified number of results.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * nextPageToken value returned from a previous list call, indicating that
    * the subsequent page of results should be returned.  The list request must
    * be otherwise identical to the one that resulted in this token.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Restricts returned courses to those having a student with the specified
    * identifier. The identifier can be one of the following:  * the numeric
    * identifier for the user * the email address of the user * the string
    * literal `"me"`, indicating the requesting user
    */
  var studentId: js.UndefOr[String] = js.native
  /**
    * Restricts returned courses to those having a teacher with the specified
    * identifier. The identifier can be one of the following:  * the numeric
    * identifier for the user * the email address of the user * the string
    * literal `"me"`, indicating the requesting user
    */
  var teacherId: js.UndefOr[String] = js.native
}

object ParamsResourceCoursesList {
  @scala.inline
  def apply(): ParamsResourceCoursesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesList]
  }
  @scala.inline
  implicit class ParamsResourceCoursesListOps[Self <: ParamsResourceCoursesList] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCourseStatesVarargs(value: String*): Self = this.set("courseStates", js.Array(value :_*))
    @scala.inline
    def setCourseStates(value: js.Array[String]): Self = this.set("courseStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourseStates: Self = this.set("courseStates", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setStudentId(value: String): Self = this.set("studentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStudentId: Self = this.set("studentId", js.undefined)
    @scala.inline
    def setTeacherId(value: String): Self = this.set("teacherId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeacherId: Self = this.set("teacherId", js.undefined)
  }
  
}

