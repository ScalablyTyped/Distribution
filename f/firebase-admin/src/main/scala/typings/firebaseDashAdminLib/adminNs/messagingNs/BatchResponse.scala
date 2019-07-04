package typings
package firebaseDashAdminLib.adminNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the server response from the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.messaging.Messaging#sendAll `sendAll()`} and
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.messaging.Messaging#sendMulticast `sendMulticast()`} methods.
  */
trait BatchResponse extends js.Object {
  /**
    * The number of messages that resulted in errors when sending.
    */
  var failureCount: scala.Double
  /**
    * An array of responses, each corresponding to a message.
    */
  var responses: js.Array[SendResponse]
  /**
    * The number of messages that were successfully handed off for sending.
    */
  var successCount: scala.Double
}

object BatchResponse {
  @scala.inline
  def apply(failureCount: scala.Double, responses: js.Array[SendResponse], successCount: scala.Double): BatchResponse = {
    val __obj = js.Dynamic.literal(failureCount = failureCount, responses = responses, successCount = successCount)
  
    __obj.asInstanceOf[BatchResponse]
  }
}

