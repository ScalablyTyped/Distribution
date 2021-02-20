package typings.devtoolsProtocol.mod.Protocol.Fetch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueRequestRequest extends StObject {
  
  /**
    * If set, overrides the request headers.
    */
  var headers: js.UndefOr[js.Array[HeaderEntry]] = js.native
  
  /**
    * If set, the request method is overridden.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * If set, overrides the post data in the request.
    */
  var postData: js.UndefOr[String] = js.native
  
  /**
    * An id the client received in requestPaused event.
    */
  var requestId: RequestId = js.native
  
  /**
    * If set, the request url will be modified in a way that's not observable by page.
    */
  var url: js.UndefOr[String] = js.native
}
object ContinueRequestRequest {
  
  @scala.inline
  def apply(requestId: RequestId): ContinueRequestRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueRequestRequest]
  }
  
  @scala.inline
  implicit class ContinueRequestRequestMutableBuilder[Self <: ContinueRequestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Array[HeaderEntry]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: HeaderEntry*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
