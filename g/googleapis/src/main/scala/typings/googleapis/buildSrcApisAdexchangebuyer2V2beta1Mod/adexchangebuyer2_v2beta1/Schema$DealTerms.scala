package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The deal terms specify the details of a Product/deal. They specify things
  * like price per buyer, the type of pricing model (e.g., fixed price,
  * auction) and expected impressions from the publisher.
  */
@js.native
trait Schema$DealTerms extends js.Object {
  /**
    * Visibility of the URL in bid requests. (default: BRANDED)
    */
  var brandingType: js.UndefOr[String] = js.native
  /**
    * Publisher provided description for the terms.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Non-binding estimate of the estimated gross spend for this deal. Can be
    * set by buyer or seller.
    */
  var estimatedGrossSpend: js.UndefOr[Schema$Price] = js.native
  /**
    * Non-binding estimate of the impressions served per day. Can be set by
    * buyer or seller.
    */
  var estimatedImpressionsPerDay: js.UndefOr[String] = js.native
  /**
    * The terms for guaranteed fixed price deals.
    */
  var guaranteedFixedPriceTerms: js.UndefOr[Schema$GuaranteedFixedPriceTerms] = js.native
  /**
    * The terms for non-guaranteed auction deals.
    */
  var nonGuaranteedAuctionTerms: js.UndefOr[Schema$NonGuaranteedAuctionTerms] = js.native
  /**
    * The terms for non-guaranteed fixed price deals.
    */
  var nonGuaranteedFixedPriceTerms: js.UndefOr[Schema$NonGuaranteedFixedPriceTerms] = js.native
  /**
    * The time zone name. For deals with Cost Per Day billing, defines the time
    * zone used to mark the boundaries of a day. It should be an IANA TZ name,
    * such as &quot;America/Los_Angeles&quot;. For more information, see
    * https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
    */
  var sellerTimeZone: js.UndefOr[String] = js.native
}

object Schema$DealTerms {
  @scala.inline
  def apply(
    brandingType: String = null,
    description: String = null,
    estimatedGrossSpend: Schema$Price = null,
    estimatedImpressionsPerDay: String = null,
    guaranteedFixedPriceTerms: Schema$GuaranteedFixedPriceTerms = null,
    nonGuaranteedAuctionTerms: Schema$NonGuaranteedAuctionTerms = null,
    nonGuaranteedFixedPriceTerms: Schema$NonGuaranteedFixedPriceTerms = null,
    sellerTimeZone: String = null
  ): Schema$DealTerms = {
    val __obj = js.Dynamic.literal()
    if (brandingType != null) __obj.updateDynamic("brandingType")(brandingType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (estimatedGrossSpend != null) __obj.updateDynamic("estimatedGrossSpend")(estimatedGrossSpend.asInstanceOf[js.Any])
    if (estimatedImpressionsPerDay != null) __obj.updateDynamic("estimatedImpressionsPerDay")(estimatedImpressionsPerDay.asInstanceOf[js.Any])
    if (guaranteedFixedPriceTerms != null) __obj.updateDynamic("guaranteedFixedPriceTerms")(guaranteedFixedPriceTerms.asInstanceOf[js.Any])
    if (nonGuaranteedAuctionTerms != null) __obj.updateDynamic("nonGuaranteedAuctionTerms")(nonGuaranteedAuctionTerms.asInstanceOf[js.Any])
    if (nonGuaranteedFixedPriceTerms != null) __obj.updateDynamic("nonGuaranteedFixedPriceTerms")(nonGuaranteedFixedPriceTerms.asInstanceOf[js.Any])
    if (sellerTimeZone != null) __obj.updateDynamic("sellerTimeZone")(sellerTimeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DealTerms]
  }
}

