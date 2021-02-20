package typings.getUri

import typings.getUri.mod.GetUriOptions
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.httpMod.IncomingMessage
import typings.node.httpsMod.RequestOptions
import typings.node.streamMod.Readable
import typings.node.urlMod.UrlWithStringQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("get-uri/dist/http", JSImport.Default)
  @js.native
  def default(parsed: UrlWithStringQuery, opts: HttpOptions): js.Promise[Readable] = js.native
  
  @js.native
  trait HttpIncomingMessage
    extends IncomingMessage
       with HttpReadableProps {
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
  
  @js.native
  trait HttpOptions
    extends GetUriOptions
       with RequestOptions {
    
    @JSName("cache")
    var cache_HttpOptions: js.UndefOr[HttpReadable] = js.native
    
    var http: js.UndefOr[HttpOrHttpsModule] = js.native
    
    var maxRedirects: js.UndefOr[Double] = js.native
    
    var redirects: js.UndefOr[js.Array[HttpReadable]] = js.native
  }
  object HttpOptions {
    
    @scala.inline
    def apply(): HttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpOptions]
    }
    
    @scala.inline
    implicit class HttpOptionsMutableBuilder[Self <: HttpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: HttpReadable): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setHttp(value: HttpOrHttpsModule): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setRedirects(value: js.Array[HttpReadable]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      @scala.inline
      def setRedirectsVarargs(value: HttpReadable*): Self = StObject.set(x, "redirects", js.Array(value :_*))
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
       with HttpReadableProps {
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
  
  @js.native
  trait HttpReadableProps extends StObject {
    
    var date: js.UndefOr[Double] = js.native
    
    var parsed: js.UndefOr[UrlWithStringQuery] = js.native
    
    var redirects: js.UndefOr[js.Array[HttpReadable]] = js.native
  }
  object HttpReadableProps {
    
    @scala.inline
    def apply(): HttpReadableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpReadableProps]
    }
    
    @scala.inline
    implicit class HttpReadablePropsMutableBuilder[Self <: HttpReadableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setParsed(value: UrlWithStringQuery): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
      
      @scala.inline
      def setRedirects(value: js.Array[HttpReadable]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      @scala.inline
      def setRedirectsVarargs(value: HttpReadable*): Self = StObject.set(x, "redirects", js.Array(value :_*))
    }
  }
}
