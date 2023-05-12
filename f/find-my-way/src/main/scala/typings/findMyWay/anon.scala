package typings.findMyWay

import typings.findMyWay.mod.HTTPMethod
import typings.findMyWay.mod.HTTPVersion
import typings.findMyWay.mod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CommonPrefix extends StObject {
    
    var commonPrefix: js.UndefOr[Boolean] = js.undefined
    
    var includeMeta: js.UndefOr[Boolean | (js.Array[String | js.Symbol])] = js.undefined
    
    var method: js.UndefOr[HTTPMethod] = js.undefined
  }
  object CommonPrefix {
    
    inline def apply(): CommonPrefix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonPrefix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonPrefix] (val x: Self) extends AnyVal {
      
      inline def setCommonPrefix(value: Boolean): Self = StObject.set(x, "commonPrefix", value.asInstanceOf[js.Any])
      
      inline def setCommonPrefixUndefined: Self = StObject.set(x, "commonPrefix", js.undefined)
      
      inline def setIncludeMeta(value: Boolean | (js.Array[String | js.Symbol])): Self = StObject.set(x, "includeMeta", value.asInstanceOf[js.Any])
      
      inline def setIncludeMetaUndefined: Self = StObject.set(x, "includeMeta", js.undefined)
      
      inline def setIncludeMetaVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "includeMeta", js.Array(value*))
      
      inline def setMethod(value: HTTPMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  trait Del[T, V /* <: HTTPVersion */] extends StObject {
    
    var del: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
    
    var empty: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def get(value: T): Handler[V] | Null
    
    def set(value: T, handler: Handler[V]): Unit
  }
  object Del {
    
    inline def apply[T, V /* <: HTTPVersion */](get: T => Handler[V] | Null, set: (T, Handler[V]) => Unit): Del[T, V] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Del[T, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Del[?, ?], T, V /* <: HTTPVersion */] (val x: Self & (Del[T, V])) extends AnyVal {
      
      inline def setDel(value: /* value */ T => Unit): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
      
      inline def setEmpty(value: () => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setGet(value: T => Handler[V] | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (T, Handler[V]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
