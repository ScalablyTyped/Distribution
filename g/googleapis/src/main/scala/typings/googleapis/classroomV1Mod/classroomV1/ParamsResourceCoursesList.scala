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
  implicit class ParamsResourceCoursesListMutableBuilder[Self <: ParamsResourceCoursesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCourseStates(value: js.Array[String]): Self = StObject.set(x, "courseStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseStatesUndefined: Self = StObject.set(x, "courseStates", js.undefined)
    
    @scala.inline
    def setCourseStatesVarargs(value: String*): Self = StObject.set(x, "courseStates", js.Array(value :_*))
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
    
    @scala.inline
    def setTeacherId(value: String): Self = StObject.set(x, "teacherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeacherIdUndefined: Self = StObject.set(x, "teacherId", js.undefined)
  }
}
