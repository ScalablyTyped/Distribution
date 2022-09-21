package typings.floatingUiCore.anon

import typings.floatingUiCore.floatingUiCoreStrings.escaped
import typings.floatingUiCore.floatingUiCoreStrings.referenceHidden
import typings.floatingUiCore.typesMod.ElementContext
import typings.floatingUiCore.typesMod.Padding
import typings.floatingUiCore.typesMod.RootBoundary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@floating-ui/core.@floating-ui/core/src/middleware/hide.Options & @floating-ui/core.@floating-ui/core/src/detectOverflow.Options> */
trait PartialOptionsOptionsBoundary extends StObject {
  
  var altBoundary: js.UndefOr[Boolean] = js.undefined
  
  var boundary: js.UndefOr[typings.floatingUiCore.typesMod.Boundary] = js.undefined
  
  var elementContext: js.UndefOr[ElementContext] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
  
  var strategy: js.UndefOr[referenceHidden | escaped] = js.undefined
}
object PartialOptionsOptionsBoundary {
  
  inline def apply(): PartialOptionsOptionsBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsOptionsBoundary]
  }
  
  extension [Self <: PartialOptionsOptionsBoundary](x: Self) {
    
    inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    inline def setBoundary(value: typings.floatingUiCore.typesMod.Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setElementContext(value: ElementContext): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
    
    inline def setElementContextUndefined: Self = StObject.set(x, "elementContext", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
    
    inline def setStrategy(value: referenceHidden | escaped): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
