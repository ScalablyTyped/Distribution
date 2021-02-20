package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePostsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * ID of the blog to fetch the post from.
    */
  var blogId: js.UndefOr[String] = js.native
  
  /**
    * Whether the body content of the post is included (default: true). This
    * should be set to false when the post bodies are not required, to help
    * minimize traffic.
    */
  var fetchBody: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether image URL metadata for each post is included (default: false).
    */
  var fetchImages: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum number of comments to pull back on a post.
    */
  var maxComments: js.UndefOr[Double] = js.native
  
  /**
    * The ID of the post
    */
  var postId: js.UndefOr[String] = js.native
  
  /**
    * Access level with which to view the returned result. Note that some
    * fields require elevated access.
    */
  var view: js.UndefOr[String] = js.native
}
object ParamsResourcePostsGet {
  
  @scala.inline
  def apply(): ParamsResourcePostsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsGet]
  }
  
  @scala.inline
  implicit class ParamsResourcePostsGetMutableBuilder[Self <: ParamsResourcePostsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setFetchBody(value: Boolean): Self = StObject.set(x, "fetchBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchBodyUndefined: Self = StObject.set(x, "fetchBody", js.undefined)
    
    @scala.inline
    def setFetchImages(value: Boolean): Self = StObject.set(x, "fetchImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchImagesUndefined: Self = StObject.set(x, "fetchImages", js.undefined)
    
    @scala.inline
    def setMaxComments(value: Double): Self = StObject.set(x, "maxComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCommentsUndefined: Self = StObject.set(x, "maxComments", js.undefined)
    
    @scala.inline
    def setPostId(value: String): Self = StObject.set(x, "postId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostIdUndefined: Self = StObject.set(x, "postId", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
