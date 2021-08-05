package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCoursesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Restricts returned courses to those in one of the specified states The
    * default value is ACTIVE, ARCHIVED, PROVISIONED, DECLINED.
    */
  var courseStates: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Maximum number of items to return. Zero or unspecified indicates that the
    * server may assign a maximum.  The server may return fewer than the
    * specified number of results.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * nextPageToken value returned from a previous list call, indicating that
    * the subsequent page of results should be returned.  The list request must
    * be otherwise identical to the one that resulted in this token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Restricts returned courses to those having a student with the specified
    * identifier. The identifier can be one of the following:  * the numeric
    * identifier for the user * the email address of the user * the string
    * literal `"me"`, indicating the requesting user
    */
  var studentId: js.UndefOr[String] = js.undefined
  
  /**
    * Restricts returned courses to those having a teacher with the specified
    * identifier. The identifier can be one of the following:  * the numeric
    * identifier for the user * the email address of the user * the string
    * literal `"me"`, indicating the requesting user
    */
  var teacherId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCoursesList {
  
  inline def apply(): ParamsResourceCoursesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesList]
  }
  
  extension [Self <: ParamsResourceCoursesList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCourseStates(value: js.Array[String]): Self = StObject.set(x, "courseStates", value.asInstanceOf[js.Any])
    
    inline def setCourseStatesUndefined: Self = StObject.set(x, "courseStates", js.undefined)
    
    inline def setCourseStatesVarargs(value: String*): Self = StObject.set(x, "courseStates", js.Array(value :_*))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    inline def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
    
    inline def setTeacherId(value: String): Self = StObject.set(x, "teacherId", value.asInstanceOf[js.Any])
    
    inline def setTeacherIdUndefined: Self = StObject.set(x, "teacherId", js.undefined)
  }
}
