package typings.firebaseMessaging.messagePayloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePayload extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var fcmOptions: js.UndefOr[FcmOptions] = js.native
  var notification: js.UndefOr[NotificationDetails] = js.native
}

object MessagePayload {
  @scala.inline
  def apply(): MessagePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePayload]
  }
  @scala.inline
  implicit class MessagePayloadOps[Self <: MessagePayload] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFcmOptions(value: FcmOptions): Self = this.set("fcmOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFcmOptions: Self = this.set("fcmOptions", js.undefined)
    @scala.inline
    def setNotification(value: NotificationDetails): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
  }
  
}

