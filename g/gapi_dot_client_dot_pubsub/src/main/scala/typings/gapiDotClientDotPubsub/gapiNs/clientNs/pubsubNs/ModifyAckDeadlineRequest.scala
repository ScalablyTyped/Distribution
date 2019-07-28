package typings.gapiDotClientDotPubsub.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyAckDeadlineRequest extends js.Object {
  /**
    * The new ack deadline with respect to the time this request was sent to
    * the Pub/Sub system. For example, if the value is 10, the new
    * ack deadline will expire 10 seconds after the `ModifyAckDeadline` call
    * was made. Specifying zero may immediately make the message available for
    * another pull request.
    * The minimum deadline you can specify is 0 seconds.
    * The maximum deadline you can specify is 600 seconds (10 minutes).
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.undefined
  /** List of acknowledgment IDs. */
  var ackIds: js.UndefOr[js.Array[String]] = js.undefined
}

object ModifyAckDeadlineRequest {
  @scala.inline
  def apply(ackDeadlineSeconds: Int | Double = null, ackIds: js.Array[String] = null): ModifyAckDeadlineRequest = {
    val __obj = js.Dynamic.literal()
    if (ackDeadlineSeconds != null) __obj.updateDynamic("ackDeadlineSeconds")(ackDeadlineSeconds.asInstanceOf[js.Any])
    if (ackIds != null) __obj.updateDynamic("ackIds")(ackIds)
    __obj.asInstanceOf[ModifyAckDeadlineRequest]
  }
}

