package typings.floatingUiDom.srcTypesMod

import typings.floatingUiCore.srcTypesMod.MiddlewareReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @floating-ui/dom.@floating-ui/dom/src/types.Prettify<std.Omit<@floating-ui/core.@floating-ui/core.Middleware, 'fn'> & {fn (state : @floating-ui/dom.@floating-ui/dom/src/types.MiddlewareState): @floating-ui/dom.@floating-ui/dom/src/types.Promisable<@floating-ui/core.@floating-ui/core.MiddlewareReturn>}> */
trait Middleware extends StObject {
  
  def fn(state: MiddlewareState): Promisable[MiddlewareReturn]
  @JSName("fn")
  var fn_Original: js.Function1[/* state */ MiddlewareState, Promisable[MiddlewareReturn]]
  
  var name: String
  
  var options: js.UndefOr[Any] = js.undefined
}
object Middleware {
  
  inline def apply(fn: /* state */ MiddlewareState => Promisable[MiddlewareReturn], name: String): Middleware = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middleware]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Middleware] (val x: Self) extends AnyVal {
    
    inline def setFn(value: /* state */ MiddlewareState => Promisable[MiddlewareReturn]): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
