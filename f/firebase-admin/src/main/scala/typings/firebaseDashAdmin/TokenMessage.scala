package typings.firebaseDashAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDashAdmin.adminNs.messagingNs.AndroidConfig
import typings.firebaseDashAdmin.adminNs.messagingNs.ApnsConfig
import typings.firebaseDashAdmin.adminNs.messagingNs.Message
import typings.firebaseDashAdmin.adminNs.messagingNs.Notification
import typings.firebaseDashAdmin.adminNs.messagingNs.WebpushConfig
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
    notification: Notification = null,
    webpush: WebpushConfig = null
  ): TokenMessage = {
    val __obj = js.Dynamic.literal(token = token)
    if (android != null) __obj.updateDynamic("android")(android)
    if (apns != null) __obj.updateDynamic("apns")(apns)
    if (data != null) __obj.updateDynamic("data")(data)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    if (webpush != null) __obj.updateDynamic("webpush")(webpush)
    __obj.asInstanceOf[TokenMessage]
  }
}

