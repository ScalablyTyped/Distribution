package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCoursesStudentsCreate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Identifier of the course to create the student in. This identifier can be
    * either the Classroom-assigned identifier or an alias.
    */
  var courseId: js.UndefOr[String] = js.native
  
  /**
    * Enrollment code of the course to create the student in. This code is
    * required if userId corresponds to the requesting user; it may be omitted
    * if the requesting user has administrative permissions to create students
    * for any user.
    */
  var enrollmentCode: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaStudent] = js.native
}
object ParamsResourceCoursesStudentsCreate {
  
  @scala.inline
  def apply(): ParamsResourceCoursesStudentsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesStudentsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceCoursesStudentsCreateOps[Self <: ParamsResourceCoursesStudentsCreate] (val x: Self) extends AnyVal {
    
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
    def setEnrollmentCode(value: String): Self = this.set("enrollmentCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnrollmentCode: Self = this.set("enrollmentCode", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaStudent): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
}
