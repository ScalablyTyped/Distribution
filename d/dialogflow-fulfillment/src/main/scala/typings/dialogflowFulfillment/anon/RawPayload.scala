package typings.dialogflowFulfillment.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawPayload extends js.Object {
  var rawPayload: js.UndefOr[Boolean] = js.native
  var sendAsMessage: js.UndefOr[Boolean] = js.native
}

object RawPayload {
  @scala.inline
  def apply(): RawPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawPayload]
  }
  @scala.inline
  implicit class RawPayloadOps[Self <: RawPayload] (val x: Self) extends AnyVal {
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
    def setRawPayload(value: Boolean): Self = this.set("rawPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawPayload: Self = this.set("rawPayload", js.undefined)
    @scala.inline
    def setSendAsMessage(value: Boolean): Self = this.set("sendAsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendAsMessage: Self = this.set("sendAsMessage", js.undefined)
  }
  
}

