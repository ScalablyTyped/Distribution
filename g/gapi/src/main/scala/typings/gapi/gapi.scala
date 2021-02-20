package typings.gapi

import typings.gapi.anon.Body
import typings.gapi.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fix for #8215
  * https://github.com/DefinitelyTyped/DefinitelyTyped/issues/8215
  *
  * Usage example:
  * https://developers.google.com/identity/sign-in/web/session-state
  */
object gapi {
  
  type CallbackOrConfig = LoadConfig | LoadCallback
  
  type LoadCallback = js.Function1[/* repeated */ js.Any, Unit]
  
  @js.native
  trait LoadConfig extends StObject {
    
    def callback(args: js.Any*): Unit = js.native
    @JSName("callback")
    var callback_Original: LoadCallback = js.native
    
    var onerror: js.UndefOr[js.Function] = js.native
    
    var ontimeout: js.UndefOr[js.Function] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  
  object client {
    
    @js.native
    trait HttpBatch extends StObject {
      
      /**
        * Adds a gapi.client.HttpRequest to the batch.
        * @param httpRequest The HTTP request to add to this batch.
        * @param opt_params extra parameters for this batch entry.
        */
      def add(httpRequest: HttpRequest[_]): Unit = js.native
      def add(httpRequest: HttpRequest[_], opt_params: Callback): Unit = js.native
      
      /**
        * Executes all requests in the batch. The supplied callback is executed on success or failure.
        * @param callback The callback to execute when the batch returns.
        */
      def execute(callback: js.Function2[/* responseMap */ js.Any, /* rawBatchResponse */ String, _]): Unit = js.native
    }
    
    @js.native
    trait HttpRequest[T] extends HttpRequestPromise[T] {
      
      /**
        * Executes the request and runs the supplied callback on response.
        * @param callback The callback function which executes when the request succeeds or fails.
        */
      def execute(callback: js.Function2[/* jsonResp */ T, /* rawResp */ Body, _]): Unit = js.native
    }
    
    @js.native
    trait HttpRequestFulfilled[T] extends StObject {
      
      var body: String = js.native
      
      var headers: js.UndefOr[js.Array[_]] = js.native
      
      var result: T = js.native
      
      var status: js.UndefOr[Double] = js.native
      
      var statusText: js.UndefOr[String] = js.native
    }
    object HttpRequestFulfilled {
      
      @scala.inline
      def apply[T](body: String, result: T): HttpRequestFulfilled[T] = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
        __obj.asInstanceOf[HttpRequestFulfilled[T]]
      }
      
      @scala.inline
      implicit class HttpRequestFulfilledMutableBuilder[Self <: HttpRequestFulfilled[_], T] (val x: Self with HttpRequestFulfilled[T]) extends AnyVal {
        
        @scala.inline
        def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaders(value: js.Array[_]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        @scala.inline
        def setHeadersVarargs(value: js.Any*): Self = StObject.set(x, "headers", js.Array(value :_*))
        
        @scala.inline
        def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    /**
      * HttpRequest supports promises.
      * See Google API Client JavaScript Using Promises https://developers.google.com/api-client-library/javascript/features/promises
      */
    @js.native
    trait HttpRequestPromise[T] extends StObject {
      
      // Taken and adapted from https://github.com/Microsoft/TypeScript/blob/v2.3.1/lib/lib.es5.d.ts#L1343
      def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onfulfilled: js.UndefOr[scala.Nothing], onrejected: js.UndefOr[scala.Nothing], opt_context: js.Any): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: js.UndefOr[scala.Nothing],
        onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | js.Thenable[TResult2]]
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: js.UndefOr[scala.Nothing],
        onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | js.Thenable[TResult2]],
        opt_context: js.Any
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onfulfilled: js.UndefOr[scala.Nothing], onrejected: Null, opt_context: js.Any): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | js.Thenable[TResult1]]
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | js.Thenable[TResult1]],
        onrejected: js.UndefOr[scala.Nothing],
        opt_context: js.Any
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | js.Thenable[TResult1]],
        onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | js.Thenable[TResult2]]
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | js.Thenable[TResult1]],
        onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | js.Thenable[TResult2]],
        opt_context: js.Any
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | js.Thenable[TResult1]],
        onrejected: Null,
        opt_context: js.Any
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.UndefOr[scala.Nothing], opt_context: js.Any): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: Null,
        onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | js.Thenable[TResult2]]
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: Null,
        onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | js.Thenable[TResult2]],
        opt_context: js.Any
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: Null, opt_context: js.Any): js.Promise[TResult1 | TResult2] = js.native
    }
    
    @js.native
    trait HttpRequestRejected extends StObject {
      
      var body: String = js.native
      
      var headers: js.UndefOr[js.Array[_]] = js.native
      
      var result: js.Any | Boolean = js.native
      
      var status: js.UndefOr[Double] = js.native
      
      var statusText: js.UndefOr[String] = js.native
    }
    object HttpRequestRejected {
      
      @scala.inline
      def apply(body: String, result: js.Any | Boolean): HttpRequestRejected = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
        __obj.asInstanceOf[HttpRequestRejected]
      }
      
      @scala.inline
      implicit class HttpRequestRejectedMutableBuilder[Self <: HttpRequestRejected] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaders(value: js.Array[_]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        @scala.inline
        def setHeadersVarargs(value: js.Any*): Self = StObject.set(x, "headers", js.Array(value :_*))
        
        @scala.inline
        def setResult(value: js.Any | Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    @js.native
    trait RequestOptions extends StObject {
      
      /**
        * The HTTP request body (applies to PUT or POST).
        */
      var body: js.UndefOr[js.Any] = js.native
      
      /**
        * If supplied, the request is executed immediately and no gapi.client.HttpRequest object is returned
        */
      var callback: js.UndefOr[js.Function0[_]] = js.native
      
      /**
        * Additional HTTP request headers
        */
      var headers: js.UndefOr[js.Any] = js.native
      
      /**
        * The HTTP request method to use. Default is GET
        */
      var method: js.UndefOr[String] = js.native
      
      /**
        * URL params in key-value pair form
        */
      var params: js.UndefOr[js.Any] = js.native
      
      /**
        * The URL to handle the request
        */
      var path: String = js.native
    }
    object RequestOptions {
      
      @scala.inline
      def apply(path: String): RequestOptions = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[RequestOptions]
      }
      
      @scala.inline
      implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        @scala.inline
        def setCallback(value: () => _): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
        
        @scala.inline
        def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        @scala.inline
        def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        @scala.inline
        def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait RpcRequest extends StObject {
      
      /**
        * Executes the request and runs the supplied callback with the response.
        * @param callback The callback function which executes when the request succeeds or fails.
        */
      def callback(callback: js.Function2[/* jsonResp */ js.Any, /* rawResp */ String, Unit]): Unit = js.native
    }
    object RpcRequest {
      
      @scala.inline
      def apply(callback: js.Function2[/* jsonResp */ js.Any, /* rawResp */ String, Unit] => Unit): RpcRequest = {
        val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback))
        __obj.asInstanceOf[RpcRequest]
      }
      
      @scala.inline
      implicit class RpcRequestMutableBuilder[Self <: RpcRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCallback(value: js.Function2[/* jsonResp */ js.Any, /* rawResp */ String, Unit] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait TokenObject extends StObject {
      
      /**
        * The access token to use in requests.
        */
      var access_token: String = js.native
    }
    object TokenObject {
      
      @scala.inline
      def apply(access_token: String): TokenObject = {
        val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
        __obj.asInstanceOf[TokenObject]
      }
      
      @scala.inline
      implicit class TokenObjectMutableBuilder[Self <: TokenObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      }
    }
  }
}
