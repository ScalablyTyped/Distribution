package typings.devtoolsProtocol.mod.Protocol.CacheStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestCacheNamesRequest extends js.Object {
  /**
    * Security origin.
    */
  var securityOrigin: String = js.native
}

object RequestCacheNamesRequest {
  @scala.inline
  def apply(securityOrigin: String): RequestCacheNamesRequest = {
    val __obj = js.Dynamic.literal(securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCacheNamesRequest]
  }
  @scala.inline
  implicit class RequestCacheNamesRequestOps[Self <: RequestCacheNamesRequest] (val x: Self) extends AnyVal {
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
    def setSecurityOrigin(value: String): Self = this.set("securityOrigin", value.asInstanceOf[js.Any])
  }
  
}

