package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for customer to remove the configuration from device.
  */
@js.native
trait SchemaCustomerRemoveConfigurationRequest extends StObject {
  
  /**
    * Required. The device to remove the configuration from.
    */
  var device: js.UndefOr[SchemaDeviceReference] = js.native
}
object SchemaCustomerRemoveConfigurationRequest {
  
  @scala.inline
  def apply(): SchemaCustomerRemoveConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerRemoveConfigurationRequest]
  }
  
  @scala.inline
  implicit class SchemaCustomerRemoveConfigurationRequestMutableBuilder[Self <: SchemaCustomerRemoveConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: SchemaDeviceReference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
