package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerRemoveConfigurationRequest extends StObject {
  
  /**
    * Required. The device to remove the configuration from. There are custom validations in RemoveConfigurationRequestValidator
    */
  var device: js.UndefOr[SchemaDeviceReference] = js.undefined
}
object SchemaCustomerRemoveConfigurationRequest {
  
  inline def apply(): SchemaCustomerRemoveConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerRemoveConfigurationRequest]
  }
  
  extension [Self <: SchemaCustomerRemoveConfigurationRequest](x: Self) {
    
    inline def setDevice(value: SchemaDeviceReference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
