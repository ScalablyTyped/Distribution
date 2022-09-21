package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDevicesDeviceusersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device_id\}/deviceUsers/{device_user_id\}`, where device_id is the unique ID assigned to the Device, and device_user_id is the unique ID assigned to the User.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceDevicesDeviceusersDelete {
  
  inline def apply(): ParamsResourceDevicesDeviceusersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDevicesDeviceusersDelete]
  }
  
  extension [Self <: ParamsResourceDevicesDeviceusersDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
