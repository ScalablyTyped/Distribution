package typings.getUri

import typings.getUri.mod.GetUriOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpsMod.RequestOptions
import typings.node.streamMod.Readable
import typings.node.urlMod.UrlWithStringQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("get-uri/dist/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(parsed: UrlWithStringQuery, opts: HttpOptions): js.Promise[Readable] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(parsed.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Readable]]
  
  @js.native
  trait HttpIncomingMessage
    extends IncomingMessage
       with HttpReadableProps
  
  trait HttpOptions
    extends StObject
       with GetUriOptions
       with RequestOptions {
    
    @JSName("cache")
    var cache_HttpOptions: js.UndefOr[HttpReadable] = js.undefined
    
    var http: js.UndefOr[HttpOrHttpsModule] = js.undefined
    
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var redirects: js.UndefOr[js.Array[HttpReadable]] = js.undefined
  }
  object HttpOptions {
    
    inline def apply(): HttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpOptions]
    }
    
    extension [Self <: HttpOptions](x: Self) {
      
      inline def setCache(value: HttpReadable): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setHttp(value: HttpOrHttpsModule): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setRedirects(value: js.Array[HttpReadable]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      inline def setRedirectsVarargs(value: HttpReadable*): Self = StObject.set(x, "redirects", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.getUri.anon.Typeofhttp
    - typings.getUri.anon.Typeofhttps
  */
  trait HttpOrHttpsModule extends StObject
  
  @js.native
  trait HttpReadable
    extends Readable
       with HttpReadableProps
  
  trait HttpReadableProps extends StObject {
    
    var date: js.UndefOr[Double] = js.undefined
    
    var parsed: js.UndefOr[UrlWithStringQuery] = js.undefined
    
    var redirects: js.UndefOr[js.Array[HttpReadable]] = js.undefined
  }
  object HttpReadableProps {
    
    inline def apply(): HttpReadableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpReadableProps]
    }
    
    extension [Self <: HttpReadableProps](x: Self) {
      
      inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setParsed(value: UrlWithStringQuery): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      inline def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
      
      inline def setRedirects(value: js.Array[HttpReadable]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      inline def setRedirectsVarargs(value: HttpReadable*): Self = StObject.set(x, "redirects", js.Array(value*))
    }
  }
}
