package typings.floatingUiCore.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @floating-ui/core.@floating-ui/core/src/types.Axis ]: number} */
trait Coords extends StObject {
  
  var x: Double
  
  var y: Double
}
object Coords {
  
  inline def apply(x: Double, y: Double): Coords = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coords]
  }
  
  extension [Self <: Coords](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
