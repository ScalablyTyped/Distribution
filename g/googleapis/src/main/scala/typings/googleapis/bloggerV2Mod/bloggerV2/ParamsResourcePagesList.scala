package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePagesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * ID of the blog to fetch pages from.
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to retrieve the Page bodies.
    */
  var fetchBodies: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourcePagesList {
  
  @scala.inline
  def apply(): ParamsResourcePagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagesList]
  }
  
  @scala.inline
  implicit class ParamsResourcePagesListMutableBuilder[Self <: ParamsResourcePagesList] (val x: Self) extends AnyVal {
    
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
  }
}
