package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Terms for Programmatic Guaranteed Deals.
  */
@js.native
trait Schema$GuaranteedFixedPriceTerms extends js.Object {
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
    * Count of guaranteed looks. Required for deal, optional for product.
    */
  var guaranteedLooks: js.UndefOr[String] = js.native
  /**
    * Daily minimum looks for CPD deal types.
    */
  var minimumDailyLooks: js.UndefOr[String] = js.native
}

object Schema$GuaranteedFixedPriceTerms {
  @scala.inline
  def apply(
    fixedPrices: js.Array[Schema$PricePerBuyer] = null,
    guaranteedImpressions: String = null,
    guaranteedLooks: String = null,
    minimumDailyLooks: String = null
  ): Schema$GuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    if (fixedPrices != null) __obj.updateDynamic("fixedPrices")(fixedPrices.asInstanceOf[js.Any])
    if (guaranteedImpressions != null) __obj.updateDynamic("guaranteedImpressions")(guaranteedImpressions.asInstanceOf[js.Any])
    if (guaranteedLooks != null) __obj.updateDynamic("guaranteedLooks")(guaranteedLooks.asInstanceOf[js.Any])
    if (minimumDailyLooks != null) __obj.updateDynamic("minimumDailyLooks")(minimumDailyLooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GuaranteedFixedPriceTerms]
  }
}

