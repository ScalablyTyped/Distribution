package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for customer to assign a configuration to device.
  */
trait SchemaCustomerApplyConfigurationRequest extends StObject {
  
  /**
    * Required. The configuration applied to the device in the format
    * `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`.
    */
  var configuration: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The device the configuration is applied to.
    */
  var device: js.UndefOr[SchemaDeviceReference] = js.undefined
}
object SchemaCustomerApplyConfigurationRequest {
  
  inline def apply(): SchemaCustomerApplyConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerApplyConfigurationRequest]
  }
  
  extension [Self <: SchemaCustomerApplyConfigurationRequest](x: Self) {
    
    inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setDevice(value: SchemaDeviceReference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
