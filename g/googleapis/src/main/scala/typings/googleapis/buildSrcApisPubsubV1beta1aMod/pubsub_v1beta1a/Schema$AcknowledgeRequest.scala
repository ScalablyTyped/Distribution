package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Acknowledge method.
  */
@js.native
trait Schema$AcknowledgeRequest extends js.Object {
  /**
    * The acknowledgment ID for the message being acknowledged. This was
    * returned by the Pub/Sub system in the Pull response.
    */
  var ackId: js.UndefOr[js.Array[String]] = js.native
  /**
    * The subscription whose message is being acknowledged.
    */
  var subscription: js.UndefOr[String] = js.native
}

object Schema$AcknowledgeRequest {
  @scala.inline
  def apply(ackId: js.Array[String] = null, subscription: String = null): Schema$AcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    if (ackId != null) __obj.updateDynamic("ackId")(ackId.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AcknowledgeRequest]
  }
}

