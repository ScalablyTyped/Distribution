package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PruneContainersInfo extends js.Object {
  var ContainersDeleted: js.Array[String]
  var SpaceReclaimed: Double
}

object PruneContainersInfo {
  @scala.inline
  def apply(ContainersDeleted: js.Array[String], SpaceReclaimed: Double): PruneContainersInfo = {
    val __obj = js.Dynamic.literal(ContainersDeleted = ContainersDeleted.asInstanceOf[js.Any], SpaceReclaimed = SpaceReclaimed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PruneContainersInfo]
  }
}

