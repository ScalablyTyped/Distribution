package typings.floatingUiCore.anon

import typings.floatingUiCore.srcMiddlewareShiftMod.LimitShiftOffset
import typings.floatingUiCore.srcTypesMod.Coords
import typings.floatingUiCore.srcTypesMod.MiddlewareArguments
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fn extends StObject {
  
  def fn(middlewareArguments: MiddlewareArguments): Coords
  
  var options: Partial[LimitShiftOffset]
}
object Fn {
  
  inline def apply(fn: MiddlewareArguments => Coords, options: Partial[LimitShiftOffset]): Fn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fn]
  }
  
  extension [Self <: Fn](x: Self) {
    
    inline def setFn(value: MiddlewareArguments => Coords): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setOptions(value: Partial[LimitShiftOffset]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsFunction1(value: /* args */ MiddlewareArguments => Double | CrossAxis): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
  }
}
