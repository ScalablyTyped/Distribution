package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceRequest extends StObject {
  
  /**
    * Optional. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If you're using this API to manage another organization, use `customers/{customer\}`, where customer is the customer to whom the device belongs.
    */
  var customer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies if a user is able to factory reset a device after a Device Wipe. On iOS, this is called "Activation Lock", while on Android, this is known as "Factory Reset Protection". If true, this protection will be removed from the device, so that a user can successfully factory reset. If false, the setting is untouched on the device.
    */
  var removeResetLock: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceRequest {
  
  inline def apply(): SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceRequest]
  }
  
  extension [Self <: SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceRequest](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setRemoveResetLock(value: Boolean): Self = StObject.set(x, "removeResetLock", value.asInstanceOf[js.Any])
    
    inline def setRemoveResetLockNull: Self = StObject.set(x, "removeResetLock", null)
    
    inline def setRemoveResetLockUndefined: Self = StObject.set(x, "removeResetLock", js.undefined)
  }
}
