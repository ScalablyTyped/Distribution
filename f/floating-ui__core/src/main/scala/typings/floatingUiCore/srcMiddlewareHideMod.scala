package typings.floatingUiCore

import typings.floatingUiCore.floatingUiCoreStrings.escaped
import typings.floatingUiCore.floatingUiCoreStrings.referenceHidden
import typings.floatingUiCore.srcTypesMod.Boundary
import typings.floatingUiCore.srcTypesMod.Derivable
import typings.floatingUiCore.srcTypesMod.ElementContext
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.Padding
import typings.floatingUiCore.srcTypesMod.RootBoundary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareHideMod {
  
  @JSImport("@floating-ui/core/src/middleware/hide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hide(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Middleware]
  inline def hide(options: HideOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def hide(options: Derivable[HideOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  /* Inlined std.Partial<@floating-ui/core.@floating-ui/core/src/detectOverflow.Options & {  strategy :'referenceHidden' | 'escaped'}> */
  trait HideOptions extends StObject {
    
    var altBoundary: js.UndefOr[Boolean] = js.undefined
    
    var boundary: js.UndefOr[Boundary] = js.undefined
    
    var elementContext: js.UndefOr[ElementContext] = js.undefined
    
    var padding: js.UndefOr[Padding] = js.undefined
    
    var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
    
    var strategy: js.UndefOr[referenceHidden | escaped] = js.undefined
  }
  object HideOptions {
    
    inline def apply(): HideOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HideOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HideOptions] (val x: Self) extends AnyVal {
      
      inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
      
      inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
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
}
