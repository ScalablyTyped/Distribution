package typings.floatingUiDom.srcTypesMod

import typings.floatingUiCore.srcTypesMod.Placement
import typings.floatingUiCore.srcTypesMod.Strategy
import typings.floatingUiDom.floatingUiDomBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @floating-ui/dom.@floating-ui/dom/src/types.Prettify<std.Omit<@floating-ui/core.@floating-ui/core.ComputePositionConfig, 'middleware' | 'platform'> & {  middleware :std.Array<@floating-ui/dom.@floating-ui/dom/src/types.Middleware | null | undefined | false> | undefined,   platform :@floating-ui/dom.@floating-ui/dom/src/types.Platform | undefined}> */
trait ComputePositionConfig extends StObject {
  
  var middleware: js.UndefOr[js.Array[js.UndefOr[Middleware | Null | `false`]]] = js.undefined
  
  var placement: js.UndefOr[Placement] = js.undefined
  
  var platform: js.UndefOr[Platform_] = js.undefined
  
  var strategy: js.UndefOr[Strategy] = js.undefined
}
object ComputePositionConfig {
  
  inline def apply(): ComputePositionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputePositionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputePositionConfig] (val x: Self) extends AnyVal {
    
    inline def setMiddleware(value: js.Array[js.UndefOr[Middleware | Null | `false`]]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    inline def setMiddlewareVarargs(value: (js.UndefOr[Middleware | Null | `false`])*): Self = StObject.set(x, "middleware", js.Array(value*))
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setPlatform(value: Platform_): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
