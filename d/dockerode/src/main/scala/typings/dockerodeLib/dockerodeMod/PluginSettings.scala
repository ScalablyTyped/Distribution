package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSettings extends js.Object {
  var Args: js.Array[java.lang.String]
  var Devices: js.Array[PluginDevice]
  var Env: js.Array[java.lang.String]
  var Mounts: js.Array[PluginMount]
}

object PluginSettings {
  @scala.inline
  def apply(
    Args: js.Array[java.lang.String],
    Devices: js.Array[PluginDevice],
    Env: js.Array[java.lang.String],
    Mounts: js.Array[PluginMount]
  ): PluginSettings = {
    val __obj = js.Dynamic.literal(Args = Args, Devices = Devices, Env = Env, Mounts = Mounts)
  
    __obj.asInstanceOf[PluginSettings]
  }
}

