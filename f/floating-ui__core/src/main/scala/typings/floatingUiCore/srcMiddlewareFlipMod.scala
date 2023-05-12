package typings.floatingUiCore

import typings.floatingUiCore.anon.PartialOptionsOptionsAltBoundary
import typings.floatingUiCore.floatingUiCoreStrings.bestFit
import typings.floatingUiCore.floatingUiCoreStrings.end
import typings.floatingUiCore.floatingUiCoreStrings.initialPlacement
import typings.floatingUiCore.floatingUiCoreStrings.none
import typings.floatingUiCore.floatingUiCoreStrings.start
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareFlipMod {
  
  @JSImport("@floating-ui/core/src/middleware/flip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flip(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")().asInstanceOf[Middleware]
  inline def flip(options: PartialOptionsOptionsAltBoundary): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  trait Options extends StObject {
    
    /**
      * The axis that runs along the alignment of the floating element. Determines
      * whether overflow along this axis is checked to perform a flip.
      * @default true
      */
    var crossAxis: Boolean
    
    /**
      * Whether to allow fallback to the perpendicular axis of the preferred
      * placement, and if so, which side direction along the axis to prefer.
      * @default 'none' (disallow fallback)
      */
    var fallbackAxisSideDirection: none | start | end
    
    /**
      * Placements to try sequentially if the preferred `placement` does not fit.
      * @default [oppositePlacement] (computed)
      */
    var fallbackPlacements: js.Array[Placement]
    
    /**
      * What strategy to use when no placements fit.
      * @default 'bestFit'
      */
    var fallbackStrategy: bestFit | initialPlacement
    
    /**
      * Whether to flip to placements with the opposite alignment if they fit
      * better.
      * @default true
      */
    var flipAlignment: Boolean
    
    /**
      * The axis that runs along the side of the floating element. Determines
      * whether overflow along this axis is checked to perform a flip.
      * @default true
      */
    var mainAxis: Boolean
  }
  object Options {
    
    inline def apply(
      crossAxis: Boolean,
      fallbackAxisSideDirection: none | start | end,
      fallbackPlacements: js.Array[Placement],
      fallbackStrategy: bestFit | initialPlacement,
      flipAlignment: Boolean,
      mainAxis: Boolean
    ): Options = {
      val __obj = js.Dynamic.literal(crossAxis = crossAxis.asInstanceOf[js.Any], fallbackAxisSideDirection = fallbackAxisSideDirection.asInstanceOf[js.Any], fallbackPlacements = fallbackPlacements.asInstanceOf[js.Any], fallbackStrategy = fallbackStrategy.asInstanceOf[js.Any], flipAlignment = flipAlignment.asInstanceOf[js.Any], mainAxis = mainAxis.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCrossAxis(value: Boolean): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
      
      inline def setFallbackAxisSideDirection(value: none | start | end): Self = StObject.set(x, "fallbackAxisSideDirection", value.asInstanceOf[js.Any])
      
      inline def setFallbackPlacements(value: js.Array[Placement]): Self = StObject.set(x, "fallbackPlacements", value.asInstanceOf[js.Any])
      
      inline def setFallbackPlacementsVarargs(value: Placement*): Self = StObject.set(x, "fallbackPlacements", js.Array(value*))
      
      inline def setFallbackStrategy(value: bestFit | initialPlacement): Self = StObject.set(x, "fallbackStrategy", value.asInstanceOf[js.Any])
      
      inline def setFlipAlignment(value: Boolean): Self = StObject.set(x, "flipAlignment", value.asInstanceOf[js.Any])
      
      inline def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    }
  }
}
