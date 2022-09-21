package typings.floatingUiCore.anon

import typings.floatingUiCore.shiftMod.LimitShiftOffset
import typings.floatingUiCore.typesMod.Coords
import typings.floatingUiCore.typesMod.MiddlewareArguments
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  def fn(middlewareArguments: MiddlewareArguments): Coords
  
  var options: Partial[LimitShiftOffset]
}
object Options {
  
  inline def apply(fn: MiddlewareArguments => Coords, options: Partial[LimitShiftOffset]): Options = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setFn(value: MiddlewareArguments => Coords): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setOptions(value: Partial[LimitShiftOffset]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
