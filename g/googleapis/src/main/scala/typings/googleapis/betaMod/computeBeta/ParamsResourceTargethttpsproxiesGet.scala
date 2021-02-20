package typings.googleapis.betaMod.computeBeta

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceTargethttpsproxiesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * Name of the TargetHttpsProxy resource to return.
    */
  var targetHttpsProxy: js.UndefOr[String] = js.native
}
object ParamsResourceTargethttpsproxiesGet {
  
  @scala.inline
  def apply(): ParamsResourceTargethttpsproxiesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTargethttpsproxiesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceTargethttpsproxiesGetMutableBuilder[Self <: ParamsResourceTargethttpsproxiesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setTargetHttpsProxy(value: String): Self = StObject.set(x, "targetHttpsProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHttpsProxyUndefined: Self = StObject.set(x, "targetHttpsProxy", js.undefined)
  }
}
