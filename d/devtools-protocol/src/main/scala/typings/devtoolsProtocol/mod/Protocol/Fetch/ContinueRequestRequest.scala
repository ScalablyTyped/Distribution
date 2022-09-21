package typings.devtoolsProtocol.mod.Protocol.Fetch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueRequestRequest extends StObject {
  
  /**
    * If set, overrides the request headers.
    */
  var headers: js.UndefOr[js.Array[HeaderEntry]] = js.undefined
  
  /**
    * If set, overrides response interception behavior for this request.
    */
  var interceptResponse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set, the request method is overridden.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * If set, overrides the post data in the request. (Encoded as a base64 string when passed over JSON)
    */
  var postData: js.UndefOr[String] = js.undefined
  
  /**
    * An id the client received in requestPaused event.
    */
  var requestId: RequestId
  
  /**
    * If set, the request url will be modified in a way that's not observable by page.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ContinueRequestRequest {
  
  inline def apply(requestId: RequestId): ContinueRequestRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueRequestRequest]
  }
  
  extension [Self <: ContinueRequestRequest](x: Self) {
    
    inline def setHeaders(value: js.Array[HeaderEntry]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: HeaderEntry*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setInterceptResponse(value: Boolean): Self = StObject.set(x, "interceptResponse", value.asInstanceOf[js.Any])
    
    inline def setInterceptResponseUndefined: Self = StObject.set(x, "interceptResponse", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
