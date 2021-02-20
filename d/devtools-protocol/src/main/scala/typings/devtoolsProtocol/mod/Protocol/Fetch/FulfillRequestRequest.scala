package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FulfillRequestRequest extends StObject {
  
  /**
    * Alternative way of specifying response headers as a \0-separated
    * series of name: value pairs. Prefer the above method unless you
    * need to represent some non-UTF8 values that can't be transmitted
    * over the protocol as text.
    */
  var binaryResponseHeaders: js.UndefOr[String] = js.native
  
  /**
    * A response body.
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * An id the client received in requestPaused event.
    */
  var requestId: RequestId = js.native
  
  /**
    * An HTTP response code.
    */
  var responseCode: integer = js.native
  
  /**
    * Response headers.
    */
  var responseHeaders: js.UndefOr[js.Array[HeaderEntry]] = js.native
  
  /**
    * A textual representation of responseCode.
    * If absent, a standard phrase matching responseCode is used.
    */
  var responsePhrase: js.UndefOr[String] = js.native
}
object FulfillRequestRequest {
  
  @scala.inline
  def apply(requestId: RequestId, responseCode: integer): FulfillRequestRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfillRequestRequest]
  }
  
  @scala.inline
  implicit class FulfillRequestRequestMutableBuilder[Self <: FulfillRequestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryResponseHeaders(value: String): Self = StObject.set(x, "binaryResponseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryResponseHeadersUndefined: Self = StObject.set(x, "binaryResponseHeaders", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCode(value: integer): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeaders(value: js.Array[HeaderEntry]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    @scala.inline
    def setResponseHeadersVarargs(value: HeaderEntry*): Self = StObject.set(x, "responseHeaders", js.Array(value :_*))
    
    @scala.inline
    def setResponsePhrase(value: String): Self = StObject.set(x, "responsePhrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsePhraseUndefined: Self = StObject.set(x, "responsePhrase", js.undefined)
  }
}
