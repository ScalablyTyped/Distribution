package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePagesPatch
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
    * The ID of the Page.
    */
  var pageId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether a publish action should be performed when the page is updated
    * (default: false).
    */
  var publish: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPage] = js.undefined
  
  /**
    * Whether a revert action should be performed when the page is updated
    * (default: false).
    */
  var revert: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourcePagesPatch {
  
  inline def apply(): ParamsResourcePagesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagesPatch]
  }
  
  extension [Self <: ParamsResourcePagesPatch](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    
    inline def setPageIdUndefined: Self = StObject.set(x, "pageId", js.undefined)
    
    inline def setPublish(value: Boolean): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
    
    inline def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
    
    inline def setRequestBody(value: SchemaPage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRevert(value: Boolean): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    inline def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
  }
}
