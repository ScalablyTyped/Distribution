package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Android device registered for zero-touch enrollment.
  */
@js.native
trait SchemaDevice extends StObject {
  
  /**
    * Output only. The provisioning claims for a device. Devices claimed for
    * zero-touch enrollment have a claim with the type
    * `SECTION_TYPE_ZERO_TOUCH`. Call `partners.devices.unclaim` or
    * `partners.devices.unclaimAsync` to remove the device from zero-touch
    * enrollment.
    */
  var claims: js.UndefOr[js.Array[SchemaDeviceClaim]] = js.native
  
  /**
    * Not available to resellers.
    */
  var configuration: js.UndefOr[String] = js.native
  
  /**
    * Output only. The ID of the device. Assigned by the server.
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * The hardware IDs that identify a manufactured device. To learn more, read
    * [Identifiers](/zero-touch/guides/identifiers).
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.native
  
  /**
    * The metadata attached to the device. Structured as key-value pairs. To
    * learn more, read [Device metadata](/zero-touch/guides/metadata).
    */
  var deviceMetadata: js.UndefOr[SchemaDeviceMetadata] = js.native
  
  /**
    * Output only. The API resource name in the format
    * `partners/[PARTNER_ID]/devices/[DEVICE_ID]`. Assigned by the server.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaDevice {
  
  @scala.inline
  def apply(): SchemaDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevice]
  }
  
  @scala.inline
  implicit class SchemaDeviceMutableBuilder[Self <: SchemaDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaims(value: js.Array[SchemaDeviceClaim]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    @scala.inline
    def setClaimsVarargs(value: SchemaDeviceClaim*): Self = StObject.set(x, "claims", js.Array(value :_*))
    
    @scala.inline
    def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: SchemaDeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    @scala.inline
    def setDeviceMetadata(value: SchemaDeviceMetadata): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
