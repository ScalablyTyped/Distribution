package typings.fastMemoize

import org.scalablytyped.runtime.Shortcut
import typings.fastMemoize.anon.Get
import typings.fastMemoize.anon.Monadic
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fast-memoize", JSImport.Default)
  @js.native
  val default: Memoize = js.native
  
  trait Cache[K, V] extends StObject {
    
    def create(): Get[K, V]
    @JSName("create")
    var create_Original: CacheCreateFunc[K, V]
  }
  object Cache {
    
    @scala.inline
    def apply[K, V](create: () => Get[K, V]): Cache[K, V] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
      __obj.asInstanceOf[Cache[K, V]]
    }
    
    @scala.inline
    implicit class CacheMutableBuilder[Self <: Cache[?, ?], K, V] (val x: Self & (Cache[K, V])) extends AnyVal {
      
      @scala.inline
      def setCreate(value: () => Get[K, V]): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    }
  }
  
  type CacheCreateFunc[K, V] = js.Function0[Get[K, V]]
  
  @js.native
  trait Func extends StObject {
    
    def apply(args: js.Any*): js.Any = js.native
  }
  
  @js.native
  trait Memoize extends MemoizeFunc {
    
    var strategies: Monadic = js.native
  }
  
  type MemoizeFunc = js.Function2[/* fn */ Func, /* options */ js.UndefOr[Options[Func]], Func]
  
  trait Options[F /* <: Func */] extends StObject {
    
    var cache: js.UndefOr[Cache[String, ReturnType[F]]] = js.undefined
    
    var serializer: js.UndefOr[Serializer] = js.undefined
    
    var strategy: js.UndefOr[MemoizeFunc] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[F /* <: Func */](): Options[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[F]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], F /* <: Func */] (val x: Self & Options[F]) extends AnyVal {
      
      @scala.inline
      def setCache(value: Cache[String, ReturnType[F]]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setSerializer(value: /* args */ js.Array[js.Any] => String): Self = StObject.set(x, "serializer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
      
      @scala.inline
      def setStrategy(value: (/* fn */ Func, /* options */ js.UndefOr[Options[Func]]) => Func): Self = StObject.set(x, "strategy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  type Serializer = js.Function1[/* args */ js.Array[js.Any], String]
  
  type _To = Memoize
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Memoize = default
}
