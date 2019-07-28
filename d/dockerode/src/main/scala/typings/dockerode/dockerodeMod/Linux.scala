package typings.dockerode.dockerodeMod

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
    val __obj = js.Dynamic.literal(AllowAllDevices = AllowAllDevices, Capabilities = Capabilities, Devices = Devices)
  
    __obj.asInstanceOf[Linux]
  }
}

