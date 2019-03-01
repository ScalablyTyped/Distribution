package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSubscriptionsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more subscriptions that match
    * the request; this value should be passed in a new
    * `ListSubscriptionsRequest` to get more subscriptions.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The subscriptions that match the request. */
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.undefined
}

object ListSubscriptionsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, subscriptions: js.Array[Subscription] = null): ListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions)
    __obj.asInstanceOf[ListSubscriptionsResponse]
  }
}

