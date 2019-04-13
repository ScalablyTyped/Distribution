package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PruneNetworksInfo extends js.Object {
  var NetworksDeleted: js.Array[java.lang.String]
}

object PruneNetworksInfo {
  @scala.inline
  def apply(NetworksDeleted: js.Array[java.lang.String]): PruneNetworksInfo = {
    val __obj = js.Dynamic.literal(NetworksDeleted = NetworksDeleted)
  
    __obj.asInstanceOf[PruneNetworksInfo]
  }
}

