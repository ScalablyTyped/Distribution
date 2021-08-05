package typings.expressProcessimage

import typings.express.mod.NextFunction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Middleware that processes images according to the query string.
    * It is intended to be used in a development setting with the static middleware,
    * but should play well with any middleware further down the stack,even an http proxy, via hijackresponse.
    */
  inline def apply(): NextFunction = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[NextFunction]
  inline def apply(options: Options): NextFunction = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[NextFunction]
  
  @JSImport("express-processimage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var allowOperation: js.UndefOr[js.Function2[/* operationName */ String, /* repeated */ js.Any, Boolean]] = js.undefined
    
    var allowedImageSourceContentTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /** @debug false */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var filters: js.UndefOr[Record[String, Boolean]] = js.undefined
    
    var maxInputPixels: js.UndefOr[Double] = js.undefined
    
    var maxOutputPixels: js.UndefOr[Double] = js.undefined
    
    var onPipeline: js.UndefOr[js.Function1[/* pipeline */ js.Object, Unit]] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    /** @defult false */
    var secondGuessSourceContentType: js.UndefOr[Boolean] = js.undefined
    
    var sharpCache: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowOperation(value: (/* operationName */ String, /* repeated */ js.Any) => Boolean): Self = StObject.set(x, "allowOperation", js.Any.fromFunction2(value))
      
      inline def setAllowOperationUndefined: Self = StObject.set(x, "allowOperation", js.undefined)
      
      inline def setAllowedImageSourceContentTypes(value: js.Array[String]): Self = StObject.set(x, "allowedImageSourceContentTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedImageSourceContentTypesUndefined: Self = StObject.set(x, "allowedImageSourceContentTypes", js.undefined)
      
      inline def setAllowedImageSourceContentTypesVarargs(value: String*): Self = StObject.set(x, "allowedImageSourceContentTypes", js.Array(value :_*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFilters(value: Record[String, Boolean]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setMaxInputPixels(value: Double): Self = StObject.set(x, "maxInputPixels", value.asInstanceOf[js.Any])
      
      inline def setMaxInputPixelsUndefined: Self = StObject.set(x, "maxInputPixels", js.undefined)
      
      inline def setMaxOutputPixels(value: Double): Self = StObject.set(x, "maxOutputPixels", value.asInstanceOf[js.Any])
      
      inline def setMaxOutputPixelsUndefined: Self = StObject.set(x, "maxOutputPixels", js.undefined)
      
      inline def setOnPipeline(value: /* pipeline */ js.Object => Unit): Self = StObject.set(x, "onPipeline", js.Any.fromFunction1(value))
      
      inline def setOnPipelineUndefined: Self = StObject.set(x, "onPipeline", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSecondGuessSourceContentType(value: Boolean): Self = StObject.set(x, "secondGuessSourceContentType", value.asInstanceOf[js.Any])
      
      inline def setSecondGuessSourceContentTypeUndefined: Self = StObject.set(x, "secondGuessSourceContentType", js.undefined)
      
      inline def setSharpCache(value: Double): Self = StObject.set(x, "sharpCache", value.asInstanceOf[js.Any])
      
      inline def setSharpCacheUndefined: Self = StObject.set(x, "sharpCache", js.undefined)
    }
  }
}
