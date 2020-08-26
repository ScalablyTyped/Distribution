package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorProto extends js.Object {
  /** Debugging information. This property is internal to Google and should not be used. */
  var debugInfo: js.UndefOr[String] = js.native
  /** Specifies where the error occurred, if present. */
  var location: js.UndefOr[String] = js.native
  /** A human-readable description of the error. */
  var message: js.UndefOr[String] = js.native
  /** A short error code that summarizes the error. */
  var reason: js.UndefOr[String] = js.native
}

object ErrorProto {
  @scala.inline
  def apply(): ErrorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorProto]
  }
  @scala.inline
  implicit class ErrorProtoOps[Self <: ErrorProto] (val x: Self) extends AnyVal {
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
    def setDebugInfo(value: String): Self = this.set("debugInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugInfo: Self = this.set("debugInfo", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

