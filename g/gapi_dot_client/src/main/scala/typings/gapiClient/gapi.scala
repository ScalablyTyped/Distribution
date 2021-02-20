package typings.gapiClient

import org.scalablytyped.runtime.StringDictionary
import typings.gapiClient.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object auth {
    
    /**
      * The OAuth 2.0 token object represents the OAuth 2.0 token and any associated data.
      */
    @js.native
    trait GoogleApiOAuth2TokenObject extends StObject {
      
      /**
        * The OAuth 2.0 token. Only present in successful responses
        */
      var access_token: String = js.native
      
      /**
        * Details about the error. Only present in error responses
        */
      var error: String = js.native
      
      /**
        * The duration, in seconds, the token is valid for. Only present in successful responses
        */
      var expires_in: String = js.native
      
      /**
        * The Google API scopes related to this token
        */
      var state: String = js.native
    }
    object GoogleApiOAuth2TokenObject {
      
      @scala.inline
      def apply(access_token: String, error: String, expires_in: String, state: String): GoogleApiOAuth2TokenObject = {
        val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[GoogleApiOAuth2TokenObject]
      }
      
      @scala.inline
      implicit class GoogleApiOAuth2TokenObjectMutableBuilder[Self <: GoogleApiOAuth2TokenObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpires_in(value: String): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object client {
    
    /**
      * Represents an HTTP Batch operation. Individual HTTP requests are added with the add method and the batch is executed using execute.
      */
    @js.native
    trait Batch[T]
      extends js.Promise[Response[ResponseMap[T]]] {
      
      /**
        * Adds a gapi.client.Request to the batch.
        * @param request The HTTP request to add to this batch.
        * @param opt_params extra parameters for this batch entry.
        */
      def add[T](request: Request[T]): Unit = js.native
      def add[T](request: Request[T], opt_params: Callback[T]): Unit = js.native
      
      /**
        * Executes all requests in the batch. The supplied callback is executed on success or failure.
        * @param callback The callback to execute when the batch returns.
        */
      def execute(callback: js.Function2[/* responseMap */ ResponseMap[T], /* rawBatchResponse */ String, _]): Unit = js.native
    }
    
    /**
      * An object encapsulating an HTTP request. This object is not instantiated directly, rather it is returned by gapi.client.request.
      */
    @js.native
    trait Request[T]
      extends js.Promise[Response[T]] {
      
      /**
        * Executes the request and runs the supplied callback on response.
        * @param callback The callback function which executes when the request succeeds or fails.
        */
      def execute(callback: js.Function1[/* response */ Response[T], _]): Unit = js.native
    }
    
    /**
      * An object containing information about the HTTP response
      */
    @js.native
    trait Response[T] extends StObject {
      
      // The raw response string.
      var body: String = js.native
      
      // The map of HTTP response headers.
      var headers: js.UndefOr[js.Array[_]] = js.native
      
      // The JSON-parsed result.
      var result: T = js.native
      
      // HTTP status
      var status: js.UndefOr[Double] = js.native
      
      // HTTP status text
      var statusText: js.UndefOr[String] = js.native
    }
    object Response {
      
      @scala.inline
      def apply[T](body: String, result: T): Response[T] = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
        __obj.asInstanceOf[Response[T]]
      }
      
      @scala.inline
      implicit class ResponseMutableBuilder[Self <: Response[_], T] (val x: Self with Response[T]) extends AnyVal {
        
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
    
    type ResponseMap[T] = StringDictionary[Response[T]]
  }
}
