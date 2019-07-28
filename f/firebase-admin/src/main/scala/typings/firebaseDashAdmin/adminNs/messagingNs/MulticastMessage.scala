package typings.firebaseDashAdmin.adminNs.messagingNs

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDashAdmin.BaseMessage
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
    notification: Notification = null,
    webpush: WebpushConfig = null
  ): MulticastMessage = {
    val __obj = js.Dynamic.literal(tokens = tokens)
    if (android != null) __obj.updateDynamic("android")(android)
    if (apns != null) __obj.updateDynamic("apns")(apns)
    if (data != null) __obj.updateDynamic("data")(data)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    if (webpush != null) __obj.updateDynamic("webpush")(webpush)
    __obj.asInstanceOf[MulticastMessage]
  }
}

