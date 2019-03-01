package typings
package gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscriptions extends js.Object {
  /** Identifies the resource as a collection of subscriptions. Value: reseller#subscriptions */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The subscriptions in this page of results. */
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.undefined
}

object Subscriptions {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    subscriptions: js.Array[Subscription] = null
  ): Subscriptions = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions)
    __obj.asInstanceOf[Subscriptions]
  }
}

