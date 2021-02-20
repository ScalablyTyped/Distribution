package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message containing device id of the claim.
  */
@js.native
trait SchemaClaimDeviceResponse extends StObject {
  
  /**
    * The device ID of the claimed device.
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the device in the format
    * `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
    */
  var deviceName: js.UndefOr[String] = js.native
}
object SchemaClaimDeviceResponse {
  
  @scala.inline
  def apply(): SchemaClaimDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClaimDeviceResponse]
  }
  
  @scala.inline
  implicit class SchemaClaimDeviceResponseMutableBuilder[Self <: SchemaClaimDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
  }
}
