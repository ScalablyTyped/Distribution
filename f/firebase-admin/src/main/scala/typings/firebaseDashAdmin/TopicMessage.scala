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

trait TopicMessage
  extends BaseMessage
     with Message {
  var topic: String
}

object TopicMessage {
  @scala.inline
  def apply(
    topic: String,
    android: AndroidConfig = null,
    apns: ApnsConfig = null,
    data: StringDictionary[String] = null,
    fcmOptions: FcmOptions = null,
    notification: Notification = null,
    webpush: WebpushConfig = null
  ): TopicMessage = {
    val __obj = js.Dynamic.literal(topic = topic)
    if (android != null) __obj.updateDynamic("android")(android)
    if (apns != null) __obj.updateDynamic("apns")(apns)
    if (data != null) __obj.updateDynamic("data")(data)
    if (fcmOptions != null) __obj.updateDynamic("fcmOptions")(fcmOptions)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    if (webpush != null) __obj.updateDynamic("webpush")(webpush)
    __obj.asInstanceOf[TopicMessage]
  }
}

