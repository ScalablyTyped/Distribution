package typings.firebaseAdmin.messagingMod.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAdmin.messagingMod.TokenMessage
  - typings.firebaseAdmin.messagingMod.TopicMessage
  - typings.firebaseAdmin.messagingMod.ConditionMessage
*/
trait Message extends js.Object

object Message {
  @scala.inline
  def TokenMessage(
    token: String,
    android: AndroidConfig = null,
    apns: ApnsConfig = null,
    data: StringDictionary[String] = null,
    fcmOptions: FcmOptions = null,
    notification: Notification = null,
    webpush: WebpushConfig = null
  ): Message = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (apns != null) __obj.updateDynamic("apns")(apns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fcmOptions != null) __obj.updateDynamic("fcmOptions")(fcmOptions.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (webpush != null) __obj.updateDynamic("webpush")(webpush.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  def TopicMessage(
    topic: String,
    android: AndroidConfig = null,
    apns: ApnsConfig = null,
    data: StringDictionary[String] = null,
    fcmOptions: FcmOptions = null,
    notification: Notification = null,
    webpush: WebpushConfig = null
  ): Message = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (apns != null) __obj.updateDynamic("apns")(apns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fcmOptions != null) __obj.updateDynamic("fcmOptions")(fcmOptions.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (webpush != null) __obj.updateDynamic("webpush")(webpush.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  def ConditionMessage(
    condition: String,
    android: AndroidConfig = null,
    apns: ApnsConfig = null,
    data: StringDictionary[String] = null,
    fcmOptions: FcmOptions = null,
    notification: Notification = null,
    webpush: WebpushConfig = null
  ): Message = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (apns != null) __obj.updateDynamic("apns")(apns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fcmOptions != null) __obj.updateDynamic("fcmOptions")(fcmOptions.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (webpush != null) __obj.updateDynamic("webpush")(webpush.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

