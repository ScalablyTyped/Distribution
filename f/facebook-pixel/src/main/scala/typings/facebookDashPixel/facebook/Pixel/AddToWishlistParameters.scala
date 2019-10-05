package typings.facebookDashPixel.facebook.Pixel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddToWishlistParameters extends js.Object {
  var content_category: js.UndefOr[String] = js.undefined
  var content_ids: js.UndefOr[js.Array[String]] = js.undefined
  var content_name: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object AddToWishlistParameters {
  @scala.inline
  def apply(
    content_category: String = null,
    content_ids: js.Array[String] = null,
    content_name: String = null,
    currency: String = null,
    value: Int | Double = null
  ): AddToWishlistParameters = {
    val __obj = js.Dynamic.literal()
    if (content_category != null) __obj.updateDynamic("content_category")(content_category)
    if (content_ids != null) __obj.updateDynamic("content_ids")(content_ids)
    if (content_name != null) __obj.updateDynamic("content_name")(content_name)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToWishlistParameters]
  }
}

