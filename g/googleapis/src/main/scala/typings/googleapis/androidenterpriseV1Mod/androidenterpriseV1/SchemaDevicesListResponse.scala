package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDevicesListResponse extends StObject {
  
  /**
    * A managed device.
    */
  var device: js.UndefOr[js.Array[SchemaDevice]] = js.undefined
}
object SchemaDevicesListResponse {
  
  inline def apply(): SchemaDevicesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevicesListResponse]
  }
  
  extension [Self <: SchemaDevicesListResponse](x: Self) {
    
    inline def setDevice(value: js.Array[SchemaDevice]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDeviceVarargs(value: SchemaDevice*): Self = StObject.set(x, "device", js.Array(value*))
  }
}
