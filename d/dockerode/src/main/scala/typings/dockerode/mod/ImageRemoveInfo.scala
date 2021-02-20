package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageRemoveInfo extends StObject {
  
  var Deleted: String = js.native
  
  var Untagged: String = js.native
}
object ImageRemoveInfo {
  
  @scala.inline
  def apply(Deleted: String, Untagged: String): ImageRemoveInfo = {
    val __obj = js.Dynamic.literal(Deleted = Deleted.asInstanceOf[js.Any], Untagged = Untagged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRemoveInfo]
  }
  
  @scala.inline
  implicit class ImageRemoveInfoMutableBuilder[Self <: ImageRemoveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: String): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntagged(value: String): Self = StObject.set(x, "Untagged", value.asInstanceOf[js.Any])
  }
}
