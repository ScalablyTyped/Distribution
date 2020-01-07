package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `Pull` method.
  */
@js.native
trait Schema$PullResponse extends js.Object {
  /**
    * Received Pub/Sub messages. The list will be empty if there are no more
    * messages available in the backlog. For JSON, the response can be entirely
    * empty. The Pub/Sub system may return fewer than the `maxMessages`
    * requested even if there are more messages available in the backlog.
    */
  var receivedMessages: js.UndefOr[js.Array[Schema$ReceivedMessage]] = js.native
}

object Schema$PullResponse {
  @scala.inline
  def apply(receivedMessages: js.Array[Schema$ReceivedMessage] = null): Schema$PullResponse = {
    val __obj = js.Dynamic.literal()
    if (receivedMessages != null) __obj.updateDynamic("receivedMessages")(receivedMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PullResponse]
  }
}

