package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for customer to assign a configuration to device.
  */
@js.native
trait SchemaCustomerApplyConfigurationRequest extends StObject {
  
  /**
    * Required. The configuration applied to the device in the format
    * `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`.
    */
  var configuration: js.UndefOr[String] = js.native
  
  /**
    * Required. The device the configuration is applied to.
    */
  var device: js.UndefOr[SchemaDeviceReference] = js.native
}
object SchemaCustomerApplyConfigurationRequest {
  
  @scala.inline
  def apply(): SchemaCustomerApplyConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerApplyConfigurationRequest]
  }
  
  @scala.inline
  implicit class SchemaCustomerApplyConfigurationRequestMutableBuilder[Self <: SchemaCustomerApplyConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setDevice(value: SchemaDeviceReference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
