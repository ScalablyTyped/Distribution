package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrderCustomerMarketingRightsInfo extends js.Object {
  var explicitMarketingPreference: js.UndefOr[String] = js.undefined
  var lastUpdatedTimestamp: js.UndefOr[String] = js.undefined
}

object TestOrderCustomerMarketingRightsInfo {
  @scala.inline
  def apply(explicitMarketingPreference: String = null, lastUpdatedTimestamp: String = null): TestOrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    if (explicitMarketingPreference != null) __obj.updateDynamic("explicitMarketingPreference")(explicitMarketingPreference.asInstanceOf[js.Any])
    if (lastUpdatedTimestamp != null) __obj.updateDynamic("lastUpdatedTimestamp")(lastUpdatedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOrderCustomerMarketingRightsInfo]
  }
}

