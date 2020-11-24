package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FulfillRequestRequest extends js.Object {
  
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
  implicit class FulfillRequestRequestOps[Self <: FulfillRequestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCode(value: integer): Self = this.set("responseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryResponseHeaders(value: String): Self = this.set("binaryResponseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryResponseHeaders: Self = this.set("binaryResponseHeaders", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setResponseHeadersVarargs(value: HeaderEntry*): Self = this.set("responseHeaders", js.Array(value :_*))
    
    @scala.inline
    def setResponseHeaders(value: js.Array[HeaderEntry]): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseHeaders: Self = this.set("responseHeaders", js.undefined)
    
    @scala.inline
    def setResponsePhrase(value: String): Self = this.set("responsePhrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsePhrase: Self = this.set("responsePhrase", js.undefined)
  }
}
