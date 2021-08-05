package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var center: js.Any
  
  var farthest: js.Any
  
  var nearest: js.Any
}
object Center {
  
  inline def apply(center: js.Any, farthest: js.Any, nearest: js.Any): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], farthest = farthest.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  extension [Self <: Center](x: Self) {
    
    inline def setCenter(value: js.Any): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setFarthest(value: js.Any): Self = StObject.set(x, "farthest", value.asInstanceOf[js.Any])
    
    inline def setNearest(value: js.Any): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
  }
}
