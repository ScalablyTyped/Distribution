package typings.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the server response from the legacy
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.messaging.Messaging#sendToCondition `sendToCondition()`} method.
  *
  * See
  * [Send to a condition](/docs/cloud-messaging/admin/send-messages#send_to_a_condition)
  * for code samples and detailed documentation.
  */
trait MessagingConditionResponse extends js.Object {
  /**
    * The message ID for a successfully received request which FCM will attempt to
    * deliver to all subscribed devices.
    */
  var messageId: Double
}

object MessagingConditionResponse {
  @scala.inline
  def apply(messageId: Double): MessagingConditionResponse = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessagingConditionResponse]
  }
}

