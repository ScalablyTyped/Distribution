package typings.floatingUiDom.anon

import typings.floatingUiCore.srcTypesMod.ElementContext
import typings.floatingUiCore.srcTypesMod.Padding
import typings.floatingUiDom.floatingUiDomStrings.escaped
import typings.floatingUiDom.floatingUiDomStrings.referenceHidden
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@floating-ui/core.@floating-ui/core.HideOptions & @floating-ui/dom.@floating-ui/dom/src/types.DetectOverflowOptions> */
trait PartialHideOptionsDetectO extends StObject {
  
  var altBoundary: js.UndefOr[Boolean] = js.undefined
  
  var boundary: js.UndefOr[typings.floatingUiDom.srcTypesMod.Boundary] = js.undefined
  
  var elementContext: js.UndefOr[ElementContext] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var rootBoundary: js.UndefOr[typings.floatingUiCore.srcTypesMod.RootBoundary] = js.undefined
  
  var strategy: js.UndefOr[referenceHidden | escaped] = js.undefined
}
object PartialHideOptionsDetectO {
  
  inline def apply(): PartialHideOptionsDetectO = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHideOptionsDetectO]
  }
  
  extension [Self <: PartialHideOptionsDetectO](x: Self) {
    
    inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    inline def setBoundary(value: typings.floatingUiDom.srcTypesMod.Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setBoundaryVarargs(value: typings.std.Element*): Self = StObject.set(x, "boundary", js.Array(value*))
    
    inline def setElementContext(value: ElementContext): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
    
    inline def setElementContextUndefined: Self = StObject.set(x, "elementContext", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRootBoundary(value: typings.floatingUiCore.srcTypesMod.RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
    
    inline def setStrategy(value: referenceHidden | escaped): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
