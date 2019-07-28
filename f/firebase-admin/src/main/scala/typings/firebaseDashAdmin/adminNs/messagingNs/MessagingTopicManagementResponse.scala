package typings.firebaseDashAdmin.adminNs.messagingNs

import typings.firebaseDashAdmin.adminNs.FirebaseArrayIndexError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the server response from the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.messaging.Messaging#subscribeToTopic `subscribeToTopic()`} and
  * {@link
  *   admin.messaging.Messaging#unsubscribeFromTopic
  *   `unsubscribeFromTopic()`}
  * methods.
  *
  * See
  * [Manage topics from the server](/docs/cloud-messaging/manage-topics)
  * for code samples and detailed documentation.
  */
trait MessagingTopicManagementResponse extends js.Object {
  /**
    * An array of errors corresponding to the provided registration token(s). The
    * length of this array will be equal to [`failureCount`](#failureCount).
    */
  var errors: js.Array[FirebaseArrayIndexError]
  /**
    * The number of registration tokens that could not be subscribed to the topic
    * and resulted in an error.
    */
  var failureCount: Double
  /**
    * The number of registration tokens that were successfully subscribed to the
    * topic.
    */
  var successCount: Double
}

object MessagingTopicManagementResponse {
  @scala.inline
  def apply(errors: js.Array[FirebaseArrayIndexError], failureCount: Double, successCount: Double): MessagingTopicManagementResponse = {
    val __obj = js.Dynamic.literal(errors = errors, failureCount = failureCount, successCount = successCount)
  
    __obj.asInstanceOf[MessagingTopicManagementResponse]
  }
}

