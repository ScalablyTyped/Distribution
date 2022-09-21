package typings.fetchPonyfill

import typings.fetchPonyfill.anon.FnCall
import typings.fetchPonyfill.anon.TypeofDOMException
import typings.fetchPonyfill.anon.TypeofResponse
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): BootstrapRetVal = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[BootstrapRetVal]
  inline def apply(options: BootstrapOptions): BootstrapRetVal = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[BootstrapRetVal]
  
  @JSImport("fetch-ponyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BootstrapOptions extends StObject {
    
    var Promise: js.UndefOr[js.Function] = js.undefined
    
    var XMLHttpRequest: js.UndefOr[js.Function] = js.undefined
  }
  object BootstrapOptions {
    
    inline def apply(): BootstrapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BootstrapOptions]
    }
    
    extension [Self <: BootstrapOptions](x: Self) {
      
      inline def setPromise(value: js.Function): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      inline def setXMLHttpRequest(value: js.Function): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
      
      inline def setXMLHttpRequestUndefined: Self = StObject.set(x, "XMLHttpRequest", js.undefined)
    }
  }
  
  trait BootstrapRetVal extends StObject {
    
    var DOMException: TypeofDOMException
    
    var Headers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Headers */ Any
    
    var Request: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Request */ Any
    
    var Response: TypeofResponse
    
    def fetch(input: RequestInfo): js.Promise[Response]
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response]
    def fetch(input: URL): js.Promise[Response]
    def fetch(input: URL, init: RequestInit): js.Promise[Response]
    @JSName("fetch")
    var fetch_Original: FnCall
  }
  object BootstrapRetVal {
    
    inline def apply(
      DOMException: TypeofDOMException,
      Headers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Headers */ Any,
      Request: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Request */ Any,
      Response: TypeofResponse,
      fetch: FnCall
    ): BootstrapRetVal = {
      val __obj = js.Dynamic.literal(DOMException = DOMException.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootstrapRetVal]
    }
    
    extension [Self <: BootstrapRetVal](x: Self) {
      
      inline def setDOMException(value: TypeofDOMException): Self = StObject.set(x, "DOMException", value.asInstanceOf[js.Any])
      
      inline def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Headers */ Any): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Request */ Any): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: TypeofResponse): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    }
  }
}
