package typings.formatjsFastMemoize

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@formatjs/fast-memoize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[F /* <: Func */](fn: F): F | (js.Function1[/* arg */ Any, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[F | (js.Function1[/* arg */ Any, Any])]
  inline def default[F /* <: Func */](fn: F, options: Options[F]): F | (js.Function1[/* arg */ Any, Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[F | (js.Function1[/* arg */ Any, Any])]
  
  @JSImport("@formatjs/fast-memoize", "strategies")
  @js.native
  val strategies: Strategies_[Func] = js.native
  
  trait Cache[K, V] extends StObject {
    
    def create(): DefaultCache[K, V]
    @JSName("create")
    var create_Original: CacheCreateFunc[K, V]
  }
  object Cache {
    
    inline def apply[K, V](create: () => DefaultCache[K, V]): Cache[K, V] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
      __obj.asInstanceOf[Cache[K, V]]
    }
    
    extension [Self <: Cache[?, ?], K, V](x: Self & (Cache[K, V])) {
      
      inline def setCreate(value: () => DefaultCache[K, V]): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    }
  }
  
  type CacheCreateFunc[K, V] = js.Function0[DefaultCache[K, V]]
  
  trait DefaultCache[K, V] extends StObject {
    
    def get(key: K): V
    
    def set(key: K, value: V): Unit
  }
  object DefaultCache {
    
    inline def apply[K, V](get: K => V, set: (K, V) => Unit): DefaultCache[K, V] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[DefaultCache[K, V]]
    }
    
    extension [Self <: DefaultCache[?, ?], K, V](x: Self & (DefaultCache[K, V])) {
      
      inline def setGet(value: K => V): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (K, V) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Func extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type MemoizeFunc[F /* <: Func */] = js.Function2[/* fn */ F, /* options */ js.UndefOr[Options[F]], F]
  
  trait Options[F /* <: Func */] extends StObject {
    
    var cache: js.UndefOr[Cache[String, ReturnType[F]]] = js.undefined
    
    var serializer: js.UndefOr[Serializer] = js.undefined
    
    var strategy: js.UndefOr[MemoizeFunc[F]] = js.undefined
  }
  object Options {
    
    inline def apply[F /* <: Func */](): Options[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[F]]
    }
    
    extension [Self <: Options[?], F /* <: Func */](x: Self & Options[F]) {
      
      inline def setCache(value: Cache[String, ReturnType[F]]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setSerializer(value: /* args */ js.Array[Any] => String): Self = StObject.set(x, "serializer", js.Any.fromFunction1(value))
      
      inline def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
      
      inline def setStrategy(value: (F, /* options */ js.UndefOr[Options[F]]) => F): Self = StObject.set(x, "strategy", js.Any.fromFunction2(value))
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  trait ResolvedOptions[F /* <: Func */] extends StObject {
    
    var cache: Cache[String, ReturnType[F]]
    
    def serializer(args: js.Array[Any]): String
    @JSName("serializer")
    var serializer_Original: Serializer
  }
  object ResolvedOptions {
    
    inline def apply[F /* <: Func */](cache: Cache[String, ReturnType[F]], serializer: /* args */ js.Array[Any] => String): ResolvedOptions[F] = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], serializer = js.Any.fromFunction1(serializer))
      __obj.asInstanceOf[ResolvedOptions[F]]
    }
    
    extension [Self <: ResolvedOptions[?], F /* <: Func */](x: Self & ResolvedOptions[F]) {
      
      inline def setCache(value: Cache[String, ReturnType[F]]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setSerializer(value: /* args */ js.Array[Any] => String): Self = StObject.set(x, "serializer", js.Any.fromFunction1(value))
    }
  }
  
  type Serializer = js.Function1[/* args */ js.Array[Any], String]
  
  trait Strategies_[F /* <: Func */] extends StObject {
    
    def monadic(fn: F): F
    def monadic(fn: F, options: Options[F]): F
    @JSName("monadic")
    var monadic_Original: MemoizeFunc[F]
    
    def variadic(fn: F): F
    def variadic(fn: F, options: Options[F]): F
    @JSName("variadic")
    var variadic_Original: MemoizeFunc[F]
  }
  object Strategies_ {
    
    inline def apply[F /* <: Func */](
      monadic: (F, /* options */ js.UndefOr[Options[F]]) => F,
      variadic: (F, /* options */ js.UndefOr[Options[F]]) => F
    ): Strategies_[F] = {
      val __obj = js.Dynamic.literal(monadic = js.Any.fromFunction2(monadic), variadic = js.Any.fromFunction2(variadic))
      __obj.asInstanceOf[Strategies_[F]]
    }
    
    extension [Self <: Strategies_[?], F /* <: Func */](x: Self & Strategies_[F]) {
      
      inline def setMonadic(value: (F, /* options */ js.UndefOr[Options[F]]) => F): Self = StObject.set(x, "monadic", js.Any.fromFunction2(value))
      
      inline def setVariadic(value: (F, /* options */ js.UndefOr[Options[F]]) => F): Self = StObject.set(x, "variadic", js.Any.fromFunction2(value))
    }
  }
  
  type StrategyFn = js.ThisFunction4[
    /* this */ Any, 
    /* fn */ Func, 
    /* cache */ DefaultCache[String, ReturnType[Func]], 
    /* serializer */ Serializer, 
    /* arg */ Any, 
    Any
  ]
}
