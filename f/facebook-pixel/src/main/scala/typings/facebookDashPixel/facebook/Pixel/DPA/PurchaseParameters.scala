package typings.facebookDashPixel.facebook.Pixel.DPA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseParameters
  extends typings.facebookDashPixel.facebook.Pixel.PurchaseParameters {
  @JSName("content_ids")
  var content_ids_PurchaseParameters: js.Array[String]
  @JSName("content_type")
  var content_type_PurchaseParameters: String
}

object PurchaseParameters {
  @scala.inline
  def apply(
    content_ids: js.Array[String],
    content_type: String,
    currency: String,
    value: Double,
    content_name: String = null,
    num_items: Int | Double = null,
    order_id: String = null
  ): PurchaseParameters = {
    val __obj = js.Dynamic.literal(content_ids = content_ids, content_type = content_type, currency = currency, value = value)
    if (content_name != null) __obj.updateDynamic("content_name")(content_name)
    if (num_items != null) __obj.updateDynamic("num_items")(num_items.asInstanceOf[js.Any])
    if (order_id != null) __obj.updateDynamic("order_id")(order_id)
    __obj.asInstanceOf[PurchaseParameters]
  }
}

