package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

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
    maxMessages: Int | Double = null,
    returnImmediately: js.UndefOr[Boolean] = js.undefined,
    subscription: String = null
  ): IPullRequest = {
    val __obj = js.Dynamic.literal()
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(returnImmediately)) __obj.updateDynamic("returnImmediately")(returnImmediately.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPullRequest]
  }
}

