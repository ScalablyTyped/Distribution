package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the `Pull` method.
  */
@js.native
trait Schema$PullRequest extends js.Object {
  /**
    * The maximum number of messages returned for this request. The Pub/Sub
    * system may return fewer than the number specified.
    */
  var maxMessages: js.UndefOr[Double] = js.native
  /**
    * If this field set to true, the system will respond immediately even if it
    * there are no messages available to return in the `Pull` response.
    * Otherwise, the system may wait (for a bounded amount of time) until at
    * least one message is available, rather than returning no messages.
    */
  var returnImmediately: js.UndefOr[Boolean] = js.native
}

object Schema$PullRequest {
  @scala.inline
  def apply(maxMessages: Int | Double = null, returnImmediately: js.UndefOr[Boolean] = js.undefined): Schema$PullRequest = {
    val __obj = js.Dynamic.literal()
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(returnImmediately)) __obj.updateDynamic("returnImmediately")(returnImmediately.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PullRequest]
  }
}

