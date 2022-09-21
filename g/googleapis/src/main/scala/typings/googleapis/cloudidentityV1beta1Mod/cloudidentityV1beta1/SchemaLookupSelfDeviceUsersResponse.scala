package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLookupSelfDeviceUsersResponse extends StObject {
  
  /**
    * The obfuscated customer Id that may be passed back to other Devices API methods such as List, Get, etc.
    */
  var customer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Resource names](https://cloud.google.com/apis/design/resource_names) of the DeviceUsers in the format: `devices/{device_id\}/deviceUsers/{user_resource_id\}`, where device_id is the unique ID assigned to a Device and user_resource_id is the unique user ID
    */
  var names: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Token to retrieve the next page of results. Empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaLookupSelfDeviceUsersResponse {
  
  inline def apply(): SchemaLookupSelfDeviceUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupSelfDeviceUsersResponse]
  }
  
  extension [Self <: SchemaLookupSelfDeviceUsersResponse](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesNull: Self = StObject.set(x, "names", null)
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
