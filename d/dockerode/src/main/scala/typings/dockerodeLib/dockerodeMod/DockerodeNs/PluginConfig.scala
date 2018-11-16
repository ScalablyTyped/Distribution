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

