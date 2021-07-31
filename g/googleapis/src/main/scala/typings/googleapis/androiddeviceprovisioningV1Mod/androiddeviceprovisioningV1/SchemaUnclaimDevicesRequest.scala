package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to unclaim devices asynchronously in batch.
  */
trait SchemaUnclaimDevicesRequest extends StObject {
  
  /**
    * Required. The list of devices to unclaim.
    */
  var unclaims: js.UndefOr[js.Array[SchemaPartnerUnclaim]] = js.undefined
}
object SchemaUnclaimDevicesRequest {
  
  @scala.inline
  def apply(): SchemaUnclaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnclaimDevicesRequest]
  }
  
  @scala.inline
  implicit class SchemaUnclaimDevicesRequestMutableBuilder[Self <: SchemaUnclaimDevicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnclaims(value: js.Array[SchemaPartnerUnclaim]): Self = StObject.set(x, "unclaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnclaimsUndefined: Self = StObject.set(x, "unclaims", js.undefined)
    
    @scala.inline
    def setUnclaimsVarargs(value: SchemaPartnerUnclaim*): Self = StObject.set(x, "unclaims", js.Array(value :_*))
  }
}
