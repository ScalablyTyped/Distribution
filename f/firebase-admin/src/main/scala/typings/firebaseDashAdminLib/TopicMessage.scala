package typings
package firebaseDashAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicMessage
  extends BaseMessage
     with firebaseDashAdminLib.adminNs.messagingNs.Message {
  var topic: java.lang.String
}

object TopicMessage {
  @scala.inline
  def apply(
    topic: java.lang.String,
    android: firebaseDashAdminLib.adminNs.messagingNs.AndroidConfig = null,
    apns: firebaseDashAdminLib.adminNs.messagingNs.ApnsConfig = null,
    data: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    notification: firebaseDashAdminLib.adminNs.messagingNs.Notification = null,
    webpush: firebaseDashAdminLib.adminNs.messagingNs.WebpushConfig = null
  ): TopicMessage = {
    val __obj = js.Dynamic.literal(topic = topic)
    if (android != null) __obj.updateDynamic("android")(android)
    if (apns != null) __obj.updateDynamic("apns")(apns)
    if (data != null) __obj.updateDynamic("data")(data)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    if (webpush != null) __obj.updateDynamic("webpush")(webpush)
    __obj.asInstanceOf[TopicMessage]
  }
}

