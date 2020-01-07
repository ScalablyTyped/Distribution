package typings.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListSubscriptions` method.
  */
@js.native
trait Schema$ListSubscriptionsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more subscriptions that match
    * the request; this value should be passed in a new
    * `ListSubscriptionsRequest` to get more subscriptions.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The subscriptions that match the request.
    */
  var subscriptions: js.UndefOr[js.Array[Schema$Subscription]] = js.native
}

object Schema$ListSubscriptionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, subscriptions: js.Array[Schema$Subscription] = null): Schema$ListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListSubscriptionsResponse]
  }
}

