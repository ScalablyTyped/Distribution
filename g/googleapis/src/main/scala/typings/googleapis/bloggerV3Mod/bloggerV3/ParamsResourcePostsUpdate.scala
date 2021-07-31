package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePostsUpdate
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
    * Whether the body content of the post is included with the result
    * (default: true).
    */
  var fetchBody: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether image URL metadata for each post is included in the returned
    * result (default: false).
    */
  var fetchImages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of comments to retrieve with the returned post.
    */
  var maxComments: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the Post.
    */
  var postId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether a publish action should be performed when the post is updated
    * (default: false).
    */
  var publish: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPost] = js.undefined
  
  /**
    * Whether a revert action should be performed when the post is updated
    * (default: false).
    */
  var revert: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourcePostsUpdate {
  
  @scala.inline
  def apply(): ParamsResourcePostsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourcePostsUpdateMutableBuilder[Self <: ParamsResourcePostsUpdate] (val x: Self) extends AnyVal {
    
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
    def setPublish(value: Boolean): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaPost): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setRevert(value: Boolean): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
  }
}
