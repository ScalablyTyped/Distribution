package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceRequest extends StObject {
  
  var Capabilities: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  var Count: js.UndefOr[Double] = js.undefined
  
  var DeviceIDs: js.UndefOr[js.Array[String]] = js.undefined
  
  var Driver: js.UndefOr[String] = js.undefined
  
  var Options: js.UndefOr[StringDictionary[String]] = js.undefined
}
object DeviceRequest {
  
  inline def apply(): DeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceRequest]
  }
  
  extension [Self <: DeviceRequest](x: Self) {
    
    inline def setCapabilities(value: js.Array[js.Array[String]]): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: js.Array[String]*): Self = StObject.set(x, "Capabilities", js.Array(value :_*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setDeviceIDs(value: js.Array[String]): Self = StObject.set(x, "DeviceIDs", value.asInstanceOf[js.Any])
    
    inline def setDeviceIDsUndefined: Self = StObject.set(x, "DeviceIDs", js.undefined)
    
    inline def setDeviceIDsVarargs(value: String*): Self = StObject.set(x, "DeviceIDs", js.Array(value :_*))
    
    inline def setDriver(value: String): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    inline def setDriverUndefined: Self = StObject.set(x, "Driver", js.undefined)
    
    inline def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
  }
}
