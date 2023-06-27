package typings.floatingUiCore.anon

import typings.floatingUiCore.srcTypesMod.Coords
import typings.floatingUiCore.srcTypesMod.MiddlewareState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fn extends StObject {
  
  def fn(state: MiddlewareState): Coords
  
  var options: Any
}
object Fn {
  
  inline def apply(fn: MiddlewareState => Coords, options: Any): Fn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fn] (val x: Self) extends AnyVal {
    
    inline def setFn(value: MiddlewareState => Coords): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
