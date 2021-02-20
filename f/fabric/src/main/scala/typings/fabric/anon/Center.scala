package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Center extends StObject {
  
  var center: js.Any = js.native
  
  var farthest: js.Any = js.native
  
  var nearest: js.Any = js.native
}
object Center {
  
  @scala.inline
  def apply(center: js.Any, farthest: js.Any, nearest: js.Any): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], farthest = farthest.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit class CenterMutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: js.Any): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFarthest(value: js.Any): Self = StObject.set(x, "farthest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearest(value: js.Any): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
  }
}
