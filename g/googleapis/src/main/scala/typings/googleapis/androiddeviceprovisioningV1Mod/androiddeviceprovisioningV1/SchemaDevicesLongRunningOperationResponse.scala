package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDevicesLongRunningOperationResponse extends StObject {
  
  /**
    * The processing status for each device in the operation. One `PerDeviceStatus` per device. The list order matches the items in the original request.
    */
  var perDeviceStatus: js.UndefOr[js.Array[SchemaOperationPerDevice]] = js.undefined
  
  /**
    * A summary of how many items in the operation the server processed successfully. Updated as the operation progresses.
    */
  var successCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDevicesLongRunningOperationResponse {
  
  inline def apply(): SchemaDevicesLongRunningOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevicesLongRunningOperationResponse]
  }
  
  extension [Self <: SchemaDevicesLongRunningOperationResponse](x: Self) {
    
    inline def setPerDeviceStatus(value: js.Array[SchemaOperationPerDevice]): Self = StObject.set(x, "perDeviceStatus", value.asInstanceOf[js.Any])
    
    inline def setPerDeviceStatusUndefined: Self = StObject.set(x, "perDeviceStatus", js.undefined)
    
    inline def setPerDeviceStatusVarargs(value: SchemaOperationPerDevice*): Self = StObject.set(x, "perDeviceStatus", js.Array(value*))
    
    inline def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessCountNull: Self = StObject.set(x, "successCount", null)
    
    inline def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
  }
}
