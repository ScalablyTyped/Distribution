package typings.gapiClient

import typings.gapiClient.gapi.client.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    /**
      * The HTTP request body (applies to PUT or POST).
      */
    var body: js.UndefOr[Any] = js.undefined
    
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
  object Body {
    
    inline def apply(path: String): Body = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Callback[T] extends StObject {
    
    def callback(
      /**
      * is the response for this request only. Its format is defined by the API method being called.
      */
    individualResponse: Response[T],
      /**
      * is the raw batch ID-response map as a string. It contains all responses to all requests in the batch.
      */
    rawBatchResponse: String
    ): Any
    
    /**
      * Identifies the response for this request in the map of batch responses. If one is not provided, the system generates a random ID.
      */
    var id: String
  }
  object Callback {
    
    inline def apply[T](callback: (Response[T], String) => Any, id: String): Callback[T] = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback[T]]
    }
    
    extension [Self <: Callback[?], T](x: Self & Callback[T]) {
      
      inline def setCallback(value: (Response[T], String) => Any): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Clientid extends StObject {
    
    /**
      * The application's client ID. Visit the Google Developers Console to get an OAuth 2.0 client ID.
      */
    var client_id: js.UndefOr[String] = js.undefined
    
    /**
      * If true, then login uses "immediate mode", which means that the token is refreshed behind the scenes, and no UI is shown to the user.
      */
    var immediate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The OAuth 2.0 response type property. Default: token
      */
    var response_type: js.UndefOr[String] = js.undefined
    
    /**
      * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation.
      */
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Clientid {
    
    inline def apply(): Clientid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Clientid]
    }
    
    extension [Self <: Clientid](x: Self) {
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      inline def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      inline def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    }
  }
}
