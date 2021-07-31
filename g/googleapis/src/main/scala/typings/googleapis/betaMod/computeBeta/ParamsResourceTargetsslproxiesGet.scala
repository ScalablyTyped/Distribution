package typings.googleapis.betaMod.computeBeta

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTargetsslproxiesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the TargetSslProxy resource to return.
    */
  var targetSslProxy: js.UndefOr[String] = js.undefined
}
object ParamsResourceTargetsslproxiesGet {
  
  @scala.inline
  def apply(): ParamsResourceTargetsslproxiesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTargetsslproxiesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceTargetsslproxiesGetMutableBuilder[Self <: ParamsResourceTargetsslproxiesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setTargetSslProxy(value: String): Self = StObject.set(x, "targetSslProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSslProxyUndefined: Self = StObject.set(x, "targetSslProxy", js.undefined)
  }
}
