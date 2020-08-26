package typings.gaxios.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaxiosResponse[T] extends js.Object {
  var config: GaxiosOptions = js.native
  var data: T = js.native
  var headers: Headers = js.native
  var request: GaxiosXMLHttpRequest = js.native
  var status: Double = js.native
  var statusText: String = js.native
}

object GaxiosResponse {
  @scala.inline
  def apply[T](
    config: GaxiosOptions,
    data: T,
    headers: Headers,
    request: GaxiosXMLHttpRequest,
    status: Double,
    statusText: String
  ): GaxiosResponse[T] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaxiosResponse[T]]
  }
  @scala.inline
  implicit class GaxiosResponseOps[Self <: GaxiosResponse[_], T] (val x: Self with GaxiosResponse[T]) extends AnyVal {
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
    def setConfig(value: GaxiosOptions): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GaxiosXMLHttpRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
  }
  
}

