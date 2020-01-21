package typings.gapiClientPubsub.gapi.client.pubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcknowledgeRequest extends js.Object {
  /**
    * The acknowledgment ID for the messages being acknowledged that was returned
    * by the Pub/Sub system in the `Pull` response. Must not be empty.
    */
  var ackIds: js.UndefOr[js.Array[String]] = js.undefined
}

object AcknowledgeRequest {
  @scala.inline
  def apply(ackIds: js.Array[String] = null): AcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    if (ackIds != null) __obj.updateDynamic("ackIds")(ackIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeRequest]
  }
}

