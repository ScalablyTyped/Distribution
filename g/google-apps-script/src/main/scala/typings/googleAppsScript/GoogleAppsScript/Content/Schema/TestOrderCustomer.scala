package typings.googleAppsScript.GoogleAppsScript.Content.Schema

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
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitMarketingPreference)) __obj.updateDynamic("explicitMarketingPreference")(explicitMarketingPreference.get.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (marketingRightsInfo != null) __obj.updateDynamic("marketingRightsInfo")(marketingRightsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOrderCustomer]
  }
}

