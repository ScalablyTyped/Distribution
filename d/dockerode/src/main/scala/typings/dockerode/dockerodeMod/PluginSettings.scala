package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSettings extends js.Object {
  var Args: js.Array[String]
  var Devices: js.Array[PluginDevice]
  var Env: js.Array[String]
  var Mounts: js.Array[PluginMount]
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
}

