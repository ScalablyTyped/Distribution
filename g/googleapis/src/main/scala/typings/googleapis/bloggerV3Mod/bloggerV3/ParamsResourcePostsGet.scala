package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePostsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * ID of the blog to fetch the post from.
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the body content of the post is included (default: true). This
    * should be set to false when the post bodies are not required, to help
    * minimize traffic.
    */
  var fetchBody: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether image URL metadata for each post is included (default: false).
    */
  var fetchImages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of comments to pull back on a post.
    */
  var maxComments: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the post
    */
  var postId: js.UndefOr[String] = js.undefined
  
  /**
    * Access level with which to view the returned result. Note that some
    * fields require elevated access.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourcePostsGet {
  
  inline def apply(): ParamsResourcePostsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsGet]
  }
  
  extension [Self <: ParamsResourcePostsGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setFetchBody(value: Boolean): Self = StObject.set(x, "fetchBody", value.asInstanceOf[js.Any])
    
    inline def setFetchBodyUndefined: Self = StObject.set(x, "fetchBody", js.undefined)
    
    inline def setFetchImages(value: Boolean): Self = StObject.set(x, "fetchImages", value.asInstanceOf[js.Any])
    
    inline def setFetchImagesUndefined: Self = StObject.set(x, "fetchImages", js.undefined)
    
    inline def setMaxComments(value: Double): Self = StObject.set(x, "maxComments", value.asInstanceOf[js.Any])
    
    inline def setMaxCommentsUndefined: Self = StObject.set(x, "maxComments", js.undefined)
    
    inline def setPostId(value: String): Self = StObject.set(x, "postId", value.asInstanceOf[js.Any])
    
    inline def setPostIdUndefined: Self = StObject.set(x, "postId", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
