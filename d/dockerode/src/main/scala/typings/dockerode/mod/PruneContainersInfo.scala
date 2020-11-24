package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PruneContainersInfo extends js.Object {
  
  var ContainersDeleted: js.Array[String] = js.native
  
  var SpaceReclaimed: Double = js.native
}
object PruneContainersInfo {
  
  @scala.inline
  def apply(ContainersDeleted: js.Array[String], SpaceReclaimed: Double): PruneContainersInfo = {
    val __obj = js.Dynamic.literal(ContainersDeleted = ContainersDeleted.asInstanceOf[js.Any], SpaceReclaimed = SpaceReclaimed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PruneContainersInfo]
  }
  
  @scala.inline
  implicit class PruneContainersInfoOps[Self <: PruneContainersInfo] (val x: Self) extends AnyVal {
    
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
    def setContainersDeletedVarargs(value: String*): Self = this.set("ContainersDeleted", js.Array(value :_*))
    
    @scala.inline
    def setContainersDeleted(value: js.Array[String]): Self = this.set("ContainersDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceReclaimed(value: Double): Self = this.set("SpaceReclaimed", value.asInstanceOf[js.Any])
  }
}
