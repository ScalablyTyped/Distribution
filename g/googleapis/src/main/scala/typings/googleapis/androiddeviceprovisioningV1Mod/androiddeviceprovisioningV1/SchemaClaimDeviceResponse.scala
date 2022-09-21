package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClaimDeviceResponse extends StObject {
  
  /**
    * The device ID of the claimed device.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the device in the format `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
    */
  var deviceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaClaimDeviceResponse {
  
  inline def apply(): SchemaClaimDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClaimDeviceResponse]
  }
  
  extension [Self <: SchemaClaimDeviceResponse](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameNull: Self = StObject.set(x, "deviceName", null)
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
  }
}
