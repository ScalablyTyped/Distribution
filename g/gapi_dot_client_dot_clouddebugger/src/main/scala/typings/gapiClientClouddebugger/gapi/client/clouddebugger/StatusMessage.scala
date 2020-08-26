package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusMessage extends js.Object {
  /** Status message text. */
  var description: js.UndefOr[FormatMessage] = js.native
  /** Distinguishes errors from informational messages. */
  var isError: js.UndefOr[Boolean] = js.native
  /** Reference to which the message applies. */
  var refersTo: js.UndefOr[String] = js.native
}

object StatusMessage {
  @scala.inline
  def apply(): StatusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusMessage]
  }
  @scala.inline
  implicit class StatusMessageOps[Self <: StatusMessage] (val x: Self) extends AnyVal {
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
    def setDescription(value: FormatMessage): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIsError(value: Boolean): Self = this.set("isError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsError: Self = this.set("isError", js.undefined)
    @scala.inline
    def setRefersTo(value: String): Self = this.set("refersTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefersTo: Self = this.set("refersTo", js.undefined)
  }
  
}

