package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PricePerBuyer extends js.Object {
  /** Optional access type for this buyer. */
  var auctionTier: js.UndefOr[java.lang.String] = js.undefined
  /** Reference to the buyer that will get billed. */
  var billedBuyer: js.UndefOr[Buyer] = js.undefined
  /**
               * The buyer who will pay this price. If unset, all buyers can pay this price (if the advertisers match, and there's no more specific rule matching the
               * buyer).
               */
  var buyer: js.UndefOr[Buyer] = js.undefined
  /** The specified price */
  var price: js.UndefOr[Price] = js.undefined
}

