package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersDevicesApplyconfiguration
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The customer managing the device. An API resource name in the format `customers/[CUSTOMER_ID]`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCustomerApplyConfigurationRequest] = js.undefined
}
object ParamsResourceCustomersDevicesApplyconfiguration {
  
  inline def apply(): ParamsResourceCustomersDevicesApplyconfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersDevicesApplyconfiguration]
  }
  
  extension [Self <: ParamsResourceCustomersDevicesApplyconfiguration](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaCustomerApplyConfigurationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
