package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DealTermsGuaranteedFixedPriceTerms extends js.Object {
  /**
    * External billing info for this Deal. This field is relevant when external
    * billing info such as price has a different currency code than DFP/AdX.
    */
  var billingInfo: js.UndefOr[Schema$DealTermsGuaranteedFixedPriceTermsBillingInfo] = js.native
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[Schema$PricePerBuyer]] = js.native
  /**
    * Guaranteed impressions as a percentage. This is the percentage of
    * guaranteed looks that the buyer is guaranteeing to buy.
    */
  var guaranteedImpressions: js.UndefOr[String] = js.native
  /**
    * Count of guaranteed looks. Required for deal, optional for product. For
    * CPD deals, buyer changes to guaranteed_looks will be ignored.
    */
  var guaranteedLooks: js.UndefOr[String] = js.native
  /**
    * Count of minimum daily looks for a CPD deal. For CPD deals, buyer should
    * negotiate on this field instead of guaranteed_looks.
    */
  var minimumDailyLooks: js.UndefOr[String] = js.native
}

object Schema$DealTermsGuaranteedFixedPriceTerms {
  @scala.inline
  def apply(
    billingInfo: Schema$DealTermsGuaranteedFixedPriceTermsBillingInfo = null,
    fixedPrices: js.Array[Schema$PricePerBuyer] = null,
    guaranteedImpressions: String = null,
    guaranteedLooks: String = null,
    minimumDailyLooks: String = null
  ): Schema$DealTermsGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    if (billingInfo != null) __obj.updateDynamic("billingInfo")(billingInfo.asInstanceOf[js.Any])
    if (fixedPrices != null) __obj.updateDynamic("fixedPrices")(fixedPrices.asInstanceOf[js.Any])
    if (guaranteedImpressions != null) __obj.updateDynamic("guaranteedImpressions")(guaranteedImpressions.asInstanceOf[js.Any])
    if (guaranteedLooks != null) __obj.updateDynamic("guaranteedLooks")(guaranteedLooks.asInstanceOf[js.Any])
    if (minimumDailyLooks != null) __obj.updateDynamic("minimumDailyLooks")(minimumDailyLooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DealTermsGuaranteedFixedPriceTerms]
  }
}

