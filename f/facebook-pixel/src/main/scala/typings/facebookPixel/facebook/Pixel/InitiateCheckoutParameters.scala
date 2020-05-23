package typings.facebookPixel.facebook.Pixel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateCheckoutParameters extends js.Object {
  var content_category: js.UndefOr[String] = js.undefined
  var content_ids: js.UndefOr[js.Array[String]] = js.undefined
  var content_name: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var num_items: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object InitiateCheckoutParameters {
  @scala.inline
  def apply(
    content_category: String = null,
    content_ids: js.Array[String] = null,
    content_name: String = null,
    currency: String = null,
    num_items: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): InitiateCheckoutParameters = {
    val __obj = js.Dynamic.literal()
    if (content_category != null) __obj.updateDynamic("content_category")(content_category.asInstanceOf[js.Any])
    if (content_ids != null) __obj.updateDynamic("content_ids")(content_ids.asInstanceOf[js.Any])
    if (content_name != null) __obj.updateDynamic("content_name")(content_name.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (!js.isUndefined(num_items)) __obj.updateDynamic("num_items")(num_items.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateCheckoutParameters]
  }
}

