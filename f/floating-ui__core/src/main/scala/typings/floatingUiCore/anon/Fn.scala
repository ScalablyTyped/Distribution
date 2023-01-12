package typings.floatingUiCore.anon

import typings.floatingUiCore.srcTypesMod.Coords
import typings.floatingUiCore.srcTypesMod.MiddlewareArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fn extends StObject {
  
  def fn(middlewareArguments: MiddlewareArguments): Coords
  
  var options: js.UndefOr[Any] = js.undefined
}
object Fn {
  
  inline def apply(fn: MiddlewareArguments => Coords): Fn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn))
    __obj.asInstanceOf[Fn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fn] (val x: Self) extends AnyVal {
    
    inline def setFn(value: MiddlewareArguments => Coords): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
