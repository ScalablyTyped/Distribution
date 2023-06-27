package typings.floatingUiCore

import typings.floatingUiCore.anon.Fn
import typings.floatingUiCore.anon.Options
import typings.floatingUiCore.anon.PartialmainAxisnumbercrosCrossAxis
import typings.floatingUiCore.srcTypesMod.Boundary
import typings.floatingUiCore.srcTypesMod.Derivable
import typings.floatingUiCore.srcTypesMod.ElementContext
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.MiddlewareState
import typings.floatingUiCore.srcTypesMod.Padding
import typings.floatingUiCore.srcTypesMod.RootBoundary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareShiftMod {
  
  @JSImport("@floating-ui/core/src/middleware/shift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def limitShift(): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")().asInstanceOf[Fn]
  inline def limitShift(options: LimitShiftOptions): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")(options.asInstanceOf[js.Any]).asInstanceOf[Fn]
  inline def limitShift(options: Derivable[LimitShiftOptions]): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")(options.asInstanceOf[js.Any]).asInstanceOf[Fn]
  
  inline def shift(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[Middleware]
  inline def shift(options: ShiftOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def shift(options: Derivable[ShiftOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  type LimitShiftOffset = Double | PartialmainAxisnumbercrosCrossAxis
  
  /* Inlined std.Partial<{  offset :@floating-ui/core.@floating-ui/core/src/middleware/shift.LimitShiftOffset | @floating-ui/core.@floating-ui/core/src/types.Derivable<@floating-ui/core.@floating-ui/core/src/middleware/shift.LimitShiftOffset>,   mainAxis :boolean,   crossAxis :boolean}> */
  trait LimitShiftOptions extends StObject {
    
    var crossAxis: js.UndefOr[Boolean] = js.undefined
    
    var mainAxis: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[LimitShiftOffset | Derivable[LimitShiftOffset]] = js.undefined
  }
  object LimitShiftOptions {
    
    inline def apply(): LimitShiftOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitShiftOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LimitShiftOptions] (val x: Self) extends AnyVal {
      
      inline def setCrossAxis(value: Boolean): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
      
      inline def setCrossAxisUndefined: Self = StObject.set(x, "crossAxis", js.undefined)
      
      inline def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
      
      inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
      
      inline def setOffset(value: LimitShiftOffset | Derivable[LimitShiftOffset]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction1(value: /* state */ MiddlewareState => LimitShiftOffset): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@floating-ui/core.@floating-ui/core/src/detectOverflow.Options & {  mainAxis :boolean,   crossAxis :boolean,   limiter :{fn (state : @floating-ui/core.@floating-ui/core/src/types.MiddlewareState): @floating-ui/core.@floating-ui/core/src/types.Coords,   options :any | undefined}}> */
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
}
