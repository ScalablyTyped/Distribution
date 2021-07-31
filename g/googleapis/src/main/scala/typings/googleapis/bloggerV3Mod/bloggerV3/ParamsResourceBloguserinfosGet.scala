package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBloguserinfosGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the blog to get.
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of posts to pull back with the blog.
    */
  var maxPosts: js.UndefOr[Double] = js.undefined
  
  /**
    * ID of the user whose blogs are to be fetched. Either the word 'self'
    * (sans quote marks) or the user's profile identifier.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceBloguserinfosGet {
  
  @scala.inline
  def apply(): ParamsResourceBloguserinfosGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBloguserinfosGet]
  }
  
  @scala.inline
  implicit class ParamsResourceBloguserinfosGetMutableBuilder[Self <: ParamsResourceBloguserinfosGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setMaxPosts(value: Double): Self = StObject.set(x, "maxPosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPostsUndefined: Self = StObject.set(x, "maxPosts", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
