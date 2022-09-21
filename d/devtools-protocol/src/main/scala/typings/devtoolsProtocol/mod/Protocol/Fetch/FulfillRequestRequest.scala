package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FulfillRequestRequest extends StObject {
  
  /**
    * Alternative way of specifying response headers as a \0-separated
    * series of name: value pairs. Prefer the above method unless you
    * need to represent some non-UTF8 values that can't be transmitted
    * over the protocol as text. (Encoded as a base64 string when passed over JSON)
    */
  var binaryResponseHeaders: js.UndefOr[String] = js.undefined
  
  /**
    * A response body. If absent, original response body will be used if
    * the request is intercepted at the response stage and empty body
    * will be used if the request is intercepted at the request stage. (Encoded as a base64 string when passed over JSON)
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * An id the client received in requestPaused event.
    */
  var requestId: RequestId
  
  /**
    * An HTTP response code.
    */
  var responseCode: integer
  
  /**
    * Response headers.
    */
  var responseHeaders: js.UndefOr[js.Array[HeaderEntry]] = js.undefined
  
  /**
    * A textual representation of responseCode.
    * If absent, a standard phrase matching responseCode is used.
    */
  var responsePhrase: js.UndefOr[String] = js.undefined
}
object FulfillRequestRequest {
  
  inline def apply(requestId: RequestId, responseCode: integer): FulfillRequestRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfillRequestRequest]
  }
  
  extension [Self <: FulfillRequestRequest](x: Self) {
    
    inline def setBinaryResponseHeaders(value: String): Self = StObject.set(x, "binaryResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setBinaryResponseHeadersUndefined: Self = StObject.set(x, "binaryResponseHeaders", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setResponseCode(value: integer): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaders(value: js.Array[HeaderEntry]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    inline def setResponseHeadersVarargs(value: HeaderEntry*): Self = StObject.set(x, "responseHeaders", js.Array(value*))
    
    inline def setResponsePhrase(value: String): Self = StObject.set(x, "responsePhrase", value.asInstanceOf[js.Any])
    
    inline def setResponsePhraseUndefined: Self = StObject.set(x, "responsePhrase", js.undefined)
  }
}
