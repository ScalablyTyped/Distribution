package typings.facebookPixel.facebook.Pixel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseParameters extends js.Object {
  var content_ids: js.UndefOr[js.Array[String]] = js.undefined
  var content_name: js.UndefOr[String] = js.undefined
  var content_type: js.UndefOr[String] = js.undefined
  var currency: String
  var num_items: js.UndefOr[Double] = js.undefined
  var order_id: js.UndefOr[String] = js.undefined
  var value: Double
}

object PurchaseParameters {
  @scala.inline
  def apply(
    currency: String,
    value: Double,
    content_ids: js.Array[String] = null,
    content_name: String = null,
    content_type: String = null,
    num_items: Int | Double = null,
    order_id: String = null
  ): PurchaseParameters = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (content_ids != null) __obj.updateDynamic("content_ids")(content_ids.asInstanceOf[js.Any])
    if (content_name != null) __obj.updateDynamic("content_name")(content_name.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (num_items != null) __obj.updateDynamic("num_items")(num_items.asInstanceOf[js.Any])
    if (order_id != null) __obj.updateDynamic("order_id")(order_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseParameters]
  }
}

