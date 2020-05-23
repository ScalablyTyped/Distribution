package typings.firebaseAdmin.messagingMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.admin.messaging.Message
import typings.firebaseAdmin.messagingMod.admin.messaging.AndroidConfig
import typings.firebaseAdmin.messagingMod.admin.messaging.ApnsConfig
import typings.firebaseAdmin.messagingMod.admin.messaging.FcmOptions
import typings.firebaseAdmin.messagingMod.admin.messaging.Notification
import typings.firebaseAdmin.messagingMod.admin.messaging.WebpushConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenMessage
  extends BaseMessage
     with Message
     with typings.firebaseAdmin.messagingMod.admin.messaging.Message {
  var token: String
}

object TokenMessage {
  @scala.inline
  def apply(
    token: String,
    android: AndroidConfig = null,
    apns: ApnsConfig = null,
    data: StringDictionary[String] = null,
    fcmOptions: FcmOptions = null,
    notification: Notification = null,
    webpush: WebpushConfig = null
  ): TokenMessage = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (apns != null) __obj.updateDynamic("apns")(apns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fcmOptions != null) __obj.updateDynamic("fcmOptions")(fcmOptions.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (webpush != null) __obj.updateDynamic("webpush")(webpush.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenMessage]
  }
}

