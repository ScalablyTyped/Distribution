package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message to unclaim a device.
  */
trait SchemaUnclaimDeviceRequest extends StObject {
  
  /**
    * The device ID returned by `ClaimDevice`.
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * The device identifier you used when you claimed this device.
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.undefined
  
  /**
    * Required. The section type of the device&#39;s provisioning record.
    */
  var sectionType: js.UndefOr[String] = js.undefined
}
object SchemaUnclaimDeviceRequest {
  
  @scala.inline
  def apply(): SchemaUnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnclaimDeviceRequest]
  }
  
  @scala.inline
  implicit class SchemaUnclaimDeviceRequestMutableBuilder[Self <: SchemaUnclaimDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: SchemaDeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    @scala.inline
    def setSectionType(value: String): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionTypeUndefined: Self = StObject.set(x, "sectionType", js.undefined)
  }
}
