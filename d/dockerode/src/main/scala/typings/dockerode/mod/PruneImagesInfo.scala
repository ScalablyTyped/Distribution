package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PruneImagesInfo extends StObject {
  
  var ImagesDeleted: js.Array[ImageRemoveInfo]
  
  var SpaceReclaimed: Double
}
object PruneImagesInfo {
  
  inline def apply(ImagesDeleted: js.Array[ImageRemoveInfo], SpaceReclaimed: Double): PruneImagesInfo = {
    val __obj = js.Dynamic.literal(ImagesDeleted = ImagesDeleted.asInstanceOf[js.Any], SpaceReclaimed = SpaceReclaimed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PruneImagesInfo]
  }
  
  extension [Self <: PruneImagesInfo](x: Self) {
    
    inline def setImagesDeleted(value: js.Array[ImageRemoveInfo]): Self = StObject.set(x, "ImagesDeleted", value.asInstanceOf[js.Any])
    
    inline def setImagesDeletedVarargs(value: ImageRemoveInfo*): Self = StObject.set(x, "ImagesDeleted", js.Array(value :_*))
    
    inline def setSpaceReclaimed(value: Double): Self = StObject.set(x, "SpaceReclaimed", value.asInstanceOf[js.Any])
  }
}
