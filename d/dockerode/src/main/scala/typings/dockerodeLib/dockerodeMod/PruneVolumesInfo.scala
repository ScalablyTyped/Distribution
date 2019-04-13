package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PruneVolumesInfo extends js.Object {
  var SpaceReclaimed: scala.Double
  var VolumesDeleted: js.Array[java.lang.String]
}

object PruneVolumesInfo {
  @scala.inline
  def apply(SpaceReclaimed: scala.Double, VolumesDeleted: js.Array[java.lang.String]): PruneVolumesInfo = {
    val __obj = js.Dynamic.literal(SpaceReclaimed = SpaceReclaimed, VolumesDeleted = VolumesDeleted)
  
    __obj.asInstanceOf[PruneVolumesInfo]
  }
}

