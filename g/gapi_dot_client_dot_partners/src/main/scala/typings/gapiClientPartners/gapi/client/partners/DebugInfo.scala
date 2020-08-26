package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugInfo extends js.Object {
  /** Info about the server that serviced this request. */
  var serverInfo: js.UndefOr[String] = js.native
  /** Server-side debug stack trace. */
  var serverTraceInfo: js.UndefOr[String] = js.native
  /** URL of the service that handled this request. */
  var serviceUrl: js.UndefOr[String] = js.native
}

object DebugInfo {
  @scala.inline
  def apply(): DebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugInfo]
  }
  @scala.inline
  implicit class DebugInfoOps[Self <: DebugInfo] (val x: Self) extends AnyVal {
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
    def setServerInfo(value: String): Self = this.set("serverInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerInfo: Self = this.set("serverInfo", js.undefined)
    @scala.inline
    def setServerTraceInfo(value: String): Self = this.set("serverTraceInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerTraceInfo: Self = this.set("serverTraceInfo", js.undefined)
    @scala.inline
    def setServiceUrl(value: String): Self = this.set("serviceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUrl: Self = this.set("serviceUrl", js.undefined)
  }
  
}

