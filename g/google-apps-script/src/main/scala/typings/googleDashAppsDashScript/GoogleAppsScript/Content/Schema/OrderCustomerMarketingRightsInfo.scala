package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderCustomerMarketingRightsInfo extends js.Object {
  var explicitMarketingPreference: js.UndefOr[String] = js.undefined
  var lastUpdatedTimestamp: js.UndefOr[String] = js.undefined
  var marketingEmailAddress: js.UndefOr[String] = js.undefined
}

object OrderCustomerMarketingRightsInfo {
  @scala.inline
  def apply(
    explicitMarketingPreference: String = null,
    lastUpdatedTimestamp: String = null,
    marketingEmailAddress: String = null
  ): OrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    if (explicitMarketingPreference != null) __obj.updateDynamic("explicitMarketingPreference")(explicitMarketingPreference)
    if (lastUpdatedTimestamp != null) __obj.updateDynamic("lastUpdatedTimestamp")(lastUpdatedTimestamp)
    if (marketingEmailAddress != null) __obj.updateDynamic("marketingEmailAddress")(marketingEmailAddress)
    __obj.asInstanceOf[OrderCustomerMarketingRightsInfo]
  }
}

