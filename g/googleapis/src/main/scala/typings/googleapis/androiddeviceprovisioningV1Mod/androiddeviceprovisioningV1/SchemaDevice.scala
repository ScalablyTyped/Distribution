package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Android device registered for zero-touch enrollment.
  */
@js.native
trait SchemaDevice extends js.Object {
  
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
  implicit class SchemaDeviceOps[Self <: SchemaDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClaimsVarargs(value: SchemaDeviceClaim*): Self = this.set("claims", js.Array(value :_*))
    
    @scala.inline
    def setClaims(value: js.Array[SchemaDeviceClaim]): Self = this.set("claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaims: Self = this.set("claims", js.undefined)
    
    @scala.inline
    def setConfiguration(value: String): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: SchemaDeviceIdentifier): Self = this.set("deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIdentifier: Self = this.set("deviceIdentifier", js.undefined)
    
    @scala.inline
    def setDeviceMetadata(value: SchemaDeviceMetadata): Self = this.set("deviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceMetadata: Self = this.set("deviceMetadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
