package typings.floatingUiCore.srcTypesMod

import typings.floatingUiCore.floatingUiCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputePositionConfig extends StObject {
  
  /**
    * Array of middleware objects to modify the positioning or provide data for
    * rendering.
    */
  var middleware: js.UndefOr[js.Array[js.UndefOr[Middleware | Null | `false`]]] = js.undefined
  
  /**
    * Where to place the floating element relative to the reference element.
    */
  var placement: js.UndefOr[Placement] = js.undefined
  
  /**
    * Object to interface with the current platform.
    */
  var platform: Platform
  
  /**
    * The strategy to use when positioning the floating element.
    */
  var strategy: js.UndefOr[Strategy] = js.undefined
}
object ComputePositionConfig {
  
  inline def apply(platform: Platform): ComputePositionConfig = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputePositionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputePositionConfig] (val x: Self) extends AnyVal {
    
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
