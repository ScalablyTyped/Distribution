package typings.floatingUiCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Middleware extends StObject {
  
  def fn(middlewareArguments: MiddlewareArguments): Promisable[MiddlewareReturn]
  
  var name: String
  
  var options: js.UndefOr[Any] = js.undefined
}
object Middleware {
  
  inline def apply(fn: MiddlewareArguments => Promisable[MiddlewareReturn], name: String): Middleware = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middleware]
  }
  
  extension [Self <: Middleware](x: Self) {
    
    inline def setFn(value: MiddlewareArguments => Promisable[MiddlewareReturn]): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
