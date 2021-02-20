package typings.flexmonster.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsRemoved extends StObject {
  
  var isRemoved: Boolean = js.native
  
  var uniqueName: String = js.native
}
object IsRemoved {
  
  @scala.inline
  def apply(isRemoved: Boolean, uniqueName: String): IsRemoved = {
    val __obj = js.Dynamic.literal(isRemoved = isRemoved.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRemoved]
  }
  
  @scala.inline
  implicit class IsRemovedMutableBuilder[Self <: IsRemoved] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRemoved(value: Boolean): Self = StObject.set(x, "isRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
  }
}
