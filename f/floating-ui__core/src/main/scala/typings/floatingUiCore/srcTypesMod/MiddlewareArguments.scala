package typings.floatingUiCore.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiddlewareArguments
  extends StObject
     with Coords {
  
  var elements: Elements
  
  var initialPlacement: Placement
  
  var middlewareData: MiddlewareData
  
  var placement: Placement
  
  var platform: Platform
  
  var rects: ElementRects
  
  var strategy: Strategy
}
object MiddlewareArguments {
  
  inline def apply(
    elements: Elements,
    initialPlacement: Placement,
    middlewareData: MiddlewareData,
    placement: Placement,
    platform: Platform,
    rects: ElementRects,
    strategy: Strategy,
    x: Double,
    y: Double
  ): MiddlewareArguments = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], initialPlacement = initialPlacement.asInstanceOf[js.Any], middlewareData = middlewareData.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], rects = rects.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MiddlewareArguments] (val x: Self) extends AnyVal {
    
    inline def setElements(value: Elements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setInitialPlacement(value: Placement): Self = StObject.set(x, "initialPlacement", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareData(value: MiddlewareData): Self = StObject.set(x, "middlewareData", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setRects(value: ElementRects): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
