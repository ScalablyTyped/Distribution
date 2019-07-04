package typings
package firebaseDashAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMessage extends js.Object {
  var android: js.UndefOr[firebaseDashAdminLib.adminNs.messagingNs.AndroidConfig] = js.undefined
  var apns: js.UndefOr[firebaseDashAdminLib.adminNs.messagingNs.ApnsConfig] = js.undefined
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var notification: js.UndefOr[firebaseDashAdminLib.adminNs.messagingNs.Notification] = js.undefined
  var webpush: js.UndefOr[firebaseDashAdminLib.adminNs.messagingNs.WebpushConfig] = js.undefined
}

object BaseMessage {
  @scala.inline
  def apply(
    android: firebaseDashAdminLib.adminNs.messagingNs.AndroidConfig = null,
    apns: firebaseDashAdminLib.adminNs.messagingNs.ApnsConfig = null,
    data: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    notification: firebaseDashAdminLib.adminNs.messagingNs.Notification = null,
    webpush: firebaseDashAdminLib.adminNs.messagingNs.WebpushConfig = null
  ): BaseMessage = {
    val __obj = js.Dynamic.literal()
    if (android != null) __obj.updateDynamic("android")(android)
    if (apns != null) __obj.updateDynamic("apns")(apns)
    if (data != null) __obj.updateDynamic("data")(data)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    if (webpush != null) __obj.updateDynamic("webpush")(webpush)
    __obj.asInstanceOf[BaseMessage]
  }
}

