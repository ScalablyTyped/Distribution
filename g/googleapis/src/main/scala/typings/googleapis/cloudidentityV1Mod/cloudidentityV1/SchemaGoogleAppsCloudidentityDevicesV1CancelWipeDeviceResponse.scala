package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse extends StObject {
  
  /**
    * Resultant Device object for the action. Note that asset tags will not be returned in the device object.
    */
  var device: js.UndefOr[SchemaGoogleAppsCloudidentityDevicesV1Device] = js.undefined
}
object SchemaGoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse {
  
  inline def apply(): SchemaGoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse]
  }
  
  extension [Self <: SchemaGoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse](x: Self) {
    
    inline def setDevice(value: SchemaGoogleAppsCloudidentityDevicesV1Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
