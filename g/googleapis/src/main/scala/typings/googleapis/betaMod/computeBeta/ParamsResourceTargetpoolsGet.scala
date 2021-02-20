package typings.googleapis.betaMod.computeBeta

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceTargetpoolsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * Name of the region scoping this request.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Name of the TargetPool resource to return.
    */
  var targetPool: js.UndefOr[String] = js.native
}
object ParamsResourceTargetpoolsGet {
  
  @scala.inline
  def apply(): ParamsResourceTargetpoolsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTargetpoolsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceTargetpoolsGetMutableBuilder[Self <: ParamsResourceTargetpoolsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setTargetPool(value: String): Self = StObject.set(x, "targetPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPoolUndefined: Self = StObject.set(x, "targetPool", js.undefined)
  }
}
