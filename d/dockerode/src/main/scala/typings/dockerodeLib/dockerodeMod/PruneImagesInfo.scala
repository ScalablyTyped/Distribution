package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PruneImagesInfo extends js.Object {
  var ImagesDeleted: js.Array[ImageRemoveInfo]
  var SpaceReclaimed: scala.Double
}

object PruneImagesInfo {
  @scala.inline
  def apply(ImagesDeleted: js.Array[ImageRemoveInfo], SpaceReclaimed: scala.Double): PruneImagesInfo = {
    val __obj = js.Dynamic.literal(ImagesDeleted = ImagesDeleted, SpaceReclaimed = SpaceReclaimed)
  
    __obj.asInstanceOf[PruneImagesInfo]
  }
}

