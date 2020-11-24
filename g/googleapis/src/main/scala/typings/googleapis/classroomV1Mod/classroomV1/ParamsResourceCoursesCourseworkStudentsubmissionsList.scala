package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCoursesCourseworkStudentsubmissionsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Identifier of the course. This identifier can be either the
    * Classroom-assigned identifier or an alias.
    */
  var courseId: js.UndefOr[String] = js.native
  
  /**
    * Identifier of the student work to request. This may be set to the string
    * literal `"-"` to request student work for all course work in the
    * specified course.
    */
  var courseWorkId: js.UndefOr[String] = js.native
  
  /**
    * Requested lateness value. If specified, returned student submissions are
    * restricted by the requested value. If unspecified, submissions are
    * returned regardless of `late` value.
    */
  var late: js.UndefOr[String] = js.native
  
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
    * Requested submission states. If specified, returned student submissions
    * match one of the specified submission states.
    */
  var states: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional argument to restrict returned student work to those owned by the
    * student with the specified identifier. The identifier can be one of the
    * following:  * the numeric identifier for the user * the email address of
    * the user * the string literal `"me"`, indicating the requesting user
    */
  var userId: js.UndefOr[String] = js.native
}
object ParamsResourceCoursesCourseworkStudentsubmissionsList {
  
  @scala.inline
  def apply(): ParamsResourceCoursesCourseworkStudentsubmissionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesCourseworkStudentsubmissionsList]
  }
  
  @scala.inline
  implicit class ParamsResourceCoursesCourseworkStudentsubmissionsListOps[Self <: ParamsResourceCoursesCourseworkStudentsubmissionsList] (val x: Self) extends AnyVal {
    
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
    def setCourseId(value: String): Self = this.set("courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCourseId: Self = this.set("courseId", js.undefined)
    
    @scala.inline
    def setCourseWorkId(value: String): Self = this.set("courseWorkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCourseWorkId: Self = this.set("courseWorkId", js.undefined)
    
    @scala.inline
    def setLate(value: String): Self = this.set("late", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLate: Self = this.set("late", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setStatesVarargs(value: String*): Self = this.set("states", js.Array(value :_*))
    
    @scala.inline
    def setStates(value: js.Array[String]): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
