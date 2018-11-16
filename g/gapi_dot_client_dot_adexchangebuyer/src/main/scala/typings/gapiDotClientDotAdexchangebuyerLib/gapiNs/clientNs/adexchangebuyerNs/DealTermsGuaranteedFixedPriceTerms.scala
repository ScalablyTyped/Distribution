package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DealTermsGuaranteedFixedPriceTerms extends js.Object {
  /** External billing info for this Deal. This field is relevant when external billing info such as price has a different currency code than DFP/AdX. */
  var billingInfo: js.UndefOr[DealTermsGuaranteedFixedPriceTermsBillingInfo] = js.undefined
  /** Fixed price for the specified buyer. */
  var fixedPrices: js.UndefOr[js.Array[PricePerBuyer]] = js.undefined
  /** Guaranteed impressions as a percentage. This is the percentage of guaranteed looks that the buyer is guaranteeing to buy. */
  var guaranteedImpressions: js.UndefOr[java.lang.String] = js.undefined
  /** Count of guaranteed looks. Required for deal, optional for product. For CPD deals, buyer changes to guaranteed_looks will be ignored. */
  var guaranteedLooks: js.UndefOr[java.lang.String] = js.undefined
  /** Count of minimum daily looks for a CPD deal. For CPD deals, buyer should negotiate on this field instead of guaranteed_looks. */
  var minimumDailyLooks: js.UndefOr[java.lang.String] = js.undefined
}

