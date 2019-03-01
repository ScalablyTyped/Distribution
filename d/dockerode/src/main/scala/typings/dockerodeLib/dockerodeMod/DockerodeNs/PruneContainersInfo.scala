package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PruneContainersInfo extends js.Object {
  var ContainersDeleted: js.Array[java.lang.String]
  var SpaceReclaimed: scala.Double
}

object PruneContainersInfo {
  @scala.inline
  def apply(ContainersDeleted: js.Array[java.lang.String], SpaceReclaimed: scala.Double): PruneContainersInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContainersDeleted")(ContainersDeleted)
    __obj.updateDynamic("SpaceReclaimed")(SpaceReclaimed)
    __obj.asInstanceOf[PruneContainersInfo]
  }
}

