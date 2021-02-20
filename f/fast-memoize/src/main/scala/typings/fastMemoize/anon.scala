package typings.fastMemoize

import typings.fastMemoize.mod.Func
import typings.fastMemoize.mod.MemoizeFunc
import typings.fastMemoize.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Get[K, V] extends StObject {
    
    def get(key: K): V = js.native
    
    def has(key: K): Boolean = js.native
    
    def set(key: K, value: V): Unit = js.native
  }
  object Get {
    
    @scala.inline
    def apply[K, V](get: K => V, has: K => Boolean, set: (K, V) => Unit): Get[K, V] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Get[K, V]]
    }
    
    @scala.inline
    implicit class GetMutableBuilder[Self <: Get[_, _], K, V] (val x: Self with (Get[K, V])) extends AnyVal {
      
      @scala.inline
      def setGet(value: K => V): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: K => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (K, V) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Monadic extends StObject {
    
    def monadic[F /* <: Func */](fn: F): F = js.native
    def monadic[F /* <: Func */](fn: F, options: Options[F]): F = js.native
    @JSName("monadic")
    var monadic_Original: MemoizeFunc = js.native
    
    def variadic[F /* <: Func */](fn: F): F = js.native
    def variadic[F /* <: Func */](fn: F, options: Options[F]): F = js.native
    @JSName("variadic")
    var variadic_Original: MemoizeFunc = js.native
  }
}
