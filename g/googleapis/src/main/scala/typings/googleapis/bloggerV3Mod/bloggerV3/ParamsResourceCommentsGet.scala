package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCommentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * ID of the blog to containing the comment.
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the comment to get.
    */
  var commentId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the post to fetch posts from.
    */
  var postId: js.UndefOr[String] = js.undefined
  
  /**
    * Access level for the requested comment (default: READER). Note that some
    * comments will require elevated permissions, for example comments where
    * the parent posts which is in a draft state, or comments that are pending
    * moderation.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceCommentsGet {
  
  inline def apply(): ParamsResourceCommentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentsGet]
  }
  
  extension [Self <: ParamsResourceCommentsGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    inline def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
    
    inline def setPostId(value: String): Self = StObject.set(x, "postId", value.asInstanceOf[js.Any])
    
    inline def setPostIdUndefined: Self = StObject.set(x, "postId", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
