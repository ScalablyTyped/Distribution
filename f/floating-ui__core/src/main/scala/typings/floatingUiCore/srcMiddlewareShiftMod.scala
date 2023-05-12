package typings.floatingUiCore

import typings.floatingUiCore.anon.CrossAxis
import typings.floatingUiCore.anon.Fn
import typings.floatingUiCore.anon.PartialLimitShiftOptions
import typings.floatingUiCore.anon.PartialOptionsOptionsCrossAxis
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.MiddlewareState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareShiftMod {
  
  @JSImport("@floating-ui/core/src/middleware/shift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def limitShift(): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")().asInstanceOf[Fn]
  inline def limitShift(options: PartialLimitShiftOptions): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")(options.asInstanceOf[js.Any]).asInstanceOf[Fn]
  
  inline def shift(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[Middleware]
  inline def shift(options: PartialOptionsOptionsCrossAxis): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  type LimitShiftOffset = (js.Function1[/* args */ MiddlewareState, Double | CrossAxis]) | Double | CrossAxis
  
  trait LimitShiftOptions extends StObject {
    
    /**
      * Whether to limit the axis that runs along the side of the floating element.
      */
    var crossAxis: Boolean
    
    /**
      * Whether to limit the axis that runs along the alignment of the floating
      * element.
      */
    var mainAxis: Boolean
    
    /**
      * Offset when limiting starts. `0` will limit when the opposite edges of the
      * reference and floating elements are aligned.
      * - positive = start limiting earlier
      * - negative = start limiting later
      */
    var offset: LimitShiftOffset
  }
  object LimitShiftOptions {
    
    inline def apply(crossAxis: Boolean, mainAxis: Boolean, offset: LimitShiftOffset): LimitShiftOptions = {
      val __obj = js.Dynamic.literal(crossAxis = crossAxis.asInstanceOf[js.Any], mainAxis = mainAxis.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[LimitShiftOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LimitShiftOptions] (val x: Self) extends AnyVal {
      
      inline def setCrossAxis(value: Boolean): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
      
      inline def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: LimitShiftOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction1(value: /* args */ MiddlewareState => Double | CrossAxis): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * The axis that runs along the side of the floating element. Determines
      * whether overflow along this axis is checked to perform shifting.
      * @default false
      */
    var crossAxis: Boolean
    
    /**
      * Accepts a function that limits the shifting done in order to prevent
      * detachment.
      */
    var limiter: typings.floatingUiCore.anon.Options
    
    /**
      * The axis that runs along the alignment of the floating element. Determines
      * whether overflow along this axis is checked to perform shifting.
      * @default true
      */
    var mainAxis: Boolean
  }
  object Options {
    
    inline def apply(crossAxis: Boolean, limiter: typings.floatingUiCore.anon.Options, mainAxis: Boolean): Options = {
      val __obj = js.Dynamic.literal(crossAxis = crossAxis.asInstanceOf[js.Any], limiter = limiter.asInstanceOf[js.Any], mainAxis = mainAxis.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCrossAxis(value: Boolean): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
      
      inline def setLimiter(value: typings.floatingUiCore.anon.Options): Self = StObject.set(x, "limiter", value.asInstanceOf[js.Any])
      
      inline def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    }
  }
}
