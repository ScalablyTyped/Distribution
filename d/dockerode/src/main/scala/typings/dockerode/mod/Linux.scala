package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Linux extends StObject {
  
  var AllowAllDevices: Boolean
  
  var Capabilities: js.Array[String]
  
  var Devices: js.Array[PluginDevice]
}
object Linux {
  
  inline def apply(AllowAllDevices: Boolean, Capabilities: js.Array[String], Devices: js.Array[PluginDevice]): Linux = {
    val __obj = js.Dynamic.literal(AllowAllDevices = AllowAllDevices.asInstanceOf[js.Any], Capabilities = Capabilities.asInstanceOf[js.Any], Devices = Devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linux]
  }
  
  extension [Self <: Linux](x: Self) {
    
    inline def setAllowAllDevices(value: Boolean): Self = StObject.set(x, "AllowAllDevices", value.asInstanceOf[js.Any])
    
    inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "Capabilities", js.Array(value*))
    
    inline def setDevices(value: js.Array[PluginDevice]): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: PluginDevice*): Self = StObject.set(x, "Devices", js.Array(value*))
  }
}
