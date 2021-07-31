package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to claim devices asynchronously in batch. Claiming a device adds
  * the device to zero-touch enrollment and shows the device in the
  * customer&#39;s view of the portal.
  */
trait SchemaClaimDevicesRequest extends StObject {
  
  /**
    * Required. A list of device claims.
    */
  var claims: js.UndefOr[js.Array[SchemaPartnerClaim]] = js.undefined
}
object SchemaClaimDevicesRequest {
  
  @scala.inline
  def apply(): SchemaClaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClaimDevicesRequest]
  }
  
  @scala.inline
  implicit class SchemaClaimDevicesRequestMutableBuilder[Self <: SchemaClaimDevicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaims(value: js.Array[SchemaPartnerClaim]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    @scala.inline
    def setClaimsVarargs(value: SchemaPartnerClaim*): Self = StObject.set(x, "claims", js.Array(value :_*))
  }
}
