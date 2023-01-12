package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginSettings extends StObject {
  
  var Args: js.Array[String]
  
  var Devices: js.Array[PluginDevice]
  
  var Env: js.Array[String]
  
  var Mounts: js.Array[PluginMount]
}
object PluginSettings {
  
  inline def apply(
    Args: js.Array[String],
    Devices: js.Array[PluginDevice],
    Env: js.Array[String],
    Mounts: js.Array[PluginMount]
  ): PluginSettings = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Devices = Devices.asInstanceOf[js.Any], Env = Env.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginSettings] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "Args", js.Array(value*))
    
    inline def setDevices(value: js.Array[PluginDevice]): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: PluginDevice*): Self = StObject.set(x, "Devices", js.Array(value*))
    
    inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "Env", value.asInstanceOf[js.Any])
    
    inline def setEnvVarargs(value: String*): Self = StObject.set(x, "Env", js.Array(value*))
    
    inline def setMounts(value: js.Array[PluginMount]): Self = StObject.set(x, "Mounts", value.asInstanceOf[js.Any])
    
    inline def setMountsVarargs(value: PluginMount*): Self = StObject.set(x, "Mounts", js.Array(value*))
  }
}
