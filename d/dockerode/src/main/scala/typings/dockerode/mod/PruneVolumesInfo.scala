package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PruneVolumesInfo extends StObject {
  
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
  implicit class PruneVolumesInfoMutableBuilder[Self <: PruneVolumesInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpaceReclaimed(value: Double): Self = StObject.set(x, "SpaceReclaimed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesDeleted(value: js.Array[String]): Self = StObject.set(x, "VolumesDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesDeletedVarargs(value: String*): Self = StObject.set(x, "VolumesDeleted", js.Array(value :_*))
  }
}
