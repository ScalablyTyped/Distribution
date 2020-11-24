package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PruneVolumesInfo extends js.Object {
  
  var SpaceReclaimed: Double = js.native
  
  var VolumesDeleted: js.Array[String] = js.native
}
object PruneVolumesInfo {
  
  @scala.inline
  def apply(SpaceReclaimed: Double, VolumesDeleted: js.Array[String]): PruneVolumesInfo = {
    val __obj = js.Dynamic.literal(SpaceReclaimed = SpaceReclaimed.asInstanceOf[js.Any], VolumesDeleted = VolumesDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[PruneVolumesInfo]
  }
  
  @scala.inline
  implicit class PruneVolumesInfoOps[Self <: PruneVolumesInfo] (val x: Self) extends AnyVal {
    
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
    def setSpaceReclaimed(value: Double): Self = this.set("SpaceReclaimed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesDeletedVarargs(value: String*): Self = this.set("VolumesDeleted", js.Array(value :_*))
    
    @scala.inline
    def setVolumesDeleted(value: js.Array[String]): Self = this.set("VolumesDeleted", value.asInstanceOf[js.Any])
  }
}
