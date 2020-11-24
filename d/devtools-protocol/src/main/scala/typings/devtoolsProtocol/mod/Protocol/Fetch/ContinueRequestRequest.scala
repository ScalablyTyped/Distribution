package typings.devtoolsProtocol.mod.Protocol.Fetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueRequestRequest extends js.Object {
  
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
  implicit class ContinueRequestRequestOps[Self <: ContinueRequestRequest] (val x: Self) extends AnyVal {
    
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
    def setHeadersVarargs(value: HeaderEntry*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[HeaderEntry]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPostData(value: String): Self = this.set("postData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostData: Self = this.set("postData", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
