package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderCustomer extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var explicitMarketingPreference: js.UndefOr[Boolean] = js.undefined
  var fullName: js.UndefOr[String] = js.undefined
  var marketingRightsInfo: js.UndefOr[OrderCustomerMarketingRightsInfo] = js.undefined
}

object OrderCustomer {
  @scala.inline
  def apply(
    email: String = null,
    explicitMarketingPreference: js.UndefOr[Boolean] = js.undefined,
    fullName: String = null,
    marketingRightsInfo: OrderCustomerMarketingRightsInfo = null
  ): OrderCustomer = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitMarketingPreference)) __obj.updateDynamic("explicitMarketingPreference")(explicitMarketingPreference.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (marketingRightsInfo != null) __obj.updateDynamic("marketingRightsInfo")(marketingRightsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderCustomer]
  }
}

