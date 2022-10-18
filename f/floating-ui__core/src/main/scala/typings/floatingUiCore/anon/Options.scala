package typings.floatingUiCore.anon

import typings.floatingUiCore.srcTypesMod.Coords
import typings.floatingUiCore.srcTypesMod.MiddlewareArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  def fn(middlewareArguments: MiddlewareArguments): Coords
  
  var options: js.UndefOr[Any] = js.undefined
}
object Options {
  
  inline def apply(fn: MiddlewareArguments => Coords): Options = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn))
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setFn(value: MiddlewareArguments => Coords): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
