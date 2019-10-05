package typings.firebaseDashAdmin.admin.messaging

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
  var data: js.UndefOr[DataMessagePayload] = js.undefined
  /**
    * The notification message payload.
    */
  var notification: js.UndefOr[NotificationMessagePayload] = js.undefined
}

object MessagingPayload {
  @scala.inline
  def apply(data: DataMessagePayload = null, notification: NotificationMessagePayload = null): MessagingPayload = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    __obj.asInstanceOf[MessagingPayload]
  }
}

