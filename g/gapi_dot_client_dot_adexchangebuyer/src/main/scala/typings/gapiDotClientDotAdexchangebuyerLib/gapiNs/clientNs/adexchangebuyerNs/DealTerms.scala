package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealTerms extends js.Object {
  /** Visibilty of the URL in bid requests. */
  var brandingType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates that this ExternalDealId exists under at least two different AdxInventoryDeals. Currently, the only case that the same ExternalDealId will
    * exist is programmatic cross sell case.
    */
  var crossListedExternalDealIdType: js.UndefOr[java.lang.String] = js.undefined
  /** Description for the proposed terms of the deal. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Non-binding estimate of the estimated gross spend for this deal Can be set by buyer or seller. */
  var estimatedGrossSpend: js.UndefOr[Price] = js.undefined
  /** Non-binding estimate of the impressions served per day Can be set by buyer or seller. */
  var estimatedImpressionsPerDay: js.UndefOr[java.lang.String] = js.undefined
  /** The terms for guaranteed fixed price deals. */
  var guaranteedFixedPriceTerms: js.UndefOr[DealTermsGuaranteedFixedPriceTerms] = js.undefined
  /** The terms for non-guaranteed auction deals. */
  var nonGuaranteedAuctionTerms: js.UndefOr[DealTermsNonGuaranteedAuctionTerms] = js.undefined
  /** The terms for non-guaranteed fixed price deals. */
  var nonGuaranteedFixedPriceTerms: js.UndefOr[DealTermsNonGuaranteedFixedPriceTerms] = js.undefined
  /** The terms for rubicon non-guaranteed deals. */
  var rubiconNonGuaranteedTerms: js.UndefOr[DealTermsRubiconNonGuaranteedTerms] = js.undefined
  /** For deals with Cost Per Day billing, defines the timezone used to mark the boundaries of a day (buyer-readonly) */
  var sellerTimeZone: js.UndefOr[java.lang.String] = js.undefined
}

object DealTerms {
  @scala.inline
  def apply(
    brandingType: java.lang.String = null,
    crossListedExternalDealIdType: java.lang.String = null,
    description: java.lang.String = null,
    estimatedGrossSpend: Price = null,
    estimatedImpressionsPerDay: java.lang.String = null,
    guaranteedFixedPriceTerms: DealTermsGuaranteedFixedPriceTerms = null,
    nonGuaranteedAuctionTerms: DealTermsNonGuaranteedAuctionTerms = null,
    nonGuaranteedFixedPriceTerms: DealTermsNonGuaranteedFixedPriceTerms = null,
    rubiconNonGuaranteedTerms: DealTermsRubiconNonGuaranteedTerms = null,
    sellerTimeZone: java.lang.String = null
  ): DealTerms = {
    val __obj = js.Dynamic.literal()
    if (brandingType != null) __obj.updateDynamic("brandingType")(brandingType)
    if (crossListedExternalDealIdType != null) __obj.updateDynamic("crossListedExternalDealIdType")(crossListedExternalDealIdType)
    if (description != null) __obj.updateDynamic("description")(description)
    if (estimatedGrossSpend != null) __obj.updateDynamic("estimatedGrossSpend")(estimatedGrossSpend)
    if (estimatedImpressionsPerDay != null) __obj.updateDynamic("estimatedImpressionsPerDay")(estimatedImpressionsPerDay)
    if (guaranteedFixedPriceTerms != null) __obj.updateDynamic("guaranteedFixedPriceTerms")(guaranteedFixedPriceTerms)
    if (nonGuaranteedAuctionTerms != null) __obj.updateDynamic("nonGuaranteedAuctionTerms")(nonGuaranteedAuctionTerms)
    if (nonGuaranteedFixedPriceTerms != null) __obj.updateDynamic("nonGuaranteedFixedPriceTerms")(nonGuaranteedFixedPriceTerms)
    if (rubiconNonGuaranteedTerms != null) __obj.updateDynamic("rubiconNonGuaranteedTerms")(rubiconNonGuaranteedTerms)
    if (sellerTimeZone != null) __obj.updateDynamic("sellerTimeZone")(sellerTimeZone)
    __obj.asInstanceOf[DealTerms]
  }
}

