package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFinskyOfferType extends js.Object {
  /** The finsky offer type (e.g., PURCHASE=0 RENTAL=3) */
  var finskyOfferType: js.UndefOr[Double] = js.undefined
  /** Indicates whether the offer is giftable. */
  var giftable: js.UndefOr[Boolean] = js.undefined
  /** Offer list (=undiscounted) price in Micros. */
  var listPrice: js.UndefOr[AnonAmountInMicros] = js.undefined
  /** The rental duration (for rental offers only). */
  var rentalDuration: js.UndefOr[AnonCount] = js.undefined
  /** Offer retail (=discounted) price in Micros */
  var retailPrice: js.UndefOr[AnonAmountInMicros] = js.undefined
}

object AnonFinskyOfferType {
  @scala.inline
  def apply(
    finskyOfferType: Int | Double = null,
    giftable: js.UndefOr[Boolean] = js.undefined,
    listPrice: AnonAmountInMicros = null,
    rentalDuration: AnonCount = null,
    retailPrice: AnonAmountInMicros = null
  ): AnonFinskyOfferType = {
    val __obj = js.Dynamic.literal()
    if (finskyOfferType != null) __obj.updateDynamic("finskyOfferType")(finskyOfferType.asInstanceOf[js.Any])
    if (!js.isUndefined(giftable)) __obj.updateDynamic("giftable")(giftable.asInstanceOf[js.Any])
    if (listPrice != null) __obj.updateDynamic("listPrice")(listPrice.asInstanceOf[js.Any])
    if (rentalDuration != null) __obj.updateDynamic("rentalDuration")(rentalDuration.asInstanceOf[js.Any])
    if (retailPrice != null) __obj.updateDynamic("retailPrice")(retailPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFinskyOfferType]
  }
}

