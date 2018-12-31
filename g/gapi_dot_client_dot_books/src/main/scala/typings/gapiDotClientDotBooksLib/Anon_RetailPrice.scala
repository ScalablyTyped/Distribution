package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RetailPrice extends js.Object {
  /** The finsky offer type (e.g., PURCHASE=0 RENTAL=3) */
  var finskyOfferType: js.UndefOr[scala.Double] = js.undefined
  /** Indicates whether the offer is giftable. */
  var giftable: js.UndefOr[scala.Boolean] = js.undefined
  /** Offer list (=undiscounted) price in Micros. */
  var listPrice: js.UndefOr[Anon_CurrencyCodeAmountInMicros] = js.undefined
  /** The rental duration (for rental offers only). */
  var rentalDuration: js.UndefOr[Anon_Count] = js.undefined
  /** Offer retail (=discounted) price in Micros */
  var retailPrice: js.UndefOr[Anon_CurrencyCodeAmountInMicros] = js.undefined
}

