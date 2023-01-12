package typings.fastify.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Del extends StObject {
  
  def del(version: String): Unit
  
  def empty(): Unit
  
  def get(version: String): String | Null
  
  def set(version: String, store: js.Function): Unit
}
object Del {
  
  inline def apply(
    del: String => Unit,
    empty: () => Unit,
    get: String => String | Null,
    set: (String, js.Function) => Unit
  ): Del = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), empty = js.Any.fromFunction0(empty), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Del]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Del] (val x: Self) extends AnyVal {
    
    inline def setDel(value: String => Unit): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
    
    inline def setEmpty(value: () => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
    
    inline def setGet(value: String => String | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (String, js.Function) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
