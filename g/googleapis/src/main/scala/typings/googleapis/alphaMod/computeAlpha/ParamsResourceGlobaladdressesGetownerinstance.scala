package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGlobaladdressesGetownerinstance
  extends StObject
     with StandardParameters {
  
  /**
    * The ip_address could be external IPv4, or internal IPv4 within IPv6 form of virtual_network_id with internal IPv4. IPv6 is not supported yet.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceGlobaladdressesGetownerinstance {
  
  inline def apply(): ParamsResourceGlobaladdressesGetownerinstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGlobaladdressesGetownerinstance]
  }
  
  extension [Self <: ParamsResourceGlobaladdressesGetownerinstance](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
