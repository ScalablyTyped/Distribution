package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceJobsList
  extends StObject
     with StandardParameters {
  
  /**
    * Whether to display jobs owned by all users in the project. Default false
    */
  var allUsers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Max value for job creation time, in milliseconds since the POSIX epoch.
    * If set, only jobs created before or at this timestamp are returned
    */
  var maxCreationTime: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Min value for job creation time, in milliseconds since the POSIX epoch.
    * If set, only jobs created after or at this timestamp are returned
    */
  var minCreationTime: js.UndefOr[String] = js.undefined
  
  /**
    * Page token, returned by a previous call, to request the next page of
    * results
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID of the jobs to list
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Restrict information returned to a set of selected fields
    */
  var projection: js.UndefOr[String] = js.undefined
  
  /**
    * Filter for job state
    */
  var stateFilter: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceJobsList {
  
  inline def apply(): ParamsResourceJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsList]
  }
  
  extension [Self <: ParamsResourceJobsList](x: Self) {
    
    inline def setAllUsers(value: Boolean): Self = StObject.set(x, "allUsers", value.asInstanceOf[js.Any])
    
    inline def setAllUsersUndefined: Self = StObject.set(x, "allUsers", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setMaxCreationTime(value: String): Self = StObject.set(x, "maxCreationTime", value.asInstanceOf[js.Any])
    
    inline def setMaxCreationTimeUndefined: Self = StObject.set(x, "maxCreationTime", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMinCreationTime(value: String): Self = StObject.set(x, "minCreationTime", value.asInstanceOf[js.Any])
    
    inline def setMinCreationTimeUndefined: Self = StObject.set(x, "minCreationTime", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setStateFilter(value: js.Array[String]): Self = StObject.set(x, "stateFilter", value.asInstanceOf[js.Any])
    
    inline def setStateFilterUndefined: Self = StObject.set(x, "stateFilter", js.undefined)
    
    inline def setStateFilterVarargs(value: String*): Self = StObject.set(x, "stateFilter", js.Array(value :_*))
  }
}
