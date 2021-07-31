package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePostsList
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
    * Whether the body content of posts is included.
    */
  var fetchBodies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of posts to fetch.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Continuation token if the request is paged.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Earliest post date to fetch, a date-time with RFC 3339 formatting.
    */
  var startDate: js.UndefOr[String] = js.undefined
}
object ParamsResourcePostsList {
  
  @scala.inline
  def apply(): ParamsResourcePostsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsList]
  }
  
  @scala.inline
  implicit class ParamsResourcePostsListMutableBuilder[Self <: ParamsResourcePostsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setFetchBodies(value: Boolean): Self = StObject.set(x, "fetchBodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchBodiesUndefined: Self = StObject.set(x, "fetchBodies", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
