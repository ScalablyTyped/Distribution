package typings.flat

import org.scalablytyped.runtime.Shortcut
import typings.flat.mod.FlatTypes.Flatten
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    trait FlattenOptions extends StObject {
      
      var delimiter: js.UndefOr[String] = js.undefined
      
      var maxDepth: js.UndefOr[Double] = js.undefined
      
      var safe: js.UndefOr[Boolean] = js.undefined
      
      var transformKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.undefined
    }
    object FlattenOptions {
      
      inline def apply(): FlattenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FlattenOptions]
      }
      
      extension [Self <: FlattenOptions](x: Self) {
        
        inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
        
        inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
        
        inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
        
        inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
        
        inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
        
        inline def setTransformKey(value: /* key */ String => String): Self = StObject.set(x, "transformKey", js.Any.fromFunction1(value))
        
        inline def setTransformKeyUndefined: Self = StObject.set(x, "transformKey", js.undefined)
      }
    }
    
    type Unflatten = js.Function2[/* target */ js.Any, /* options */ js.UndefOr[UnflattenOptions], js.Any]
    
    trait UnflattenOptions extends StObject {
      
      var delimiter: js.UndefOr[String] = js.undefined
      
      var `object`: js.UndefOr[Boolean] = js.undefined
      
      var overwrite: js.UndefOr[Boolean] = js.undefined
      
      var transformKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.undefined
    }
    object UnflattenOptions {
      
      inline def apply(): UnflattenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UnflattenOptions]
      }
      
      extension [Self <: UnflattenOptions](x: Self) {
        
        inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
        
        inline def setObject(value: Boolean): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
        
        inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
        
        inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
        
        inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
        
        inline def setTransformKey(value: /* key */ String => String): Self = StObject.set(x, "transformKey", js.Any.fromFunction1(value))
        
        inline def setTransformKeyUndefined: Self = StObject.set(x, "transformKey", js.undefined)
      }
    }
  }
  
  type _To = Flatten
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Flatten = ^
}
