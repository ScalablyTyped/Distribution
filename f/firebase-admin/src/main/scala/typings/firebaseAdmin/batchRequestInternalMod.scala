package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.apiRequestMod.HttpClient
import typings.firebaseAdmin.apiRequestMod.HttpResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchRequestInternalMod {
  
  @JSImport("firebase-admin/lib/messaging/batch-request-internal", "BatchRequestClient")
  @js.native
  open class BatchRequestClient protected () extends StObject {
    /**
      * @param {HttpClient} httpClient The client that will be used to make HTTP calls.
      * @param {string} batchUrl The URL that accepts batch requests.
      * @param {object=} commonHeaders Optional headers that will be included in all requests.
      *
      * @constructor
      */
    def this(httpClient: HttpClient, batchUrl: String) = this()
    def this(httpClient: HttpClient, batchUrl: String, commonHeaders: js.Object) = this()
    
    /* private */ val batchUrl: Any = js.native
    
    /* private */ val commonHeaders: Any = js.native
    
    /* private */ var getMultipartPayload: Any = js.native
    
    /* private */ val httpClient: Any = js.native
    
    /**
      * Sends the given array of sub requests as a single batch, and parses the results into an array
      * of HttpResponse objects.
      *
      * @param requests - An array of sub requests to send.
      * @returns A promise that resolves when the send operation is complete.
      */
    def send(requests: js.Array[SubRequest]): js.Promise[js.Array[HttpResponse]] = js.native
  }
  
  trait SubRequest extends StObject {
    
    var body: js.Object
    
    var headers: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var url: String
  }
  object SubRequest {
    
    inline def apply(body: js.Object, url: String): SubRequest = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubRequest]
    }
    
    extension [Self <: SubRequest](x: Self) {
      
      inline def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
