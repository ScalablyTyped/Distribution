package typings.flat

import org.scalablytyped.runtime.Shortcut
import typings.flat.mod.FlatTypes.Flatten
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("flat", JSImport.Namespace)
  @js.native
  val ^ : Flatten = js.native
  
  object FlatTypes {
    
    @js.native
    trait Flatten extends StObject {
      
      def apply[TTarget, TResult](target: TTarget): TResult = js.native
      def apply[TTarget, TResult](target: TTarget, options: FlattenOptions): TResult = js.native
      
      def flatten[TTarget, TResult](target: TTarget): TResult = js.native
      def flatten[TTarget, TResult](target: TTarget, options: FlattenOptions): TResult = js.native
      @JSName("flatten")
      var flatten_Original: Flatten = js.native
      
      def unflatten[TTarget, TResult](target: TTarget): TResult = js.native
      def unflatten[TTarget, TResult](target: TTarget, options: UnflattenOptions): TResult = js.native
      @JSName("unflatten")
      var unflatten_Original: Unflatten = js.native
    }
    
    @js.native
    trait FlattenOptions extends StObject {
      
      var delimiter: js.UndefOr[String] = js.native
      
      var maxDepth: js.UndefOr[Double] = js.native
      
      var safe: js.UndefOr[Boolean] = js.native
      
      var transformKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.native
    }
    object FlattenOptions {
      
      @scala.inline
      def apply(): FlattenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FlattenOptions]
      }
      
      @scala.inline
      implicit class FlattenOptionsMutableBuilder[Self <: FlattenOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
        
        @scala.inline
        def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
        
        @scala.inline
        def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
        
        @scala.inline
        def setTransformKey(value: /* key */ String => String): Self = StObject.set(x, "transformKey", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTransformKeyUndefined: Self = StObject.set(x, "transformKey", js.undefined)
      }
    }
    
    type Unflatten = js.Function2[/* target */ js.Any, /* options */ js.UndefOr[UnflattenOptions], js.Any]
    
    @js.native
    trait UnflattenOptions extends StObject {
      
      var delimiter: js.UndefOr[String] = js.native
      
      var `object`: js.UndefOr[Boolean] = js.native
      
      var overwrite: js.UndefOr[Boolean] = js.native
      
      var transformKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.native
    }
    object UnflattenOptions {
      
      @scala.inline
      def apply(): UnflattenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UnflattenOptions]
      }
      
      @scala.inline
      implicit class UnflattenOptionsMutableBuilder[Self <: UnflattenOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
        
        @scala.inline
        def setObject(value: Boolean): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
        
        @scala.inline
        def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
        
        @scala.inline
        def setTransformKey(value: /* key */ String => String): Self = StObject.set(x, "transformKey", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTransformKeyUndefined: Self = StObject.set(x, "transformKey", js.undefined)
      }
    }
  }
  
  type _To = Flatten
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Flatten = ^
}
