package typings.findMyWay

import typings.findMyWay.mod.HTTPVersion
import typings.findMyWay.mod.Handler
import typings.findMyWay.mod.Req
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Del[V /* <: HTTPVersion */] extends StObject {
    
    def del(version: String): Unit = js.native
    
    def empty(): Unit = js.native
    
    def get(version: String): Handler[V] | Null = js.native
    
    def set(version: String, store: Handler[V]): Unit = js.native
  }
  object Del {
    
    @scala.inline
    def apply[V /* <: HTTPVersion */](
      del: String => Unit,
      empty: () => Unit,
      get: String => Handler[V] | Null,
      set: (String, Handler[V]) => Unit
    ): Del[V] = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), empty = js.Any.fromFunction0(empty), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Del[V]]
    }
    
    @scala.inline
    implicit class DelMutableBuilder[Self <: Del[_], V /* <: HTTPVersion */] (val x: Self with Del[V]) extends AnyVal {
      
      @scala.inline
      def setDel(value: String => Unit): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmpty(value: () => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: String => Handler[V] | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (String, Handler[V]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait DeriveVersion[V /* <: HTTPVersion */] extends StObject {
    
    def deriveVersion[Context](req: Req[V]): String = js.native
    def deriveVersion[Context](req: Req[V], ctx: Context): String = js.native
    
    def storage(): Del[V] = js.native
  }
}
