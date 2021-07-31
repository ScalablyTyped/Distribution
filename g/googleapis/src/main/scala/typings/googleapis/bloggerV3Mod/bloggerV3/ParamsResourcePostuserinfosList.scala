package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePostuserinfosList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * ID of the blog to fetch posts from.
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    * Latest post date to fetch, a date-time with RFC 3339 formatting.
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the body content of posts is included. Default is false.
    */
  var fetchBodies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Comma-separated list of labels to search for.
    */
  var labels: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of posts to fetch.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Sort order applied to search results. Default is published.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Continuation token if the request is paged.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Earliest post date to fetch, a date-time with RFC 3339 formatting.
    */
  var startDate: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var status: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * ID of the user for the per-user information to be fetched. Either the
    * word 'self' (sans quote marks) or the user's profile identifier.
    */
  var userId: js.UndefOr[String] = js.undefined
  
  /**
    * Access level with which to view the returned result. Note that some
    * fields require elevated access.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourcePostuserinfosList {
  
  @scala.inline
  def apply(): ParamsResourcePostuserinfosList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostuserinfosList]
  }
  
  @scala.inline
  implicit class ParamsResourcePostuserinfosListMutableBuilder[Self <: ParamsResourcePostuserinfosList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setFetchBodies(value: Boolean): Self = StObject.set(x, "fetchBodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchBodiesUndefined: Self = StObject.set(x, "fetchBodies", js.undefined)
    
    @scala.inline
    def setLabels(value: String): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setStatus(value: js.Array[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: String*): Self = StObject.set(x, "status", js.Array(value :_*))
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
