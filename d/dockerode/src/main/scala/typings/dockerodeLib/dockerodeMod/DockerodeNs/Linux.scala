package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Linux extends js.Object {
  var AllowAllDevices: scala.Boolean
  var Capabilities: js.Array[java.lang.String]
  var Devices: js.Array[PluginDevice]
}

object Linux {
  @scala.inline
  def apply(
    AllowAllDevices: scala.Boolean,
    Capabilities: js.Array[java.lang.String],
    Devices: js.Array[PluginDevice]
  ): Linux = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllowAllDevices")(AllowAllDevices)
    __obj.updateDynamic("Capabilities")(Capabilities)
    __obj.updateDynamic("Devices")(Devices)
    __obj.asInstanceOf[Linux]
  }
}

