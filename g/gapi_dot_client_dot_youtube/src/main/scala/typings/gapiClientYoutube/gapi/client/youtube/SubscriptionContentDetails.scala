package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionContentDetails extends js.Object {
  /** The type of activity this subscription is for (only uploads, everything). */
  var activityType: js.UndefOr[String] = js.undefined
  /** The number of new items in the subscription since its content was last read. */
  var newItemCount: js.UndefOr[Double] = js.undefined
  /** The approximate number of items that the subscription points to. */
  var totalItemCount: js.UndefOr[Double] = js.undefined
}

object SubscriptionContentDetails {
  @scala.inline
  def apply(
    activityType: String = null,
    newItemCount: js.UndefOr[Double] = js.undefined,
    totalItemCount: js.UndefOr[Double] = js.undefined
  ): SubscriptionContentDetails = {
    val __obj = js.Dynamic.literal()
    if (activityType != null) __obj.updateDynamic("activityType")(activityType.asInstanceOf[js.Any])
    if (!js.isUndefined(newItemCount)) __obj.updateDynamic("newItemCount")(newItemCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItemCount)) __obj.updateDynamic("totalItemCount")(totalItemCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionContentDetails]
  }
}

