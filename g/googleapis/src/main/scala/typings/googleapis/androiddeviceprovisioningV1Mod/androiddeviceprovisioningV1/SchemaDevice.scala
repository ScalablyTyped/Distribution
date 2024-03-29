package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDevice extends StObject {
  
  /**
    * Output only. The provisioning claims for a device. Devices claimed for zero-touch enrollment have a claim with the type `SECTION_TYPE_ZERO_TOUCH`. Call `partners.devices.unclaim` or `partners.devices.unclaimAsync` to remove the device from zero-touch enrollment.
    */
  var claims: js.UndefOr[js.Array[SchemaDeviceClaim]] = js.undefined
  
  /**
    * Not available to resellers.
    */
  var configuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The ID of the device. Assigned by the server.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The hardware IDs that identify a manufactured device. To learn more, read [Identifiers](https://developers.google.com/zero-touch/guides/identifiers).
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.undefined
  
  /**
    * The metadata attached to the device. Structured as key-value pairs. To learn more, read [Device metadata](https://developers.google.com/zero-touch/guides/metadata).
    */
  var deviceMetadata: js.UndefOr[SchemaDeviceMetadata] = js.undefined
  
  /**
    * Output only. The API resource name in the format `partners/[PARTNER_ID]/devices/[DEVICE_ID]`. Assigned by the server.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaDevice {
  
  inline def apply(): SchemaDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevice]
  }
  
  extension [Self <: SchemaDevice](x: Self) {
    
    inline def setClaims(value: js.Array[SchemaDeviceClaim]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    inline def setClaimsVarargs(value: SchemaDeviceClaim*): Self = StObject.set(x, "claims", js.Array(value*))
    
    inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationNull: Self = StObject.set(x, "configuration", null)
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceIdentifier(value: SchemaDeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    inline def setDeviceMetadata(value: SchemaDeviceMetadata): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
