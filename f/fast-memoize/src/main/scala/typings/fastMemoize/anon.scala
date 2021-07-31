package typings.fastMemoize

import typings.fastMemoize.mod.Func
import typings.fastMemoize.mod.MemoizeFunc
import typings.fastMemoize.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Get[K, V] extends StObject {
    
    def get(key: K): V
    
    def has(key: K): Boolean
    
    def set(key: K, value: V): Unit
  }
  object Get {
    
    @scala.inline
    def apply[K, V](get: K => V, has: K => Boolean, set: (K, V) => Unit): Get[K, V] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Get[K, V]]
    }
    
    @scala.inline
    implicit class GetMutableBuilder[Self <: Get[?, ?], K, V] (val x: Self & (Get[K, V])) extends AnyVal {
      
      @scala.inline
      def setGet(value: K => V): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: K => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (K, V) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait Monadic extends StObject {
    
    def monadic[F /* <: Func */](fn: F): F
    def monadic[F /* <: Func */](fn: F, options: Options[F]): F
    @JSName("monadic")
    var monadic_Original: MemoizeFunc
    
    def variadic[F /* <: Func */](fn: F): F
    def variadic[F /* <: Func */](fn: F, options: Options[F]): F
    @JSName("variadic")
    var variadic_Original: MemoizeFunc
  }
  object Monadic {
    
    @scala.inline
    def apply(
      monadic: (/* fn */ Func, /* options */ js.UndefOr[Options[Func]]) => Func,
      variadic: (/* fn */ Func, /* options */ js.UndefOr[Options[Func]]) => Func
    ): Monadic = {
      val __obj = js.Dynamic.literal(monadic = js.Any.fromFunction2(monadic), variadic = js.Any.fromFunction2(variadic))
      __obj.asInstanceOf[Monadic]
    }
    
    @scala.inline
    implicit class MonadicMutableBuilder[Self <: Monadic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMonadic(value: (/* fn */ Func, /* options */ js.UndefOr[Options[Func]]) => Func): Self = StObject.set(x, "monadic", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVariadic(value: (/* fn */ Func, /* options */ js.UndefOr[Options[Func]]) => Func): Self = StObject.set(x, "variadic", js.Any.fromFunction2(value))
    }
  }
}
