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

