package typings.devtoolsProtocol.mod.Protocol.CacheStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestCachedResponseRequest extends js.Object {
  /**
    * Id of cache that contains the entry.
    */
  var cacheId: CacheId = js.native
  /**
    * headers of the request.
    */
  var requestHeaders: js.Array[Header] = js.native
  /**
    * URL spec of the request.
    */
  var requestURL: String = js.native
}

object RequestCachedResponseRequest {
  @scala.inline
  def apply(cacheId: CacheId, requestHeaders: js.Array[Header], requestURL: String): RequestCachedResponseRequest = {
    val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], requestURL = requestURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCachedResponseRequest]
  }
  @scala.inline
  implicit class RequestCachedResponseRequestOps[Self <: RequestCachedResponseRequest] (val x: Self) extends AnyVal {
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
    def setCacheId(value: CacheId): Self = this.set("cacheId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestHeadersVarargs(value: Header*): Self = this.set("requestHeaders", js.Array(value :_*))
    @scala.inline
    def setRequestHeaders(value: js.Array[Header]): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestURL(value: String): Self = this.set("requestURL", value.asInstanceOf[js.Any])
  }
  
}

