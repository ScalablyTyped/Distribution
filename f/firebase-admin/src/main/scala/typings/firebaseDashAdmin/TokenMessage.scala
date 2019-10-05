package typings.firebaseDashAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDashAdmin.admin.messaging.AndroidConfig
import typings.firebaseDashAdmin.admin.messaging.ApnsConfig
import typings.firebaseDashAdmin.admin.messaging.FcmOptions
import typings.firebaseDashAdmin.admin.messaging.Message
import typings.firebaseDashAdmin.admin.messaging.Notification
import typings.firebaseDashAdmin.admin.messaging.WebpushConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenMessage
  extends BaseMessage
     with Message {
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
    val __obj = js.Dynamic.literal(token = token)
    if (android != null) __obj.updateDynamic("android")(android)
    if (apns != null) __obj.updateDynamic("apns")(apns)
    if (data != null) __obj.updateDynamic("data")(data)
    if (fcmOptions != null) __obj.updateDynamic("fcmOptions")(fcmOptions)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    if (webpush != null) __obj.updateDynamic("webpush")(webpush)
    __obj.asInstanceOf[TokenMessage]
  }
}

