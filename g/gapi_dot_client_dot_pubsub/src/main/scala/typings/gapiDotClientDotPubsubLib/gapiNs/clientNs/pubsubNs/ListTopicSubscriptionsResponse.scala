package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTopicSubscriptionsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more subscriptions that match
    * the request; this value should be passed in a new
    * `ListTopicSubscriptionsRequest` to get more subscriptions.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The names of the subscriptions that match the request. */
  var subscriptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ListTopicSubscriptionsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, subscriptions: js.Array[java.lang.String] = null): ListTopicSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions)
    __obj.asInstanceOf[ListTopicSubscriptionsResponse]
  }
}

