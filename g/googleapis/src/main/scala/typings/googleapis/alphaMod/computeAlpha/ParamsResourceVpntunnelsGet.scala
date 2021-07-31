package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVpntunnelsGet
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
    * Name of the region for this request.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the VpnTunnel resource to return.
    */
  var vpnTunnel: js.UndefOr[String] = js.undefined
}
object ParamsResourceVpntunnelsGet {
  
  @scala.inline
  def apply(): ParamsResourceVpntunnelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVpntunnelsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceVpntunnelsGetMutableBuilder[Self <: ParamsResourceVpntunnelsGet] (val x: Self) extends AnyVal {
    
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
    def setVpnTunnel(value: String): Self = StObject.set(x, "vpnTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnTunnelUndefined: Self = StObject.set(x, "vpnTunnel", js.undefined)
  }
}
