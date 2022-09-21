package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDevicesDeviceusersClientstatesList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If you're using this API to manage another organization, use `customers/{customer\}`, where customer is the customer to whom the device belongs.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Additional restrictions when fetching list of client states.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Order specification for client states in the response.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A page token, received from a previous `ListClientStates` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListClientStates` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. To list all ClientStates, set this to "devices/-/deviceUsers/-". To list all ClientStates owned by a DeviceUser, set this to the resource name of the DeviceUser. Format: devices/{device\}/deviceUsers/{deviceUser\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceDevicesDeviceusersClientstatesList {
  
  inline def apply(): ParamsResourceDevicesDeviceusersClientstatesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDevicesDeviceusersClientstatesList]
  }
  
  extension [Self <: ParamsResourceDevicesDeviceusersClientstatesList](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
