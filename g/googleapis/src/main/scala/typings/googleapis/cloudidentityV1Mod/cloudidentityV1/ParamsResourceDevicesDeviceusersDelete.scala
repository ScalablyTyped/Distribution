package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDevicesDeviceusersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If you're using this API to manage another organization, use `customers/{customer\}`, where customer is the customer to whom the device belongs.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device\}/deviceUsers/{device_user\}`, where device is the unique ID assigned to the Device, and device_user is the unique ID assigned to the User.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceDevicesDeviceusersDelete {
  
  inline def apply(): ParamsResourceDevicesDeviceusersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDevicesDeviceusersDelete]
  }
  
  extension [Self <: ParamsResourceDevicesDeviceusersDelete](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
