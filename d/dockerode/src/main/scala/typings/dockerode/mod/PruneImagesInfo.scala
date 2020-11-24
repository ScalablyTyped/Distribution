package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PruneImagesInfo extends js.Object {
  
  var ImagesDeleted: js.Array[ImageRemoveInfo] = js.native
  
  var SpaceReclaimed: Double = js.native
}
object PruneImagesInfo {
  
  @scala.inline
  def apply(ImagesDeleted: js.Array[ImageRemoveInfo], SpaceReclaimed: Double): PruneImagesInfo = {
    val __obj = js.Dynamic.literal(ImagesDeleted = ImagesDeleted.asInstanceOf[js.Any], SpaceReclaimed = SpaceReclaimed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PruneImagesInfo]
  }
  
  @scala.inline
  implicit class PruneImagesInfoOps[Self <: PruneImagesInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImagesDeletedVarargs(value: ImageRemoveInfo*): Self = this.set("ImagesDeleted", js.Array(value :_*))
    
    @scala.inline
    def setImagesDeleted(value: js.Array[ImageRemoveInfo]): Self = this.set("ImagesDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceReclaimed(value: Double): Self = this.set("SpaceReclaimed", value.asInstanceOf[js.Any])
  }
}
