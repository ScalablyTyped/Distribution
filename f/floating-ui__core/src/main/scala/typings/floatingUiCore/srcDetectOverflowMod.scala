package typings.floatingUiCore

import typings.floatingUiCore.srcTypesMod.Boundary
import typings.floatingUiCore.srcTypesMod.Derivable
import typings.floatingUiCore.srcTypesMod.ElementContext
import typings.floatingUiCore.srcTypesMod.MiddlewareState
import typings.floatingUiCore.srcTypesMod.Padding
import typings.floatingUiCore.srcTypesMod.RootBoundary
import typings.floatingUiCore.srcTypesMod.SideObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDetectOverflowMod {
  
  @JSImport("@floating-ui/core/src/detectOverflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectOverflow(state: MiddlewareState): js.Promise[SideObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SideObject]]
  inline def detectOverflow(state: MiddlewareState, options: Options): js.Promise[SideObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SideObject]]
  inline def detectOverflow(state: MiddlewareState, options: Derivable[Options]): js.Promise[SideObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SideObject]]
  
  /* Inlined std.Partial<{  boundary :@floating-ui/core.@floating-ui/core/src/types.Boundary,   rootBoundary :@floating-ui/core.@floating-ui/core/src/types.RootBoundary,   elementContext :@floating-ui/core.@floating-ui/core/src/types.ElementContext,   altBoundary :boolean,   padding :@floating-ui/core.@floating-ui/core/src/types.Padding}> */
  trait Options extends StObject {
    
    var altBoundary: js.UndefOr[Boolean] = js.undefined
    
    var boundary: js.UndefOr[Boundary] = js.undefined
    
    var elementContext: js.UndefOr[ElementContext] = js.undefined
    
    var padding: js.UndefOr[Padding] = js.undefined
    
    var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
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
    }
  }
}
