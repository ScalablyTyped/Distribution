package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionContentDetails extends js.Object {
  /** The type of activity this subscription is for (only uploads, everything). */
  var activityType: js.UndefOr[java.lang.String] = js.undefined
  /** The number of new items in the subscription since its content was last read. */
  var newItemCount: js.UndefOr[scala.Double] = js.undefined
  /** The approximate number of items that the subscription points to. */
  var totalItemCount: js.UndefOr[scala.Double] = js.undefined
}

object SubscriptionContentDetails {
  @scala.inline
  def apply(
    activityType: java.lang.String = null,
    newItemCount: scala.Int | scala.Double = null,
    totalItemCount: scala.Int | scala.Double = null
  ): SubscriptionContentDetails = {
    val __obj = js.Dynamic.literal()
    if (activityType != null) __obj.updateDynamic("activityType")(activityType)
    if (newItemCount != null) __obj.updateDynamic("newItemCount")(newItemCount.asInstanceOf[js.Any])
    if (totalItemCount != null) __obj.updateDynamic("totalItemCount")(totalItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionContentDetails]
  }
}

