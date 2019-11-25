package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PruneImagesInfo extends js.Object {
  var ImagesDeleted: js.Array[ImageRemoveInfo]
  var SpaceReclaimed: Double
}

object PruneImagesInfo {
  @scala.inline
  def apply(ImagesDeleted: js.Array[ImageRemoveInfo], SpaceReclaimed: Double): PruneImagesInfo = {
    val __obj = js.Dynamic.literal(ImagesDeleted = ImagesDeleted.asInstanceOf[js.Any], SpaceReclaimed = SpaceReclaimed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PruneImagesInfo]
  }
}

