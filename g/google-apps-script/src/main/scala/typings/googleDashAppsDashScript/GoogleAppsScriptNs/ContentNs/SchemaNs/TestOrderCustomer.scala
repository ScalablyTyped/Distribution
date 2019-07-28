package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrderCustomer extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var explicitMarketingPreference: js.UndefOr[Boolean] = js.undefined
  var fullName: js.UndefOr[String] = js.undefined
  var marketingRightsInfo: js.UndefOr[TestOrderCustomerMarketingRightsInfo] = js.undefined
}

object TestOrderCustomer {
  @scala.inline
  def apply(
    email: String = null,
    explicitMarketingPreference: js.UndefOr[Boolean] = js.undefined,
    fullName: String = null,
    marketingRightsInfo: TestOrderCustomerMarketingRightsInfo = null
  ): TestOrderCustomer = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(explicitMarketingPreference)) __obj.updateDynamic("explicitMarketingPreference")(explicitMarketingPreference)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (marketingRightsInfo != null) __obj.updateDynamic("marketingRightsInfo")(marketingRightsInfo)
    __obj.asInstanceOf[TestOrderCustomer]
  }
}

