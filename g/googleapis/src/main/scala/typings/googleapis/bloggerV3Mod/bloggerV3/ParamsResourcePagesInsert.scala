package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePagesInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * ID of the blog to add the page to.
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to create the page as a draft (default: false).
    */
  var isDraft: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPage] = js.undefined
}
object ParamsResourcePagesInsert {
  
  @scala.inline
  def apply(): ParamsResourcePagesInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagesInsert]
  }
  
  @scala.inline
  implicit class ParamsResourcePagesInsertMutableBuilder[Self <: ParamsResourcePagesInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setIsDraft(value: Boolean): Self = StObject.set(x, "isDraft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDraftUndefined: Self = StObject.set(x, "isDraft", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaPage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
