package typings.floatingUiDom.srcTypesMod

import typings.floatingUiCore.anon.Options
import typings.floatingUiCore.srcTypesMod.ElementContext
import typings.floatingUiCore.srcTypesMod.Padding
import typings.floatingUiCore.srcTypesMod.RootBoundary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @floating-ui/dom.@floating-ui/dom/src/types.Prettify<std.Omit<@floating-ui/core.@floating-ui/core.ShiftOptions, 'boundary'> & @floating-ui/dom.@floating-ui/dom/src/types.DetectOverflowOptions> */
trait ShiftOptions extends StObject {
  
  var altBoundary: js.UndefOr[Boolean] = js.undefined
  
  var boundary: js.UndefOr[Boundary] = js.undefined
  
  var crossAxis: js.UndefOr[Boolean] = js.undefined
  
  var elementContext: js.UndefOr[ElementContext] = js.undefined
  
  var limiter: js.UndefOr[Options] = js.undefined
  
  var mainAxis: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
}
object ShiftOptions {
  
  inline def apply(): ShiftOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShiftOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShiftOptions] (val x: Self) extends AnyVal {
    
    inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setBoundaryVarargs(value: Element*): Self = StObject.set(x, "boundary", js.Array(value*))
    
    inline def setCrossAxis(value: Boolean): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
    
    inline def setCrossAxisUndefined: Self = StObject.set(x, "crossAxis", js.undefined)
    
    inline def setElementContext(value: ElementContext): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
    
    inline def setElementContextUndefined: Self = StObject.set(x, "elementContext", js.undefined)
    
    inline def setLimiter(value: Options): Self = StObject.set(x, "limiter", value.asInstanceOf[js.Any])
    
    inline def setLimiterUndefined: Self = StObject.set(x, "limiter", js.undefined)
    
    inline def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
  }
}
