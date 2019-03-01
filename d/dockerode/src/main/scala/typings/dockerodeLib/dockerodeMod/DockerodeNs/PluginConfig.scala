package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConfig extends js.Object {
  var Args: Args
  var Description: java.lang.String
  var Documentation: java.lang.String
  var Entrypoint: js.Array[java.lang.String]
  var Env: js.Array[PluginEnv]
  var Interface: js.Any
  var Linux: Linux
  var Mounts: js.Array[PluginMount]
  var Network: Network
  var PropagatedMount: java.lang.String
  var User: js.UndefOr[User] = js.undefined
  var WorkDir: java.lang.String
  var rootfs: js.Any
}

object PluginConfig {
  @scala.inline
  def apply(
    Args: Args,
    Description: java.lang.String,
    Documentation: java.lang.String,
    Entrypoint: js.Array[java.lang.String],
    Env: js.Array[PluginEnv],
    Interface: js.Any,
    Linux: Linux,
    Mounts: js.Array[PluginMount],
    Network: Network,
    PropagatedMount: java.lang.String,
    WorkDir: java.lang.String,
    rootfs: js.Any,
    User: User = null
  ): PluginConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Args")(Args)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Documentation")(Documentation)
    __obj.updateDynamic("Entrypoint")(Entrypoint)
    __obj.updateDynamic("Env")(Env)
    __obj.updateDynamic("Interface")(Interface)
    __obj.updateDynamic("Linux")(Linux)
    __obj.updateDynamic("Mounts")(Mounts)
    __obj.updateDynamic("Network")(Network)
    __obj.updateDynamic("PropagatedMount")(PropagatedMount)
    __obj.updateDynamic("WorkDir")(WorkDir)
    __obj.updateDynamic("rootfs")(rootfs)
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[PluginConfig]
  }
}

