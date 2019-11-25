package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealTermsGuaranteedFixedPriceTerms extends js.Object {
  /** External billing info for this Deal. This field is relevant when external billing info such as price has a different currency code than DFP/AdX. */
  var billingInfo: js.UndefOr[DealTermsGuaranteedFixedPriceTermsBillingInfo] = js.undefined
  /** Fixed price for the specified buyer. */
  var fixedPrices: js.UndefOr[js.Array[PricePerBuyer]] = js.undefined
  /** Guaranteed impressions as a percentage. This is the percentage of guaranteed looks that the buyer is guaranteeing to buy. */
  var guaranteedImpressions: js.UndefOr[String] = js.undefined
  /** Count of guaranteed looks. Required for deal, optional for product. For CPD deals, buyer changes to guaranteed_looks will be ignored. */
  var guaranteedLooks: js.UndefOr[String] = js.undefined
  /** Count of minimum daily looks for a CPD deal. For CPD deals, buyer should negotiate on this field instead of guaranteed_looks. */
  var minimumDailyLooks: js.UndefOr[String] = js.undefined
}

object DealTermsGuaranteedFixedPriceTerms {
  @scala.inline
  def apply(
    billingInfo: DealTermsGuaranteedFixedPriceTermsBillingInfo = null,
    fixedPrices: js.Array[PricePerBuyer] = null,
    guaranteedImpressions: String = null,
    guaranteedLooks: String = null,
    minimumDailyLooks: String = null
  ): DealTermsGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    if (billingInfo != null) __obj.updateDynamic("billingInfo")(billingInfo.asInstanceOf[js.Any])
    if (fixedPrices != null) __obj.updateDynamic("fixedPrices")(fixedPrices.asInstanceOf[js.Any])
    if (guaranteedImpressions != null) __obj.updateDynamic("guaranteedImpressions")(guaranteedImpressions.asInstanceOf[js.Any])
    if (guaranteedLooks != null) __obj.updateDynamic("guaranteedLooks")(guaranteedLooks.asInstanceOf[js.Any])
    if (minimumDailyLooks != null) __obj.updateDynamic("minimumDailyLooks")(minimumDailyLooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DealTermsGuaranteedFixedPriceTerms]
  }
}

