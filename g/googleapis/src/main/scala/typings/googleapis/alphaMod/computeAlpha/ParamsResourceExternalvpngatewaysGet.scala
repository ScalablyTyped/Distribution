package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceExternalvpngatewaysGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Name of the externalVpnGateway to return.
    */
  var externalVpnGateway: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceExternalvpngatewaysGet {
  
  @scala.inline
  def apply(): ParamsResourceExternalvpngatewaysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceExternalvpngatewaysGet]
  }
  
  @scala.inline
  implicit class ParamsResourceExternalvpngatewaysGetMutableBuilder[Self <: ParamsResourceExternalvpngatewaysGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setExternalVpnGateway(value: String): Self = StObject.set(x, "externalVpnGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalVpnGatewayUndefined: Self = StObject.set(x, "externalVpnGateway", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
