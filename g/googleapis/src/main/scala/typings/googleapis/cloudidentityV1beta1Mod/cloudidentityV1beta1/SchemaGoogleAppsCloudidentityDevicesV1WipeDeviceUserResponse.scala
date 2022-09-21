package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse extends StObject {
  
  /**
    * Resultant DeviceUser object for the action.
    */
  var deviceUser: js.UndefOr[SchemaGoogleAppsCloudidentityDevicesV1DeviceUser] = js.undefined
}
object SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse {
  
  inline def apply(): SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse]
  }
  
  extension [Self <: SchemaGoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse](x: Self) {
    
    inline def setDeviceUser(value: SchemaGoogleAppsCloudidentityDevicesV1DeviceUser): Self = StObject.set(x, "deviceUser", value.asInstanceOf[js.Any])
    
    inline def setDeviceUserUndefined: Self = StObject.set(x, "deviceUser", js.undefined)
  }
}
