package typings.facebookDashPixel.facebook.Pixel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddToCartParameters extends js.Object {
  var content_ids: js.UndefOr[js.Array[String]] = js.undefined
  var content_name: js.UndefOr[String] = js.undefined
  var content_type: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object AddToCartParameters {
  @scala.inline
  def apply(
    content_ids: js.Array[String] = null,
    content_name: String = null,
    content_type: String = null,
    currency: String = null,
    value: Int | Double = null
  ): AddToCartParameters = {
    val __obj = js.Dynamic.literal()
    if (content_ids != null) __obj.updateDynamic("content_ids")(content_ids)
    if (content_name != null) __obj.updateDynamic("content_name")(content_name)
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToCartParameters]
  }
}

