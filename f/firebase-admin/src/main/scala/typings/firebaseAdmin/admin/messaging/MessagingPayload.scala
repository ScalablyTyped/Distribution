package typings.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a Firebase Cloud Messaging message payload. One or
  * both of the `data` and `notification` keys are required.
  *
  * See
  * [Build send requests](/docs/cloud-messaging/send-message)
  * for code samples and detailed documentation.
  */
trait MessagingPayload extends js.Object {
  /**
    * The data message payload.
    */
  var data: js.UndefOr[typings.firebaseAdmin.messagingMod.admin.messaging.DataMessagePayload] = js.undefined
  /**
    * The notification message payload.
    */
  var notification: js.UndefOr[typings.firebaseAdmin.messagingMod.admin.messaging.NotificationMessagePayload] = js.undefined
}

object MessagingPayload {
  @scala.inline
  def apply(
    data: typings.firebaseAdmin.messagingMod.admin.messaging.DataMessagePayload = null,
    notification: typings.firebaseAdmin.messagingMod.admin.messaging.NotificationMessagePayload = null
  ): MessagingPayload = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingPayload]
  }
}

