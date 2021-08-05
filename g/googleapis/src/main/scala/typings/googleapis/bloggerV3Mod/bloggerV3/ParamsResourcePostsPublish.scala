package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePostsPublish
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the Blog.
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Post.
    */
  var postId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional date and time to schedule the publishing of the Blog. If no
    * publishDate parameter is given, the post is either published at the a
    * previously saved schedule date (if present), or the current time. If a
    * future date is given, the post will be scheduled to be published.
    */
  var publishDate: js.UndefOr[String] = js.undefined
}
object ParamsResourcePostsPublish {
  
  inline def apply(): ParamsResourcePostsPublish = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsPublish]
  }
  
  extension [Self <: ParamsResourcePostsPublish](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setPostId(value: String): Self = StObject.set(x, "postId", value.asInstanceOf[js.Any])
    
    inline def setPostIdUndefined: Self = StObject.set(x, "postId", js.undefined)
    
    inline def setPublishDate(value: String): Self = StObject.set(x, "publishDate", value.asInstanceOf[js.Any])
    
    inline def setPublishDateUndefined: Self = StObject.set(x, "publishDate", js.undefined)
  }
}
