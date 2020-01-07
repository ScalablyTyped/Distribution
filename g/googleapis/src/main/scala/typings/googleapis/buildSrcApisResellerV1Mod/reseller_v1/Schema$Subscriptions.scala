package typings.googleapis.buildSrcApisResellerV1Mod.reseller_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a subscription list.
  */
@js.native
trait Schema$Subscriptions extends js.Object {
  /**
    * Identifies the resource as a collection of subscriptions. Value:
    * reseller#subscriptions
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The subscriptions in this page of results.
    */
  var subscriptions: js.UndefOr[js.Array[Schema$Subscription]] = js.native
}

object Schema$Subscriptions {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    subscriptions: js.Array[Schema$Subscription] = null
  ): Schema$Subscriptions = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Subscriptions]
  }
}

