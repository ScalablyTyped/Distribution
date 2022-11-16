package typings.floatingUiCore.srcTypesMod

import typings.floatingUiCore.floatingUiCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputePositionConfig extends StObject {
  
  var middleware: js.UndefOr[js.Array[js.UndefOr[Middleware | Null | `false`]]] = js.undefined
  
  var placement: js.UndefOr[Placement] = js.undefined
  
  var platform: Platform
  
  var strategy: js.UndefOr[Strategy] = js.undefined
}
object ComputePositionConfig {
  
  inline def apply(platform: Platform): ComputePositionConfig = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputePositionConfig]
  }
  
  extension [Self <: ComputePositionConfig](x: Self) {
    
    inline def setMiddleware(value: js.Array[js.UndefOr[Middleware | Null | `false`]]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    inline def setMiddlewareVarargs(value: (js.UndefOr[Middleware | Null | `false`])*): Self = StObject.set(x, "middleware", js.Array(value*))
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
