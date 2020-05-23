package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinskyOfferType extends js.Object {
  /** The finsky offer type (e.g., PURCHASE=0 RENTAL=3) */
  var finskyOfferType: js.UndefOr[Double] = js.undefined
  /** Indicates whether the offer is giftable. */
  var giftable: js.UndefOr[Boolean] = js.undefined
  /** Offer list (=undiscounted) price in Micros. */
  var listPrice: js.UndefOr[AmountInMicros] = js.undefined
  /** The rental duration (for rental offers only). */
  var rentalDuration: js.UndefOr[Count] = js.undefined
  /** Offer retail (=discounted) price in Micros */
  var retailPrice: js.UndefOr[AmountInMicros] = js.undefined
}

object FinskyOfferType {
  @scala.inline
  def apply(
    finskyOfferType: js.UndefOr[Double] = js.undefined,
    giftable: js.UndefOr[Boolean] = js.undefined,
    listPrice: AmountInMicros = null,
    rentalDuration: Count = null,
    retailPrice: AmountInMicros = null
  ): FinskyOfferType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(finskyOfferType)) __obj.updateDynamic("finskyOfferType")(finskyOfferType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(giftable)) __obj.updateDynamic("giftable")(giftable.get.asInstanceOf[js.Any])
    if (listPrice != null) __obj.updateDynamic("listPrice")(listPrice.asInstanceOf[js.Any])
    if (rentalDuration != null) __obj.updateDynamic("rentalDuration")(rentalDuration.asInstanceOf[js.Any])
    if (retailPrice != null) __obj.updateDynamic("retailPrice")(retailPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinskyOfferType]
  }
}

