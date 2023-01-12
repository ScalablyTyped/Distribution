package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BestPath extends StObject {
  
  var componenets: js.Array[Change]
  
  var newPos: Double
}
object BestPath {
  
  inline def apply(componenets: js.Array[Change], newPos: Double): BestPath = {
    val __obj = js.Dynamic.literal(componenets = componenets.asInstanceOf[js.Any], newPos = newPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[BestPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BestPath] (val x: Self) extends AnyVal {
    
    inline def setComponenets(value: js.Array[Change]): Self = StObject.set(x, "componenets", value.asInstanceOf[js.Any])
    
    inline def setComponenetsVarargs(value: Change*): Self = StObject.set(x, "componenets", js.Array(value*))
    
    inline def setNewPos(value: Double): Self = StObject.set(x, "newPos", value.asInstanceOf[js.Any])
  }
}
