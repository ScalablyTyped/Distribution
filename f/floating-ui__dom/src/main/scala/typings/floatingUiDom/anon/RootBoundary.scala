package typings.floatingUiDom.anon

import typings.floatingUiCore.srcTypesMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootBoundary extends StObject {
  
  var boundary: typings.floatingUiCore.srcTypesMod.Boundary
  
  var element: typings.std.Element
  
  var rootBoundary: typings.floatingUiCore.srcTypesMod.RootBoundary
  
  var strategy: Strategy
}
object RootBoundary {
  
  inline def apply(
    boundary: typings.floatingUiCore.srcTypesMod.Boundary,
    element: typings.std.Element,
    rootBoundary: typings.floatingUiCore.srcTypesMod.RootBoundary,
    strategy: Strategy
  ): RootBoundary = {
    val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootBoundary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootBoundary] (val x: Self) extends AnyVal {
    
    inline def setBoundary(value: typings.floatingUiCore.srcTypesMod.Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setRootBoundary(value: typings.floatingUiCore.srcTypesMod.RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
