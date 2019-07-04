package typings
package firebaseDashAdminLib.adminNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MulticastMessage
  extends firebaseDashAdminLib.BaseMessage {
  var tokens: js.Array[java.lang.String]
}

object MulticastMessage {
  @scala.inline
  def apply(
    tokens: js.Array[java.lang.String],
    android: AndroidConfig = null,
    apns: ApnsConfig = null,
    data: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
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

