package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrderCustomerMarketingRightsInfo extends js.Object {
  var explicitMarketingPreference: js.UndefOr[java.lang.String] = js.undefined
  var lastUpdatedTimestamp: js.UndefOr[java.lang.String] = js.undefined
}

object TestOrderCustomerMarketingRightsInfo {
  @scala.inline
  def apply(
    explicitMarketingPreference: java.lang.String = null,
    lastUpdatedTimestamp: java.lang.String = null
  ): TestOrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    if (explicitMarketingPreference != null) __obj.updateDynamic("explicitMarketingPreference")(explicitMarketingPreference)
    if (lastUpdatedTimestamp != null) __obj.updateDynamic("lastUpdatedTimestamp")(lastUpdatedTimestamp)
    __obj.asInstanceOf[TestOrderCustomerMarketingRightsInfo]
  }
}

