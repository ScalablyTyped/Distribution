package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderCustomerMarketingRightsInfo extends js.Object {
  /**
    * Last known user selection regarding marketing preferences. In certain
    * cases this selection might not be known, so this field would be empty.
    */
  var explicitMarketingPreference: js.UndefOr[String] = js.native
  /**
    * Timestamp when last time marketing preference was updated. Could be
    * empty, if user wasn&#39;t offered a selection yet.
    */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.native
  /**
    * Email address that can be used for marketing purposes. The field may be
    * empty even if explicitMarketingPreference is &#39;granted&#39;. This
    * happens when retrieving an old order from the customer who deleted their
    * account.
    */
  var marketingEmailAddress: js.UndefOr[String] = js.native
}

object Schema$OrderCustomerMarketingRightsInfo {
  @scala.inline
  def apply(
    explicitMarketingPreference: String = null,
    lastUpdatedTimestamp: String = null,
    marketingEmailAddress: String = null
  ): Schema$OrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    if (explicitMarketingPreference != null) __obj.updateDynamic("explicitMarketingPreference")(explicitMarketingPreference.asInstanceOf[js.Any])
    if (lastUpdatedTimestamp != null) __obj.updateDynamic("lastUpdatedTimestamp")(lastUpdatedTimestamp.asInstanceOf[js.Any])
    if (marketingEmailAddress != null) __obj.updateDynamic("marketingEmailAddress")(marketingEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderCustomerMarketingRightsInfo]
  }
}

