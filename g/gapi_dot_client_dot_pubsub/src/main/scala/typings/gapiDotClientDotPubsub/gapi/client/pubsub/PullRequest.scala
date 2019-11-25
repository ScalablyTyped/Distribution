package typings.gapiDotClientDotPubsub.gapi.client.pubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequest extends js.Object {
  /**
    * The maximum number of messages returned for this request. The Pub/Sub
    * system may return fewer than the number specified.
    */
  var maxMessages: js.UndefOr[Double] = js.undefined
  /**
    * If this field set to true, the system will respond immediately even if
    * it there are no messages available to return in the `Pull` response.
    * Otherwise, the system may wait (for a bounded amount of time) until at
    * least one message is available, rather than returning no messages. The
    * client may cancel the request if it does not wish to wait any longer for
    * the response.
    */
  var returnImmediately: js.UndefOr[Boolean] = js.undefined
}

object PullRequest {
  @scala.inline
  def apply(maxMessages: Int | Double = null, returnImmediately: js.UndefOr[Boolean] = js.undefined): PullRequest = {
    val __obj = js.Dynamic.literal()
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(returnImmediately)) __obj.updateDynamic("returnImmediately")(returnImmediately.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequest]
  }
}

