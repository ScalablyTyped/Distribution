package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
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
  implicit class ParamsResourceCoursesStudentsCreateMutableBuilder[Self <: ParamsResourceCoursesStudentsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    @scala.inline
    def setEnrollmentCode(value: String): Self = StObject.set(x, "enrollmentCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrollmentCodeUndefined: Self = StObject.set(x, "enrollmentCode", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaStudent): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
