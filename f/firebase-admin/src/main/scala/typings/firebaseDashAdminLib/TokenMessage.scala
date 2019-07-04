package typings
package firebaseDashAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenMessage
  extends BaseMessage
     with firebaseDashAdminLib.adminNs.messagingNs.Message {
  var token: java.lang.String
}

object TokenMessage {
  @scala.inline
  def apply(
    token: java.lang.String,
    android: firebaseDashAdminLib.adminNs.messagingNs.AndroidConfig = null,
    apns: firebaseDashAdminLib.adminNs.messagingNs.ApnsConfig = null,
    data: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    notification: firebaseDashAdminLib.adminNs.messagingNs.Notification = null,
    webpush: firebaseDashAdminLib.adminNs.messagingNs.WebpushConfig = null
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

