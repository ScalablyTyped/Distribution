package typings.floatingUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@floating-ui/core.@floating-ui/core/src/types.Coords> & {  centerOffset :number} */
trait PartialCoordscenterOffset extends StObject {
  
  var centerOffset: Double
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object PartialCoordscenterOffset {
  
  inline def apply(centerOffset: Double): PartialCoordscenterOffset = {
    val __obj = js.Dynamic.literal(centerOffset = centerOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCoordscenterOffset]
  }
  
  extension [Self <: PartialCoordscenterOffset](x: Self) {
    
    inline def setCenterOffset(value: Double): Self = StObject.set(x, "centerOffset", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
