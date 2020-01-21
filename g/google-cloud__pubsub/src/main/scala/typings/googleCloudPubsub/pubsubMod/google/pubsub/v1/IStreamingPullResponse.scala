package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a StreamingPullResponse. */
trait IStreamingPullResponse extends js.Object {
  /** StreamingPullResponse receivedMessages */
  var receivedMessages: js.UndefOr[js.Array[IReceivedMessage] | Null] = js.undefined
}

object IStreamingPullResponse {
  @scala.inline
  def apply(receivedMessages: js.Array[IReceivedMessage] = null): IStreamingPullResponse = {
    val __obj = js.Dynamic.literal()
    if (receivedMessages != null) __obj.updateDynamic("receivedMessages")(receivedMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamingPullResponse]
  }
}

