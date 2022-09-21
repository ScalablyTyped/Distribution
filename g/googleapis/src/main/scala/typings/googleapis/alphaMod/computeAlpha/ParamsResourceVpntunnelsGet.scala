package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVpntunnelsGet
  extends StObject
     with StandardParameters {
  
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
  
  inline def apply(): ParamsResourceVpntunnelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVpntunnelsGet]
  }
  
  extension [Self <: ParamsResourceVpntunnelsGet](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setVpnTunnel(value: String): Self = StObject.set(x, "vpnTunnel", value.asInstanceOf[js.Any])
    
    inline def setVpnTunnelUndefined: Self = StObject.set(x, "vpnTunnel", js.undefined)
  }
}
