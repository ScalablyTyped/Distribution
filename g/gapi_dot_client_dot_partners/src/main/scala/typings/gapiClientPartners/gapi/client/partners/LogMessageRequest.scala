package typings.gapiClientPartners.gapi.client.partners

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogMessageRequest extends js.Object {
  /** Map of client info, such as URL, browser navigator, browser platform, etc. */
  var clientInfo: js.UndefOr[Record[String, String]] = js.native
  /** Details about the client message. */
  var details: js.UndefOr[String] = js.native
  /** Message level of client message. */
  var level: js.UndefOr[String] = js.native
  /** Current request metadata. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.native
}

object LogMessageRequest {
  @scala.inline
  def apply(): LogMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogMessageRequest]
  }
  @scala.inline
  implicit class LogMessageRequestOps[Self <: LogMessageRequest] (val x: Self) extends AnyVal {
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
    def setClientInfo(value: Record[String, String]): Self = this.set("clientInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientInfo: Self = this.set("clientInfo", js.undefined)
    @scala.inline
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setRequestMetadata(value: RequestMetadata): Self = this.set("requestMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMetadata: Self = this.set("requestMetadata", js.undefined)
  }
  
}

