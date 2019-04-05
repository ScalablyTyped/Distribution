package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderCustomerMarketingRightsInfo extends js.Object {
  var explicitMarketingPreference: js.UndefOr[java.lang.String] = js.undefined
  var lastUpdatedTimestamp: js.UndefOr[java.lang.String] = js.undefined
  var marketingEmailAddress: js.UndefOr[java.lang.String] = js.undefined
}

object OrderCustomerMarketingRightsInfo {
  @scala.inline
  def apply(
    explicitMarketingPreference: java.lang.String = null,
    lastUpdatedTimestamp: java.lang.String = null,
    marketingEmailAddress: java.lang.String = null
  ): OrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    if (explicitMarketingPreference != null) __obj.updateDynamic("explicitMarketingPreference")(explicitMarketingPreference)
    if (lastUpdatedTimestamp != null) __obj.updateDynamic("lastUpdatedTimestamp")(lastUpdatedTimestamp)
    if (marketingEmailAddress != null) __obj.updateDynamic("marketingEmailAddress")(marketingEmailAddress)
    __obj.asInstanceOf[OrderCustomerMarketingRightsInfo]
  }
}

