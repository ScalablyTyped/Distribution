package typings.fetchMock

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.fetchMock.fetchMockStrings.always
import typings.std.Headers
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FallbackToNetwork extends StObject {
    
    /**
      * Reference to the Headers constructor of a custom fetch
      * implementation.
      */
    var Headers: js.UndefOr[Instantiable0[typings.std.Headers]] = js.native
    
    /**
      * Reference to the Promise constructor of a custom Promise
      * implementation.
      */
    var Promise: js.UndefOr[
        Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[/* value */ Response | js.Thenable[Response], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ], 
          js.Promise[Response]
        ]
      ] = js.native
    
    /**
      * Reference to the Request constructor of a custom fetch
      * implementation.
      */
    var Request: js.UndefOr[
        Instantiable2[
          /* input */ String | typings.std.Request, 
          /* init */ js.UndefOr[RequestInit], 
          typings.std.Request
        ]
      ] = js.native
    
    /**
      * Reference to the Response constructor of a custom fetch
      * implementation.
      */
    var Response: js.UndefOr[Instantiable0[typings.std.Response]] = js.native
    
    /**
      * - true: Unhandled calls fall through to the network
      * - false: Unhandled calls throw an error
      * - 'always': All calls fall through to the network, effectively
      * disabling fetch-mock.
      * @default false
      */
    var fallbackToNetwork: js.UndefOr[Boolean | always] = js.native
    
    /**
      * Reference to a custom fetch implementation.
      */
    var fetch: js.UndefOr[
        js.Function2[
          /* input */ js.UndefOr[String | Request], 
          /* init */ js.UndefOr[RequestInit], 
          js.Promise[Response]
        ]
      ] = js.native
    
    /**
      * Automatically sets a content-length header on each response.
      * @default true
      */
    var includeContentLength: js.UndefOr[Boolean] = js.native
    
    /**
      * Determines behaviour if a new route has the same name (or
      * inferred name) as an existing one
      * - undefined: An error will be throw when routes clash
      * - true: Overwrites the existing route
      * - false: Appends the new route to the list of routes
      * @default undefined
      */
    var overwriteRoutes: js.UndefOr[Boolean] = js.native
    
    /**
      * Convert objects into JSON before delivering as stub responses.
      * Can be useful to set to false globally if e.g. dealing with a
      * lot of array buffers. If true, will also add
      * content-type: application/json header.
      * @default true
      */
    var sendAsJson: js.UndefOr[Boolean] = js.native
    
    /**
      * Print a warning if any call is caught by a fallback handler (set
      * using the fallbackToNetwork option or catch())
      * @default true
      */
    var warnOnFallback: js.UndefOr[Boolean] = js.native
  }
  object FallbackToNetwork {
    
    @scala.inline
    def apply(): FallbackToNetwork = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FallbackToNetwork]
    }
    
    @scala.inline
    implicit class FallbackToNetworkMutableBuilder[Self <: FallbackToNetwork] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallbackToNetwork(value: Boolean | always): Self = StObject.set(x, "fallbackToNetwork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackToNetworkUndefined: Self = StObject.set(x, "fallbackToNetwork", js.undefined)
      
      @scala.inline
      def setFetch(
        value: (/* input */ js.UndefOr[String | Request], /* init */ js.UndefOr[RequestInit]) => js.Promise[Response]
      ): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setHeaders(value: Instantiable0[Headers]): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "Headers", js.undefined)
      
      @scala.inline
      def setIncludeContentLength(value: Boolean): Self = StObject.set(x, "includeContentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeContentLengthUndefined: Self = StObject.set(x, "includeContentLength", js.undefined)
      
      @scala.inline
      def setOverwriteRoutes(value: Boolean): Self = StObject.set(x, "overwriteRoutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteRoutesUndefined: Self = StObject.set(x, "overwriteRoutes", js.undefined)
      
      @scala.inline
      def setPromise(
        value: Instantiable1[
              /* executor */ js.Function2[
                /* resolve */ js.Function1[/* value */ Response | js.Thenable[Response], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
                Unit
              ], 
              js.Promise[Response]
            ]
      ): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      @scala.inline
      def setRequest(value: Instantiable2[/* input */ String | Request, /* init */ js.UndefOr[RequestInit], Request]): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "Request", js.undefined)
      
      @scala.inline
      def setResponse(value: Instantiable0[Response]): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "Response", js.undefined)
      
      @scala.inline
      def setSendAsJson(value: Boolean): Self = StObject.set(x, "sendAsJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendAsJsonUndefined: Self = StObject.set(x, "sendAsJson", js.undefined)
      
      @scala.inline
      def setWarnOnFallback(value: Boolean): Self = StObject.set(x, "warnOnFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnOnFallbackUndefined: Self = StObject.set(x, "warnOnFallback", js.undefined)
    }
  }
}
