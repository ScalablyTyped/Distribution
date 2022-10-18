package typings.floatingUiCore.anon

import typings.floatingUiCore.srcTypesMod.ElementContext
import typings.floatingUiCore.srcTypesMod.Padding
import typings.floatingUiCore.srcTypesMod.RootBoundary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@floating-ui/core.@floating-ui/core/src/middleware/size.Options & @floating-ui/core.@floating-ui/core/src/detectOverflow.Options> */
trait PartialOptionsOptionsApply extends StObject {
  
  var altBoundary: js.UndefOr[Boolean] = js.undefined
  
  @JSName("apply")
  var apply: js.UndefOr[js.Function1[/* args */ MiddlewareArgumentsavaila, Unit | js.Promise[Unit]]] = js.undefined
  
  var boundary: js.UndefOr[typings.floatingUiCore.srcTypesMod.Boundary] = js.undefined
  
  var elementContext: js.UndefOr[ElementContext] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
}
object PartialOptionsOptionsApply {
  
  inline def apply(): PartialOptionsOptionsApply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsOptionsApply]
  }
  
  extension [Self <: PartialOptionsOptionsApply](x: Self) {
    
    inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    inline def setApply(value: /* args */ MiddlewareArgumentsavaila => Unit | js.Promise[Unit]): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setBoundary(value: typings.floatingUiCore.srcTypesMod.Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setElementContext(value: ElementContext): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
    
    inline def setElementContextUndefined: Self = StObject.set(x, "elementContext", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
  }
}
