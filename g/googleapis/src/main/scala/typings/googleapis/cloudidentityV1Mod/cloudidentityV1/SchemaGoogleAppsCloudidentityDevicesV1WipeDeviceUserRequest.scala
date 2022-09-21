package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceUserRequest extends StObject {
  
  /**
    * Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If you're using this API to manage another organization, use `customers/{customer\}`, where customer is the customer to whom the device belongs.
    */
  var customer: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceUserRequest {
  
  inline def apply(): SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceUserRequest]
  }
  
  extension [Self <: SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceUserRequest](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
  }
}
