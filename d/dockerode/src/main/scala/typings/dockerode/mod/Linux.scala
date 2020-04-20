package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Linux extends js.Object {
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
}

