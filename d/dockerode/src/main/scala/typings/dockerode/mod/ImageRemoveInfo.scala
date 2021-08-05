package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageRemoveInfo extends StObject {
  
  var Deleted: String
  
  var Untagged: String
}
object ImageRemoveInfo {
  
  inline def apply(Deleted: String, Untagged: String): ImageRemoveInfo = {
    val __obj = js.Dynamic.literal(Deleted = Deleted.asInstanceOf[js.Any], Untagged = Untagged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRemoveInfo]
  }
  
  extension [Self <: ImageRemoveInfo](x: Self) {
    
    inline def setDeleted(value: String): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    inline def setUntagged(value: String): Self = StObject.set(x, "Untagged", value.asInstanceOf[js.Any])
  }
}
