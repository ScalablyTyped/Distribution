package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PruneNetworksInfo extends js.Object {
  var NetworksDeleted: js.Array[java.lang.String]
}

object PruneNetworksInfo {
  @scala.inline
  def apply(NetworksDeleted: js.Array[java.lang.String]): PruneNetworksInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("NetworksDeleted")(NetworksDeleted)
    __obj.asInstanceOf[PruneNetworksInfo]
  }
}

