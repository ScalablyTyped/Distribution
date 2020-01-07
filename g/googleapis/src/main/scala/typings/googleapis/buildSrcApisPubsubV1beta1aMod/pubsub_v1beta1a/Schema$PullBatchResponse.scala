package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the PullBatch method.
  */
@js.native
trait Schema$PullBatchResponse extends js.Object {
  /**
    * Received Pub/Sub messages or status events. The Pub/Sub system will
    * return zero messages if there are no more messages available in the
    * backlog. The Pub/Sub system may return fewer than the max_events
    * requested even if there are more messages available in the backlog.
    */
  var pullResponses: js.UndefOr[js.Array[Schema$PullResponse]] = js.native
}

object Schema$PullBatchResponse {
  @scala.inline
  def apply(pullResponses: js.Array[Schema$PullResponse] = null): Schema$PullBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (pullResponses != null) __obj.updateDynamic("pullResponses")(pullResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PullBatchResponse]
  }
}

