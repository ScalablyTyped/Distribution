package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionContentDetails extends js.Object {
  var activityType: js.UndefOr[java.lang.String] = js.undefined
  var newItemCount: js.UndefOr[scala.Double] = js.undefined
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

