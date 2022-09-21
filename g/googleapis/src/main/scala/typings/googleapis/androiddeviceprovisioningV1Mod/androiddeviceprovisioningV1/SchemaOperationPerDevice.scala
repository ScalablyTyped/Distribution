package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperationPerDevice extends StObject {
  
  /**
    * A copy of the original device-claim request received by the server.
    */
  var claim: js.UndefOr[SchemaPartnerClaim] = js.undefined
  
  /**
    * The processing result for each device.
    */
  var result: js.UndefOr[SchemaPerDeviceStatusInBatch] = js.undefined
  
  /**
    * A copy of the original device-unclaim request received by the server.
    */
  var unclaim: js.UndefOr[SchemaPartnerUnclaim] = js.undefined
  
  /**
    * A copy of the original metadata-update request received by the server.
    */
  var updateMetadata: js.UndefOr[SchemaUpdateMetadataArguments] = js.undefined
}
object SchemaOperationPerDevice {
  
  inline def apply(): SchemaOperationPerDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationPerDevice]
  }
  
  extension [Self <: SchemaOperationPerDevice](x: Self) {
    
    inline def setClaim(value: SchemaPartnerClaim): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
    
    inline def setClaimUndefined: Self = StObject.set(x, "claim", js.undefined)
    
    inline def setResult(value: SchemaPerDeviceStatusInBatch): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setUnclaim(value: SchemaPartnerUnclaim): Self = StObject.set(x, "unclaim", value.asInstanceOf[js.Any])
    
    inline def setUnclaimUndefined: Self = StObject.set(x, "unclaim", js.undefined)
    
    inline def setUpdateMetadata(value: SchemaUpdateMetadataArguments): Self = StObject.set(x, "updateMetadata", value.asInstanceOf[js.Any])
    
    inline def setUpdateMetadataUndefined: Self = StObject.set(x, "updateMetadata", js.undefined)
  }
}
