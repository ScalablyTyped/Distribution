package typings.floatingUiDom.anon

import typings.floatingUiCore.typesMod.Placement
import typings.floatingUiCore.typesMod.Strategy
import typings.floatingUiDom.typesMod.Middleware
import typings.floatingUiDom.typesMod.Platform_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@floating-ui/dom.@floating-ui/dom/src/types.ComputePositionConfig> */
trait PartialComputePositionCon extends StObject {
  
  var middleware: js.UndefOr[js.Array[Middleware]] = js.undefined
  
  var placement: js.UndefOr[Placement] = js.undefined
  
  var platform: js.UndefOr[Platform_] = js.undefined
  
  var strategy: js.UndefOr[Strategy] = js.undefined
}
object PartialComputePositionCon {
  
  inline def apply(): PartialComputePositionCon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialComputePositionCon]
  }
  
  extension [Self <: PartialComputePositionCon](x: Self) {
    
    inline def setMiddleware(value: js.Array[Middleware]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    inline def setMiddlewareVarargs(value: Middleware*): Self = StObject.set(x, "middleware", js.Array(value*))
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setPlatform(value: Platform_): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
