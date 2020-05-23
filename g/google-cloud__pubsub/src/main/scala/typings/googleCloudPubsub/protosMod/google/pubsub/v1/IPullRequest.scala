package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a PullRequest. */
trait IPullRequest extends js.Object {
  /** PullRequest maxMessages */
  var maxMessages: js.UndefOr[Double | Null] = js.undefined
  /** PullRequest returnImmediately */
  var returnImmediately: js.UndefOr[Boolean | Null] = js.undefined
  /** PullRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}

object IPullRequest {
  @scala.inline
  def apply(
    maxMessages: js.UndefOr[Null | Double] = js.undefined,
    returnImmediately: js.UndefOr[Null | Boolean] = js.undefined,
    subscription: js.UndefOr[Null | String] = js.undefined
  ): IPullRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxMessages)) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(returnImmediately)) __obj.updateDynamic("returnImmediately")(returnImmediately.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription)) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPullRequest]
  }
}

