package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginSettings extends js.Object {
  
  var Args: js.Array[String] = js.native
  
  var Devices: js.Array[PluginDevice] = js.native
  
  var Env: js.Array[String] = js.native
  
  var Mounts: js.Array[PluginMount] = js.native
}
object PluginSettings {
  
  @scala.inline
  def apply(
    Args: js.Array[String],
    Devices: js.Array[PluginDevice],
    Env: js.Array[String],
    Mounts: js.Array[PluginMount]
  ): PluginSettings = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Devices = Devices.asInstanceOf[js.Any], Env = Env.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSettings]
  }
  
  @scala.inline
  implicit class PluginSettingsOps[Self <: PluginSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("Args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesVarargs(value: PluginDevice*): Self = this.set("Devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[PluginDevice]): Self = this.set("Devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = this.set("Env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = this.set("Env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountsVarargs(value: PluginMount*): Self = this.set("Mounts", js.Array(value :_*))
    
    @scala.inline
    def setMounts(value: js.Array[PluginMount]): Self = this.set("Mounts", value.asInstanceOf[js.Any])
  }
}
