package typings.firebaseAdmin.messagingMod.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.messagingMod.BaseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MulticastMessage extends BaseMessage {
  var tokens: js.Array[String]
}

object MulticastMessage {
  @scala.inline
  def apply(
    tokens: js.Array[String],
    android: AndroidConfig = null,
    apns: ApnsConfig = null,
    data: StringDictionary[String] = null,
    fcmOptions: FcmOptions = null,
    notification: Notification = null,
    webpush: WebpushConfig = null
  ): MulticastMessage = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (apns != null) __obj.updateDynamic("apns")(apns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fcmOptions != null) __obj.updateDynamic("fcmOptions")(fcmOptions.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (webpush != null) __obj.updateDynamic("webpush")(webpush.asInstanceOf[js.Any])
    __obj.asInstanceOf[MulticastMessage]
  }
}

