package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Acknowledge method.
  */
@js.native
trait Schema$AcknowledgeRequest extends js.Object {
  /**
    * The acknowledgment ID for the messages being acknowledged that was
    * returned by the Pub/Sub system in the `Pull` response. Must not be empty.
    */
  var ackIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$AcknowledgeRequest {
  @scala.inline
  def apply(ackIds: js.Array[String] = null): Schema$AcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    if (ackIds != null) __obj.updateDynamic("ackIds")(ackIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AcknowledgeRequest]
  }
}

