package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Linux extends js.Object {
  var AllowAllDevices: Boolean = js.native
  var Capabilities: js.Array[String] = js.native
  var Devices: js.Array[PluginDevice] = js.native
}

object Linux {
  @scala.inline
  def apply(AllowAllDevices: Boolean, Capabilities: js.Array[String], Devices: js.Array[PluginDevice]): Linux = {
    val __obj = js.Dynamic.literal(AllowAllDevices = AllowAllDevices.asInstanceOf[js.Any], Capabilities = Capabilities.asInstanceOf[js.Any], Devices = Devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linux]
  }
  @scala.inline
  implicit class LinuxOps[Self <: Linux] (val x: Self) extends AnyVal {
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
    def setAllowAllDevices(value: Boolean): Self = this.set("AllowAllDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapabilitiesVarargs(value: String*): Self = this.set("Capabilities", js.Array(value :_*))
    @scala.inline
    def setCapabilities(value: js.Array[String]): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevicesVarargs(value: PluginDevice*): Self = this.set("Devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: js.Array[PluginDevice]): Self = this.set("Devices", value.asInstanceOf[js.Any])
  }
  
}

