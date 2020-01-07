package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListSubscriptions method.
  */
@js.native
trait Schema$ListSubscriptionsResponse extends js.Object {
  /**
    * If not empty, indicates that there are more subscriptions that match the
    * request and this value should be passed to the next
    * &lt;code&gt;ListSubscriptionsRequest&lt;/code&gt; to continue.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The subscriptions that match the request.
    */
  var subscription: js.UndefOr[js.Array[Schema$Subscription]] = js.native
}

object Schema$ListSubscriptionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, subscription: js.Array[Schema$Subscription] = null): Schema$ListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListSubscriptionsResponse]
  }
}

