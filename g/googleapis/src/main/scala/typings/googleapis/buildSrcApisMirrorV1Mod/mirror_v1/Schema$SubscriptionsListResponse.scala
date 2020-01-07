package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Subscriptions. This is the response from the server to GET
  * requests on the subscription collection.
  */
@js.native
trait Schema$SubscriptionsListResponse extends js.Object {
  /**
    * The list of subscriptions.
    */
  var items: js.UndefOr[js.Array[Schema$Subscription]] = js.native
  /**
    * The type of resource. This is always mirror#subscriptionsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$SubscriptionsListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$Subscription] = null, kind: String = null): Schema$SubscriptionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubscriptionsListResponse]
  }
}

