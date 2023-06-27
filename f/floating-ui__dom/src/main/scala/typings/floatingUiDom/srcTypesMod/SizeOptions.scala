package typings.floatingUiDom.srcTypesMod

import typings.floatingUiCore.srcTypesMod.ElementContext
import typings.floatingUiCore.srcTypesMod.Padding
import typings.floatingUiCore.srcTypesMod.RootBoundary
import typings.floatingUiDom.anon.MiddlewareStateavailableW
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @floating-ui/dom.@floating-ui/dom/src/types.Prettify<std.Omit<@floating-ui/core.@floating-ui/core.SizeOptions, 'apply' | 'boundary'> & @floating-ui/dom.@floating-ui/dom/src/types.DetectOverflowOptions & {  apply :(args : @floating-ui/dom.@floating-ui/dom/src/types.MiddlewareState & {  availableWidth :number,   availableHeight :number}): @floating-ui/dom.@floating-ui/dom/src/types.Promisable<void> | undefined}> */
trait SizeOptions extends StObject {
  
  var altBoundary: js.UndefOr[Boolean] = js.undefined
  
  @JSName("apply")
  var apply: js.UndefOr[js.Function1[/* args */ MiddlewareStateavailableW, Promisable[Unit]]] = js.undefined
  
  var boundary: js.UndefOr[Boundary] = js.undefined
  
  var elementContext: js.UndefOr[ElementContext] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
}
object SizeOptions {
  
  inline def apply(): SizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SizeOptions] (val x: Self) extends AnyVal {
    
    inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    inline def setApply(value: /* args */ MiddlewareStateavailableW => Promisable[Unit]): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setBoundaryVarargs(value: Element*): Self = StObject.set(x, "boundary", js.Array(value*))
    
    inline def setElementContext(value: ElementContext): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
    
    inline def setElementContextUndefined: Self = StObject.set(x, "elementContext", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
  }
}
