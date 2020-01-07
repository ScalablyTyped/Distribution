package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the ModifyAckDeadline method.
  */
@js.native
trait Schema$ModifyAckDeadlineRequest extends js.Object {
  /**
    * The new ack deadline with respect to the time this request was sent to
    * the Pub/Sub system. For example, if the value is 10, the new ack deadline
    * will expire 10 seconds after the `ModifyAckDeadline` call was made.
    * Specifying zero might immediately make the message available for delivery
    * to another subscriber client. This typically results in an increase in
    * the rate of message redeliveries (that is, duplicates). The minimum
    * deadline you can specify is 0 seconds. The maximum deadline you can
    * specify is 600 seconds (10 minutes).
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  /**
    * List of acknowledgment IDs.
    */
  var ackIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ModifyAckDeadlineRequest {
  @scala.inline
  def apply(ackDeadlineSeconds: Int | Double = null, ackIds: js.Array[String] = null): Schema$ModifyAckDeadlineRequest = {
    val __obj = js.Dynamic.literal()
    if (ackDeadlineSeconds != null) __obj.updateDynamic("ackDeadlineSeconds")(ackDeadlineSeconds.asInstanceOf[js.Any])
    if (ackIds != null) __obj.updateDynamic("ackIds")(ackIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ModifyAckDeadlineRequest]
  }
}

