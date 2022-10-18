package typings.floatingUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overflows extends StObject {
  
  var overflows: js.Array[Double]
  
  var placement: typings.floatingUiCore.srcTypesMod.Placement
}
object Overflows {
  
  inline def apply(overflows: js.Array[Double], placement: typings.floatingUiCore.srcTypesMod.Placement): Overflows = {
    val __obj = js.Dynamic.literal(overflows = overflows.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overflows]
  }
  
  extension [Self <: Overflows](x: Self) {
    
    inline def setOverflows(value: js.Array[Double]): Self = StObject.set(x, "overflows", value.asInstanceOf[js.Any])
    
    inline def setOverflowsVarargs(value: Double*): Self = StObject.set(x, "overflows", js.Array(value*))
    
    inline def setPlacement(value: typings.floatingUiCore.srcTypesMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
  }
}
