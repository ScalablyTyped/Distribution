package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FinskyOfferType extends js.Object {
  var finskyOfferType: js.UndefOr[Double] = js.native
  var giftable: js.UndefOr[Boolean] = js.native
  var listPrice: js.UndefOr[Anon_AmountInMicros] = js.native
  var rentalDuration: js.UndefOr[Anon_CountUnit] = js.native
  var retailPrice: js.UndefOr[Anon_AmountInMicros] = js.native
}

object Anon_FinskyOfferType {
  @scala.inline
  def apply(
    finskyOfferType: Int | Double = null,
    giftable: js.UndefOr[Boolean] = js.undefined,
    listPrice: Anon_AmountInMicros = null,
    rentalDuration: Anon_CountUnit = null,
    retailPrice: Anon_AmountInMicros = null
  ): Anon_FinskyOfferType = {
    val __obj = js.Dynamic.literal()
    if (finskyOfferType != null) __obj.updateDynamic("finskyOfferType")(finskyOfferType.asInstanceOf[js.Any])
    if (!js.isUndefined(giftable)) __obj.updateDynamic("giftable")(giftable.asInstanceOf[js.Any])
    if (listPrice != null) __obj.updateDynamic("listPrice")(listPrice.asInstanceOf[js.Any])
    if (rentalDuration != null) __obj.updateDynamic("rentalDuration")(rentalDuration.asInstanceOf[js.Any])
    if (retailPrice != null) __obj.updateDynamic("retailPrice")(retailPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FinskyOfferType]
  }
}

