package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCoursesCourseworkList
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
    * Restriction on the work status to return. Only courseWork that matches is
    * returned. If unspecified, items with a work status of `PUBLISHED` is
    * returned.
    */
  var courseWorkStates: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional sort ordering for results. A comma-separated list of fields with
    * an optional sort direction keyword. Supported fields are `updateTime` and
    * `dueDate`. Supported direction keywords are `asc` and `desc`. If not
    * specified, `updateTime desc` is the default behavior. Examples: `dueDate
    * asc,updateTime desc`, `updateTime,dueDate desc`
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
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
}
object ParamsResourceCoursesCourseworkList {
  
  @scala.inline
  def apply(): ParamsResourceCoursesCourseworkList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesCourseworkList]
  }
  
  @scala.inline
  implicit class ParamsResourceCoursesCourseworkListMutableBuilder[Self <: ParamsResourceCoursesCourseworkList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    @scala.inline
    def setCourseWorkStates(value: js.Array[String]): Self = StObject.set(x, "courseWorkStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseWorkStatesUndefined: Self = StObject.set(x, "courseWorkStates", js.undefined)
    
    @scala.inline
    def setCourseWorkStatesVarargs(value: String*): Self = StObject.set(x, "courseWorkStates", js.Array(value :_*))
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
