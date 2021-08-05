package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCommentsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * ID of the blog to fetch comments from.
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the body content of the comments is included.
    */
  var fetchBodies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of comments to include in the result.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Continuation token if request is paged.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the post to fetch posts from.
    */
  var postId: js.UndefOr[String] = js.undefined
  
  /**
    * Earliest date of comment to fetch, a date-time with RFC 3339 formatting.
    */
  var startDate: js.UndefOr[String] = js.undefined
}
object ParamsResourceCommentsList {
  
  inline def apply(): ParamsResourceCommentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentsList]
  }
  
  extension [Self <: ParamsResourceCommentsList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setFetchBodies(value: Boolean): Self = StObject.set(x, "fetchBodies", value.asInstanceOf[js.Any])
    
    inline def setFetchBodiesUndefined: Self = StObject.set(x, "fetchBodies", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPostId(value: String): Self = StObject.set(x, "postId", value.asInstanceOf[js.Any])
    
    inline def setPostIdUndefined: Self = StObject.set(x, "postId", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
