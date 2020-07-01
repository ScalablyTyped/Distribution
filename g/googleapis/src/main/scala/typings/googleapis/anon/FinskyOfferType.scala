package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinskyOfferType extends js.Object {
  var finskyOfferType: js.UndefOr[Double] = js.native
  var giftable: js.UndefOr[Boolean] = js.native
  var listPrice: js.UndefOr[AmountInMicros] = js.native
  var rentalDuration: js.UndefOr[Unit] = js.native
  var retailPrice: js.UndefOr[AmountInMicros] = js.native
}

object FinskyOfferType {
  @scala.inline
  def apply(
    finskyOfferType: js.UndefOr[Double] = js.undefined,
    giftable: js.UndefOr[Boolean] = js.undefined,
    listPrice: AmountInMicros = null,
    rentalDuration: Unit = null,
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

