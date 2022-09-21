package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUnclaimDevicesRequest extends StObject {
  
  /**
    * Required. The list of devices to unclaim.
    */
  var unclaims: js.UndefOr[js.Array[SchemaPartnerUnclaim]] = js.undefined
}
object SchemaUnclaimDevicesRequest {
  
  inline def apply(): SchemaUnclaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnclaimDevicesRequest]
  }
  
  extension [Self <: SchemaUnclaimDevicesRequest](x: Self) {
    
    inline def setUnclaims(value: js.Array[SchemaPartnerUnclaim]): Self = StObject.set(x, "unclaims", value.asInstanceOf[js.Any])
    
    inline def setUnclaimsUndefined: Self = StObject.set(x, "unclaims", js.undefined)
    
    inline def setUnclaimsVarargs(value: SchemaPartnerUnclaim*): Self = StObject.set(x, "unclaims", js.Array(value*))
  }
}
