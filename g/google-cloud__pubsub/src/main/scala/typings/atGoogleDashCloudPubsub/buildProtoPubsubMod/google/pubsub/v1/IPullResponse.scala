package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a PullResponse. */
trait IPullResponse extends js.Object {
  /** PullResponse receivedMessages */
  var receivedMessages: js.UndefOr[js.Array[IReceivedMessage] | Null] = js.undefined
}

object IPullResponse {
  @scala.inline
  def apply(receivedMessages: js.Array[IReceivedMessage] = null): IPullResponse = {
    val __obj = js.Dynamic.literal()
    if (receivedMessages != null) __obj.updateDynamic("receivedMessages")(receivedMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPullResponse]
  }
}

