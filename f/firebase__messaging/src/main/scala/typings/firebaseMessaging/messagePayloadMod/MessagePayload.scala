package typings.firebaseMessaging.messagePayloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePayload extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var fcmOptions: js.UndefOr[FcmOptions] = js.undefined
  var notification: js.UndefOr[NotificationDetails] = js.undefined
}

object MessagePayload {
  @scala.inline
  def apply(data: js.Any = null, fcmOptions: FcmOptions = null, notification: NotificationDetails = null): MessagePayload = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fcmOptions != null) __obj.updateDynamic("fcmOptions")(fcmOptions.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayload]
  }
}

