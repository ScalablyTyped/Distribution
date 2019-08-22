package typings.firebaseDashAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDashAdmin.adminNs.messagingNs.AndroidConfig
import typings.firebaseDashAdmin.adminNs.messagingNs.ApnsConfig
import typings.firebaseDashAdmin.adminNs.messagingNs.FcmOptions
import typings.firebaseDashAdmin.adminNs.messagingNs.Message
import typings.firebaseDashAdmin.adminNs.messagingNs.Notification
import typings.firebaseDashAdmin.adminNs.messagingNs.WebpushConfig
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

