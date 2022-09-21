package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDevicesDeviceusersClientstatesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If you're using this API to manage another organization, use `customers/{customer_id\}`, where customer_id is the customer to whom the device belongs.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the ClientState in format: `devices/{device_id\}/deviceUsers/{device_user_id\}/clientStates/{partner_id\}`, where `device_id` is the unique ID assigned to the Device, `device_user_id` is the unique ID assigned to the User and `partner_id` identifies the partner storing the data. To get the client state for devices belonging to your own organization, the `partnerId` is in the format: `customerId-*anystring*`. Where the `customerId` is your organization's customer ID and `anystring` is any suffix. This suffix is used in setting up Custom Access Levels in Context-Aware Access. You may use `my_customer` instead of the customer ID for devices managed by your own organization. You may specify `-` in place of the `{device_id\}`, so the ClientState resource name can be: `devices/-/deviceUsers/{device_user_resource_id\}/clientStates/{partner_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceDevicesDeviceusersClientstatesGet {
  
  inline def apply(): ParamsResourceDevicesDeviceusersClientstatesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDevicesDeviceusersClientstatesGet]
  }
  
  extension [Self <: ParamsResourceDevicesDeviceusersClientstatesGet](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
