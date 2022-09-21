package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCloudidentityDevicesV1BlockDeviceUserResponse extends StObject {
  
  /**
    * Resultant DeviceUser object for the action.
    */
  var deviceUser: js.UndefOr[SchemaGoogleAppsCloudidentityDevicesV1DeviceUser] = js.undefined
}
object SchemaGoogleAppsCloudidentityDevicesV1BlockDeviceUserResponse {
  
  inline def apply(): SchemaGoogleAppsCloudidentityDevicesV1BlockDeviceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCloudidentityDevicesV1BlockDeviceUserResponse]
  }
  
  extension [Self <: SchemaGoogleAppsCloudidentityDevicesV1BlockDeviceUserResponse](x: Self) {
    
    inline def setDeviceUser(value: SchemaGoogleAppsCloudidentityDevicesV1DeviceUser): Self = StObject.set(x, "deviceUser", value.asInstanceOf[js.Any])
    
    inline def setDeviceUserUndefined: Self = StObject.set(x, "deviceUser", js.undefined)
  }
}
