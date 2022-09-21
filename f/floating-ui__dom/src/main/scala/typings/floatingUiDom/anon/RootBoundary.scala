package typings.floatingUiDom.anon

import typings.floatingUiCore.typesMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootBoundary extends StObject {
  
  var boundary: typings.floatingUiCore.typesMod.Boundary
  
  var element: typings.std.Element
  
  var rootBoundary: typings.floatingUiCore.typesMod.RootBoundary
  
  var strategy: Strategy
}
object RootBoundary {
  
  inline def apply(
    boundary: typings.floatingUiCore.typesMod.Boundary,
    element: typings.std.Element,
    rootBoundary: typings.floatingUiCore.typesMod.RootBoundary,
    strategy: Strategy
  ): RootBoundary = {
    val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootBoundary]
  }
  
  extension [Self <: RootBoundary](x: Self) {
    
    inline def setBoundary(value: typings.floatingUiCore.typesMod.Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setRootBoundary(value: typings.floatingUiCore.typesMod.RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
