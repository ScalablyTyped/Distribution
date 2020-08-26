package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocketResponse extends js.Object {
  /**
    * HTTP response headers.
    */
  var headers: Headers = js.native
  /**
    * HTTP response headers text.
    */
  var headersText: js.UndefOr[String] = js.native
  /**
    * HTTP request headers.
    */
  var requestHeaders: js.UndefOr[Headers] = js.native
  /**
    * HTTP request headers text.
    */
  var requestHeadersText: js.UndefOr[String] = js.native
  /**
    * HTTP response status code.
    */
  var status: integer = js.native
  /**
    * HTTP response status text.
    */
  var statusText: String = js.native
}

object WebSocketResponse {
  @scala.inline
  def apply(headers: Headers, status: integer, statusText: String): WebSocketResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketResponse]
  }
  @scala.inline
  implicit class WebSocketResponseOps[Self <: WebSocketResponse] (val x: Self) extends AnyVal {
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
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: integer): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersText(value: String): Self = this.set("headersText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadersText: Self = this.set("headersText", js.undefined)
    @scala.inline
    def setRequestHeaders(value: Headers): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
    @scala.inline
    def setRequestHeadersText(value: String): Self = this.set("requestHeadersText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestHeadersText: Self = this.set("requestHeadersText", js.undefined)
  }
  
}

