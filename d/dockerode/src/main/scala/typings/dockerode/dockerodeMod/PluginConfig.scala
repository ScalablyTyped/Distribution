package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConfig extends js.Object {
  var Args: typings.dockerode.dockerodeMod.Args
  var Description: String
  var Documentation: String
  var Entrypoint: js.Array[String]
  var Env: js.Array[PluginEnv]
  var Interface: js.Any
  var Linux: typings.dockerode.dockerodeMod.Linux
  var Mounts: js.Array[PluginMount]
  var Network: typings.dockerode.dockerodeMod.Network
  var PropagatedMount: String
  var User: js.UndefOr[typings.dockerode.dockerodeMod.User] = js.undefined
  var WorkDir: String
  var rootfs: js.Any
}

object PluginConfig {
  @scala.inline
  def apply(
    Args: Args,
    Description: String,
    Documentation: String,
    Entrypoint: js.Array[String],
    Env: js.Array[PluginEnv],
    Interface: js.Any,
    Linux: Linux,
    Mounts: js.Array[PluginMount],
    Network: Network,
    PropagatedMount: String,
    WorkDir: String,
    rootfs: js.Any,
    User: User = null
  ): PluginConfig = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Documentation = Documentation.asInstanceOf[js.Any], Entrypoint = Entrypoint.asInstanceOf[js.Any], Env = Env.asInstanceOf[js.Any], Interface = Interface.asInstanceOf[js.Any], Linux = Linux.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any], Network = Network.asInstanceOf[js.Any], PropagatedMount = PropagatedMount.asInstanceOf[js.Any], WorkDir = WorkDir.asInstanceOf[js.Any], rootfs = rootfs.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConfig]
  }
}

