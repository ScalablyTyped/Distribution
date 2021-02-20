package typings.fastMemoize

import org.scalablytyped.runtime.Shortcut
import typings.fastMemoize.anon.Get
import typings.fastMemoize.anon.Monadic
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fast-memoize", JSImport.Default)
  @js.native
  val default: Memoize = js.native
  
  @js.native
  trait Cache[K, V] extends StObject {
    
    def create(): Get[K, V] = js.native
    @JSName("create")
    var create_Original: CacheCreateFunc[K, V] = js.native
  }
  
  type CacheCreateFunc[K, V] = js.Function0[Get[K, V]]
  
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  
  @js.native
  trait Memoize extends MemoizeFunc {
    
    var strategies: Monadic = js.native
  }
  
  type MemoizeFunc = js.Function2[/* fn */ Func, /* options */ js.UndefOr[Options[Func]], Func]
  
  @js.native
  trait Options[F /* <: Func */] extends StObject {
    
    var cache: js.UndefOr[Cache[String, ReturnType[F]]] = js.native
    
    var serializer: js.UndefOr[Serializer] = js.native
    
    var strategy: js.UndefOr[MemoizeFunc] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[F /* <: Func */](): Options[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[F]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], F /* <: Func */] (val x: Self with Options[F]) extends AnyVal {
      
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
