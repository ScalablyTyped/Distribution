package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDevicesDeviceusersBlock
  extends StObject
     with StandardParameters {
  
  /**
    * Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device\}/deviceUsers/{device_user\}`, where device is the unique ID assigned to the Device, and device_user is the unique ID assigned to the User.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAppsCloudidentityDevicesV1BlockDeviceUserRequest] = js.undefined
}
object ParamsResourceDevicesDeviceusersBlock {
  
  inline def apply(): ParamsResourceDevicesDeviceusersBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDevicesDeviceusersBlock]
  }
  
  extension [Self <: ParamsResourceDevicesDeviceusersBlock](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAppsCloudidentityDevicesV1BlockDeviceUserRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
