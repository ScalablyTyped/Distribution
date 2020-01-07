package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderCustomer extends js.Object {
  /**
    * Deprecated.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Deprecated. Please use marketingRightsInfo instead.
    */
  var explicitMarketingPreference: js.UndefOr[Boolean] = js.native
  /**
    * Full name of the customer.
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * Customer&#39;s marketing preferences.
    */
  var marketingRightsInfo: js.UndefOr[Schema$OrderCustomerMarketingRightsInfo] = js.native
}

object Schema$OrderCustomer {
  @scala.inline
  def apply(
    email: String = null,
    explicitMarketingPreference: js.UndefOr[Boolean] = js.undefined,
    fullName: String = null,
    marketingRightsInfo: Schema$OrderCustomerMarketingRightsInfo = null
  ): Schema$OrderCustomer = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitMarketingPreference)) __obj.updateDynamic("explicitMarketingPreference")(explicitMarketingPreference.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (marketingRightsInfo != null) __obj.updateDynamic("marketingRightsInfo")(marketingRightsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderCustomer]
  }
}

