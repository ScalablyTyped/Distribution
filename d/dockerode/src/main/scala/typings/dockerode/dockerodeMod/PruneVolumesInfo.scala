package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PruneVolumesInfo extends js.Object {
  var SpaceReclaimed: Double
  var VolumesDeleted: js.Array[String]
}

object PruneVolumesInfo {
  @scala.inline
  def apply(SpaceReclaimed: Double, VolumesDeleted: js.Array[String]): PruneVolumesInfo = {
    val __obj = js.Dynamic.literal(SpaceReclaimed = SpaceReclaimed, VolumesDeleted = VolumesDeleted)
  
    __obj.asInstanceOf[PruneVolumesInfo]
  }
}

