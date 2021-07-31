package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCoursesCourseworkStudentsubmissionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Identifier of the course. This identifier can be either the
    * Classroom-assigned identifier or an alias.
    */
  var courseId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the course work.
    */
  var courseWorkId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the student submission.
    */
  var id: js.UndefOr[String] = js.undefined
}
object ParamsResourceCoursesCourseworkStudentsubmissionsGet {
  
  @scala.inline
  def apply(): ParamsResourceCoursesCourseworkStudentsubmissionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesCourseworkStudentsubmissionsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceCoursesCourseworkStudentsubmissionsGetMutableBuilder[Self <: ParamsResourceCoursesCourseworkStudentsubmissionsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    @scala.inline
    def setCourseWorkId(value: String): Self = StObject.set(x, "courseWorkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseWorkIdUndefined: Self = StObject.set(x, "courseWorkId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
