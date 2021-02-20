package typings.expressProcessimage

import typings.express.mod.NextFunction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Middleware that processes images according to the query string.
    * It is intended to be used in a development setting with the static middleware,
    * but should play well with any middleware further down the stack,even an http proxy, via hijackresponse.
    */
  @JSImport("express-processimage", JSImport.Namespace)
  @js.native
  def apply(): NextFunction = js.native
  @JSImport("express-processimage", JSImport.Namespace)
  @js.native
  def apply(options: Options): NextFunction = js.native
  
  @js.native
  trait Options extends StObject {
    
    var allowOperation: js.UndefOr[js.Function2[/* operationName */ String, /* repeated */ js.Any, Boolean]] = js.native
    
    var allowedImageSourceContentTypes: js.UndefOr[js.Array[String]] = js.native
    
    /** @debug false */
    var debug: js.UndefOr[Boolean] = js.native
    
    var filters: js.UndefOr[Record[String, Boolean]] = js.native
    
    var maxInputPixels: js.UndefOr[Double] = js.native
    
    var maxOutputPixels: js.UndefOr[Double] = js.native
    
    var onPipeline: js.UndefOr[js.Function1[/* pipeline */ js.Object, Unit]] = js.native
    
    var root: js.UndefOr[String] = js.native
    
    /** @defult false */
    var secondGuessSourceContentType: js.UndefOr[Boolean] = js.native
    
    var sharpCache: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowOperation(value: (/* operationName */ String, /* repeated */ js.Any) => Boolean): Self = StObject.set(x, "allowOperation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAllowOperationUndefined: Self = StObject.set(x, "allowOperation", js.undefined)
      
      @scala.inline
      def setAllowedImageSourceContentTypes(value: js.Array[String]): Self = StObject.set(x, "allowedImageSourceContentTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedImageSourceContentTypesUndefined: Self = StObject.set(x, "allowedImageSourceContentTypes", js.undefined)
      
      @scala.inline
      def setAllowedImageSourceContentTypesVarargs(value: String*): Self = StObject.set(x, "allowedImageSourceContentTypes", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setFilters(value: Record[String, Boolean]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setMaxInputPixels(value: Double): Self = StObject.set(x, "maxInputPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInputPixelsUndefined: Self = StObject.set(x, "maxInputPixels", js.undefined)
      
      @scala.inline
      def setMaxOutputPixels(value: Double): Self = StObject.set(x, "maxOutputPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOutputPixelsUndefined: Self = StObject.set(x, "maxOutputPixels", js.undefined)
      
      @scala.inline
      def setOnPipeline(value: /* pipeline */ js.Object => Unit): Self = StObject.set(x, "onPipeline", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPipelineUndefined: Self = StObject.set(x, "onPipeline", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSecondGuessSourceContentType(value: Boolean): Self = StObject.set(x, "secondGuessSourceContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondGuessSourceContentTypeUndefined: Self = StObject.set(x, "secondGuessSourceContentType", js.undefined)
      
      @scala.inline
      def setSharpCache(value: Double): Self = StObject.set(x, "sharpCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharpCacheUndefined: Self = StObject.set(x, "sharpCache", js.undefined)
    }
  }
}
