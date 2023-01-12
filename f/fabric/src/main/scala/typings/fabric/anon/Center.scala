package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var center: Any
  
  var farthest: Any
  
  var nearest: Any
}
object Center {
  
  inline def apply(center: Any, farthest: Any, nearest: Any): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], farthest = farthest.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: Any): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setFarthest(value: Any): Self = StObject.set(x, "farthest", value.asInstanceOf[js.Any])
    
    inline def setNearest(value: Any): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
  }
}
