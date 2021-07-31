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
  
  @scala.inline
  def apply(AllowAllDevices: Boolean, Capabilities: js.Array[String], Devices: js.Array[PluginDevice]): Linux = {
    val __obj = js.Dynamic.literal(AllowAllDevices = AllowAllDevices.asInstanceOf[js.Any], Capabilities = Capabilities.asInstanceOf[js.Any], Devices = Devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linux]
  }
  
  @scala.inline
  implicit class LinuxMutableBuilder[Self <: Linux] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAllDevices(value: Boolean): Self = StObject.set(x, "AllowAllDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[PluginDevice]): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesVarargs(value: PluginDevice*): Self = StObject.set(x, "Devices", js.Array(value :_*))
  }
}
