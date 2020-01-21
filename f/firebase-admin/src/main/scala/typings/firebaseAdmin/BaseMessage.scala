package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.admin.messaging.AndroidConfig
import typings.firebaseAdmin.admin.messaging.ApnsConfig
import typings.firebaseAdmin.admin.messaging.FcmOptions
import typings.firebaseAdmin.admin.messaging.Notification
import typings.firebaseAdmin.admin.messaging.WebpushConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMessage extends js.Object {
  var android: js.UndefOr[AndroidConfig] = js.undefined
  var apns: js.UndefOr[ApnsConfig] = js.undefined
  var data: js.UndefOr[StringDictionary[String]] = js.undefined
  var fcmOptions: js.UndefOr[FcmOptions] = js.undefined
  var notification: js.UndefOr[Notification] = js.undefined
  var webpush: js.UndefOr[WebpushConfig] = js.undefined
}

object BaseMessage {
  @scala.inline
  def apply(
    android: AndroidConfig = null,
    apns: ApnsConfig = null,
    data: StringDictionary[String] = null,
    fcmOptions: FcmOptions = null,
    notification: Notification = null,
    webpush: WebpushConfig = null
  ): BaseMessage = {
    val __obj = js.Dynamic.literal()
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (apns != null) __obj.updateDynamic("apns")(apns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fcmOptions != null) __obj.updateDynamic("fcmOptions")(fcmOptions.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (webpush != null) __obj.updateDynamic("webpush")(webpush.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMessage]
  }
}

