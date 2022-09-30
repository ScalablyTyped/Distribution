package typings.fetchMock

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.fetchMock.fetchMockStrings.always
import typings.std.Headers
import typings.std.PromiseLike
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FallbackToNetwork extends StObject {
    
    /**
      * Reference to the Headers constructor of a custom fetch
      * implementation.
      */
    var Headers: js.UndefOr[Instantiable0[js.UndefOr[typings.std.Headers]]] = js.undefined
    
    /**
      * Reference to the Promise constructor of a custom Promise
      * implementation.
      */
    var Promise: js.UndefOr[
        Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[/* value */ Response | PromiseLike[Response], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ], 
          js.UndefOr[js.Promise[Response]]
        ]
      ] = js.undefined
    
    /**
      * Reference to the Request constructor of a custom fetch
      * implementation.
      */
    var Request: js.UndefOr[
        Instantiable2[
          /* input */ String | typings.std.Request, 
          /* init */ js.UndefOr[RequestInit], 
          js.UndefOr[typings.std.Request]
        ]
      ] = js.undefined
    
    /**
      * Reference to the Response constructor of a custom fetch
      * implementation.
      */
    var Response: js.UndefOr[Instantiable0[js.UndefOr[typings.std.Response]]] = js.undefined
    
    /**
      * - true: Unhandled calls fall through to the network
      * - false: Unhandled calls throw an error
      * - 'always': All calls fall through to the network, effectively
      * disabling fetch-mock.
      * @default false
      */
    var fallbackToNetwork: js.UndefOr[Boolean | always] = js.undefined
    
    /**
      * Reference to a custom fetch implementation.
      */
    var fetch: js.UndefOr[
        js.Function2[
          /* input */ js.UndefOr[String | Request], 
          /* init */ js.UndefOr[RequestInit], 
          js.Promise[Response]
        ]
      ] = js.undefined
    
    /**
      * Automatically sets a content-length header on each response.
      * @default true
      */
    var includeContentLength: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines behaviour if a new route has the same name (or
      * inferred name) as an existing one
      * - undefined: An error will be throw when routes clash
      * - true: Overwrites the existing route
      * - false: Appends the new route to the list of routes
      * @default undefined
      */
    var overwriteRoutes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Convert objects into JSON before delivering as stub responses.
      * Can be useful to set to false globally if e.g. dealing with a
      * lot of array buffers. If true, will also add
      * content-type: application/json header.
      * @default true
      */
    var sendAsJson: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Print a warning if any call is caught by a fallback handler (set
      * using the fallbackToNetwork option or catch())
      * @default true
      */
    var warnOnFallback: js.UndefOr[Boolean] = js.undefined
  }
  object FallbackToNetwork {
    
    inline def apply(): FallbackToNetwork = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FallbackToNetwork]
    }
    
    extension [Self <: FallbackToNetwork](x: Self) {
      
      inline def setFallbackToNetwork(value: Boolean | always): Self = StObject.set(x, "fallbackToNetwork", value.asInstanceOf[js.Any])
      
      inline def setFallbackToNetworkUndefined: Self = StObject.set(x, "fallbackToNetwork", js.undefined)
      
      inline def setFetch(
        value: (/* input */ js.UndefOr[String | Request], /* init */ js.UndefOr[RequestInit]) => js.Promise[Response]
      ): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setHeaders(value: Instantiable0[js.UndefOr[Headers]]): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "Headers", js.undefined)
      
      inline def setIncludeContentLength(value: Boolean): Self = StObject.set(x, "includeContentLength", value.asInstanceOf[js.Any])
      
      inline def setIncludeContentLengthUndefined: Self = StObject.set(x, "includeContentLength", js.undefined)
      
      inline def setOverwriteRoutes(value: Boolean): Self = StObject.set(x, "overwriteRoutes", value.asInstanceOf[js.Any])
      
      inline def setOverwriteRoutesUndefined: Self = StObject.set(x, "overwriteRoutes", js.undefined)
      
      inline def setPromise(
        value: Instantiable1[
              /* executor */ js.Function2[
                /* resolve */ js.Function1[/* value */ Response | PromiseLike[Response], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
                Unit
              ], 
              js.UndefOr[js.Promise[Response]]
            ]
      ): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      inline def setRequest(
        value: Instantiable2[
              /* input */ String | Request, 
              /* init */ js.UndefOr[RequestInit], 
              js.UndefOr[Request]
            ]
      ): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "Request", js.undefined)
      
      inline def setResponse(value: Instantiable0[js.UndefOr[Response]]): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "Response", js.undefined)
      
      inline def setSendAsJson(value: Boolean): Self = StObject.set(x, "sendAsJson", value.asInstanceOf[js.Any])
      
      inline def setSendAsJsonUndefined: Self = StObject.set(x, "sendAsJson", js.undefined)
      
      inline def setWarnOnFallback(value: Boolean): Self = StObject.set(x, "warnOnFallback", value.asInstanceOf[js.Any])
      
      inline def setWarnOnFallbackUndefined: Self = StObject.set(x, "warnOnFallback", js.undefined)
    }
  }
}
