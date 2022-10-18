package typings.floatingUiCore.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputePositionReturn
  extends StObject
     with Coords {
  
  var middlewareData: MiddlewareData
  
  var placement: Placement
  
  var strategy: Strategy
}
object ComputePositionReturn {
  
  inline def apply(middlewareData: MiddlewareData, placement: Placement, strategy: Strategy, x: Double, y: Double): ComputePositionReturn = {
    val __obj = js.Dynamic.literal(middlewareData = middlewareData.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputePositionReturn]
  }
  
  extension [Self <: ComputePositionReturn](x: Self) {
    
    inline def setMiddlewareData(value: MiddlewareData): Self = StObject.set(x, "middlewareData", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
