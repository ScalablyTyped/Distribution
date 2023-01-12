package typings.gapi

import typings.gapi.anon.Body
import typings.gapi.anon.Callback
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fix for #8215
  * https://github.com/DefinitelyTyped/DefinitelyTyped/issues/8215
  *
  * Usage example:
  * https://developers.google.com/identity/sign-in/web/session-state
  */
object gapi {
  
  /* Rewritten from type alias, can be one of: 
    - typings.gapi.gapi.LoadConfig
    - typings.gapi.gapi.LoadCallback
  */
  trait CallbackOrConfig extends StObject
  
  @js.native
  trait LoadCallback
    extends StObject
       with CallbackOrConfig {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait LoadConfig
    extends StObject
       with CallbackOrConfig {
    
    def callback(args: Any*): Unit
    @JSName("callback")
    var callback_Original: LoadCallback
    
    var onerror: js.UndefOr[js.Function] = js.undefined
    
    var ontimeout: js.UndefOr[js.Function] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object LoadConfig {
    
    inline def apply(callback: LoadCallback): LoadConfig = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadConfig] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: LoadCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setOnerror(value: js.Function): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOntimeout(value: js.Function): Self = StObject.set(x, "ontimeout", value.asInstanceOf[js.Any])
      
      inline def setOntimeoutUndefined: Self = StObject.set(x, "ontimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  object client {
    
    @js.native
    trait HttpBatch extends StObject {
      
      /**
        * Adds a gapi.client.HttpRequest to the batch.
        * @param httpRequest The HTTP request to add to this batch.
        * @param opt_params extra parameters for this batch entry.
        */
      def add(httpRequest: HttpRequest[Any]): Unit = js.native
      def add(httpRequest: HttpRequest[Any], opt_params: Callback): Unit = js.native
      
      /**
        * Executes all requests in the batch. The supplied callback is executed on success or failure.
        * @param callback The callback to execute when the batch returns.
        */
      def execute(callback: js.Function2[/* responseMap */ Any, /* rawBatchResponse */ String, Any]): Unit = js.native
    }
    
    @js.native
    trait HttpRequest[T]
      extends StObject
         with HttpRequestPromise[T] {
      
      /**
        * Executes the request and runs the supplied callback on response.
        * @param callback The callback function which executes when the request succeeds or fails.
        */
      def execute(callback: js.Function2[/* jsonResp */ T, /* rawResp */ Body, Any]): Unit = js.native
    }
    
    trait HttpRequestFulfilled[T] extends StObject {
      
      var body: String
      
      var headers: js.UndefOr[js.Array[Any]] = js.undefined
      
      var result: T
      
      var status: js.UndefOr[Double] = js.undefined
      
      var statusText: js.UndefOr[String] = js.undefined
    }
    object HttpRequestFulfilled {
      
      inline def apply[T](body: String, result: T): HttpRequestFulfilled[T] = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
        __obj.asInstanceOf[HttpRequestFulfilled[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HttpRequestFulfilled[?], T] (val x: Self & HttpRequestFulfilled[T]) extends AnyVal {
        
        inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setHeaders(value: js.Array[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setHeadersVarargs(value: Any*): Self = StObject.set(x, "headers", js.Array(value*))
        
        inline def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
        
        inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
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
      def `then`[TResult1, TResult2](
        onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | PromiseLike[TResult1]]
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | PromiseLike[TResult1]],
        onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | PromiseLike[TResult2]]
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | PromiseLike[TResult1]],
        onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | PromiseLike[TResult2]],
        opt_context: Any
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | PromiseLike[TResult1]],
        onrejected: Null,
        opt_context: Any
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: js.Function1[/* response */ HttpRequestFulfilled[T], TResult1 | PromiseLike[TResult1]],
        onrejected: Unit,
        opt_context: Any
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: Null,
        onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | PromiseLike[TResult2]]
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: Null,
        onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | PromiseLike[TResult2]],
        opt_context: Any
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: Null, opt_context: Any): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: Unit, opt_context: Any): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: Unit,
        onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | PromiseLike[TResult2]]
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: Unit,
        onrejected: js.Function1[/* reason */ HttpRequestRejected, TResult2 | PromiseLike[TResult2]],
        opt_context: Any
      ): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: Null, opt_context: Any): js.Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: Unit, opt_context: Any): js.Promise[TResult1 | TResult2] = js.native
    }
    
    trait HttpRequestRejected extends StObject {
      
      var body: String
      
      var headers: js.UndefOr[js.Array[Any]] = js.undefined
      
      var result: Any | Boolean
      
      var status: js.UndefOr[Double] = js.undefined
      
      var statusText: js.UndefOr[String] = js.undefined
    }
    object HttpRequestRejected {
      
      inline def apply(body: String, result: Any | Boolean): HttpRequestRejected = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
        __obj.asInstanceOf[HttpRequestRejected]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HttpRequestRejected] (val x: Self) extends AnyVal {
        
        inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setHeaders(value: js.Array[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setHeadersVarargs(value: Any*): Self = StObject.set(x, "headers", js.Array(value*))
        
        inline def setResult(value: Any | Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
        
        inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait RequestOptions extends StObject {
      
      /**
        * The HTTP request body (applies to PUT or POST).
        */
      var body: js.UndefOr[Any] = js.undefined
      
      /**
        * If supplied, the request is executed immediately and no gapi.client.HttpRequest object is returned
        */
      var callback: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /**
        * Additional HTTP request headers
        */
      var headers: js.UndefOr[Any] = js.undefined
      
      /**
        * The HTTP request method to use. Default is GET
        */
      var method: js.UndefOr[String] = js.undefined
      
      /**
        * URL params in key-value pair form
        */
      var params: js.UndefOr[Any] = js.undefined
      
      /**
        * The URL to handle the request
        */
      var path: String
    }
    object RequestOptions {
      
      inline def apply(path: String): RequestOptions = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[RequestOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
        
        inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        inline def setCallback(value: () => Any): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      }
    }
    
    trait RpcRequest extends StObject {
      
      /**
        * Executes the request and runs the supplied callback with the response.
        * @param callback The callback function which executes when the request succeeds or fails.
        */
      def callback(callback: js.Function2[/* jsonResp */ Any, /* rawResp */ String, Unit]): Unit
    }
    object RpcRequest {
      
      inline def apply(callback: js.Function2[/* jsonResp */ Any, /* rawResp */ String, Unit] => Unit): RpcRequest = {
        val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback))
        __obj.asInstanceOf[RpcRequest]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RpcRequest] (val x: Self) extends AnyVal {
        
        inline def setCallback(value: js.Function2[/* jsonResp */ Any, /* rawResp */ String, Unit] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      }
    }
    
    trait TokenObject extends StObject {
      
      /**
        * The access token to use in requests.
        */
      var access_token: String
    }
    object TokenObject {
      
      inline def apply(access_token: String): TokenObject = {
        val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
        __obj.asInstanceOf[TokenObject]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TokenObject] (val x: Self) extends AnyVal {
        
        inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      }
    }
  }
}
