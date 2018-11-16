package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DealTermsNonGuaranteedAuctionTerms extends js.Object {
  /** True if open auction buyers are allowed to compete with invited buyers in this private auction (buyer-readonly). */
  var autoOptimizePrivateAuction: js.UndefOr[scala.Boolean] = js.undefined
  /** Reserve price for the specified buyer. */
  var reservePricePerBuyers: js.UndefOr[js.Array[PricePerBuyer]] = js.undefined
}

