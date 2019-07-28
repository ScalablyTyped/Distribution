package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FinskyOfferType extends js.Object {
  /** The finsky offer type (e.g., PURCHASE=0 RENTAL=3) */
  var finskyOfferType: js.UndefOr[Double] = js.undefined
  /** Indicates whether the offer is giftable. */
  var giftable: js.UndefOr[Boolean] = js.undefined
  /** Offer list (=undiscounted) price in Micros. */
  var listPrice: js.UndefOr[Anon_AmountInMicros] = js.undefined
  /** The rental duration (for rental offers only). */
  var rentalDuration: js.UndefOr[Anon_Count] = js.undefined
  /** Offer retail (=discounted) price in Micros */
  var retailPrice: js.UndefOr[Anon_AmountInMicros] = js.undefined
}

object Anon_FinskyOfferType {
  @scala.inline
  def apply(
    finskyOfferType: Int | Double = null,
    giftable: js.UndefOr[Boolean] = js.undefined,
    listPrice: Anon_AmountInMicros = null,
    rentalDuration: Anon_Count = null,
    retailPrice: Anon_AmountInMicros = null
  ): Anon_FinskyOfferType = {
    val __obj = js.Dynamic.literal()
    if (finskyOfferType != null) __obj.updateDynamic("finskyOfferType")(finskyOfferType.asInstanceOf[js.Any])
    if (!js.isUndefined(giftable)) __obj.updateDynamic("giftable")(giftable)
    if (listPrice != null) __obj.updateDynamic("listPrice")(listPrice)
    if (rentalDuration != null) __obj.updateDynamic("rentalDuration")(rentalDuration)
    if (retailPrice != null) __obj.updateDynamic("retailPrice")(retailPrice)
    __obj.asInstanceOf[Anon_FinskyOfferType]
  }
}

