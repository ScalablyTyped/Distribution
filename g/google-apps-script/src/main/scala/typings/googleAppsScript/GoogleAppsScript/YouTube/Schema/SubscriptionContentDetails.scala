package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionContentDetails extends js.Object {
  var activityType: js.UndefOr[String] = js.undefined
  var newItemCount: js.UndefOr[Double] = js.undefined
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

