package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PruneContainersInfo extends StObject {
  
  var ContainersDeleted: js.Array[String]
  
  var SpaceReclaimed: Double
}
object PruneContainersInfo {
  
  inline def apply(ContainersDeleted: js.Array[String], SpaceReclaimed: Double): PruneContainersInfo = {
    val __obj = js.Dynamic.literal(ContainersDeleted = ContainersDeleted.asInstanceOf[js.Any], SpaceReclaimed = SpaceReclaimed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PruneContainersInfo]
  }
  
  extension [Self <: PruneContainersInfo](x: Self) {
    
    inline def setContainersDeleted(value: js.Array[String]): Self = StObject.set(x, "ContainersDeleted", value.asInstanceOf[js.Any])
    
    inline def setContainersDeletedVarargs(value: String*): Self = StObject.set(x, "ContainersDeleted", js.Array(value*))
    
    inline def setSpaceReclaimed(value: Double): Self = StObject.set(x, "SpaceReclaimed", value.asInstanceOf[js.Any])
  }
}
