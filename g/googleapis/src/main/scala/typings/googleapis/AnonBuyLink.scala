package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBuyLink extends js.Object {
  var buyLink: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var isEbook: js.UndefOr[Boolean] = js.native
  var listPrice: js.UndefOr[AnonAmount] = js.native
  var offers: js.UndefOr[js.Array[AnonFinskyOfferType]] = js.native
  var onSaleDate: js.UndefOr[String] = js.native
  var retailPrice: js.UndefOr[AnonAmount] = js.native
  var saleability: js.UndefOr[String] = js.native
}

object AnonBuyLink {
  @scala.inline
  def apply(
    buyLink: String = null,
    country: String = null,
    isEbook: js.UndefOr[Boolean] = js.undefined,
    listPrice: AnonAmount = null,
    offers: js.Array[AnonFinskyOfferType] = null,
    onSaleDate: String = null,
    retailPrice: AnonAmount = null,
    saleability: String = null
  ): AnonBuyLink = {
    val __obj = js.Dynamic.literal()
    if (buyLink != null) __obj.updateDynamic("buyLink")(buyLink.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(isEbook)) __obj.updateDynamic("isEbook")(isEbook.asInstanceOf[js.Any])
    if (listPrice != null) __obj.updateDynamic("listPrice")(listPrice.asInstanceOf[js.Any])
    if (offers != null) __obj.updateDynamic("offers")(offers.asInstanceOf[js.Any])
    if (onSaleDate != null) __obj.updateDynamic("onSaleDate")(onSaleDate.asInstanceOf[js.Any])
    if (retailPrice != null) __obj.updateDynamic("retailPrice")(retailPrice.asInstanceOf[js.Any])
    if (saleability != null) __obj.updateDynamic("saleability")(saleability.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuyLink]
  }
}

