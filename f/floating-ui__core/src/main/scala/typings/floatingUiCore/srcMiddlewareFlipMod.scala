package typings.floatingUiCore

import typings.floatingUiCore.floatingUiCoreStrings.bestFit
import typings.floatingUiCore.floatingUiCoreStrings.end
import typings.floatingUiCore.floatingUiCoreStrings.initialPlacement
import typings.floatingUiCore.floatingUiCoreStrings.none
import typings.floatingUiCore.floatingUiCoreStrings.start
import typings.floatingUiCore.srcTypesMod.Boundary
import typings.floatingUiCore.srcTypesMod.Derivable
import typings.floatingUiCore.srcTypesMod.ElementContext
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.Padding
import typings.floatingUiCore.srcTypesMod.Placement
import typings.floatingUiCore.srcTypesMod.RootBoundary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareFlipMod {
  
  @JSImport("@floating-ui/core/src/middleware/flip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flip(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")().asInstanceOf[Middleware]
  inline def flip(options: FlipOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def flip(options: Derivable[FlipOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  /* Inlined std.Partial<@floating-ui/core.@floating-ui/core/src/types.DetectOverflowOptions & {  mainAxis :boolean,   crossAxis :boolean,   fallbackPlacements :std.Array<@floating-ui/core.@floating-ui/core/src/types.Placement>,   fallbackStrategy :'bestFit' | 'initialPlacement',   fallbackAxisSideDirection :'none' | 'start' | 'end',   flipAlignment :boolean}> */
  trait FlipOptions extends StObject {
    
    var altBoundary: js.UndefOr[Boolean] = js.undefined
    
    var boundary: js.UndefOr[Boundary] = js.undefined
    
    var crossAxis: js.UndefOr[Boolean] = js.undefined
    
    var elementContext: js.UndefOr[ElementContext] = js.undefined
    
    var fallbackAxisSideDirection: js.UndefOr[none | start | end] = js.undefined
    
    var fallbackPlacements: js.UndefOr[js.Array[Placement]] = js.undefined
    
    var fallbackStrategy: js.UndefOr[bestFit | initialPlacement] = js.undefined
    
    var flipAlignment: js.UndefOr[Boolean] = js.undefined
    
    var mainAxis: js.UndefOr[Boolean] = js.undefined
    
    var padding: js.UndefOr[Padding] = js.undefined
    
    var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
  }
  object FlipOptions {
    
    inline def apply(): FlipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlipOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlipOptions] (val x: Self) extends AnyVal {
      
      inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
      
      inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setCrossAxis(value: Boolean): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
      
      inline def setCrossAxisUndefined: Self = StObject.set(x, "crossAxis", js.undefined)
      
      inline def setElementContext(value: ElementContext): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
      
      inline def setElementContextUndefined: Self = StObject.set(x, "elementContext", js.undefined)
      
      inline def setFallbackAxisSideDirection(value: none | start | end): Self = StObject.set(x, "fallbackAxisSideDirection", value.asInstanceOf[js.Any])
      
      inline def setFallbackAxisSideDirectionUndefined: Self = StObject.set(x, "fallbackAxisSideDirection", js.undefined)
      
      inline def setFallbackPlacements(value: js.Array[Placement]): Self = StObject.set(x, "fallbackPlacements", value.asInstanceOf[js.Any])
      
      inline def setFallbackPlacementsUndefined: Self = StObject.set(x, "fallbackPlacements", js.undefined)
      
      inline def setFallbackPlacementsVarargs(value: Placement*): Self = StObject.set(x, "fallbackPlacements", js.Array(value*))
      
      inline def setFallbackStrategy(value: bestFit | initialPlacement): Self = StObject.set(x, "fallbackStrategy", value.asInstanceOf[js.Any])
      
      inline def setFallbackStrategyUndefined: Self = StObject.set(x, "fallbackStrategy", js.undefined)
      
      inline def setFlipAlignment(value: Boolean): Self = StObject.set(x, "flipAlignment", value.asInstanceOf[js.Any])
      
      inline def setFlipAlignmentUndefined: Self = StObject.set(x, "flipAlignment", js.undefined)
      
      inline def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
      
      inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
      
      inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
    }
  }
}
