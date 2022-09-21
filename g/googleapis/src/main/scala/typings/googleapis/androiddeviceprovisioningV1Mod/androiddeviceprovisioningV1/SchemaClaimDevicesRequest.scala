package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClaimDevicesRequest extends StObject {
  
  /**
    * Required. A list of device claims.
    */
  var claims: js.UndefOr[js.Array[SchemaPartnerClaim]] = js.undefined
}
object SchemaClaimDevicesRequest {
  
  inline def apply(): SchemaClaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClaimDevicesRequest]
  }
  
  extension [Self <: SchemaClaimDevicesRequest](x: Self) {
    
    inline def setClaims(value: js.Array[SchemaPartnerClaim]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    inline def setClaimsVarargs(value: SchemaPartnerClaim*): Self = StObject.set(x, "claims", js.Array(value*))
  }
}
