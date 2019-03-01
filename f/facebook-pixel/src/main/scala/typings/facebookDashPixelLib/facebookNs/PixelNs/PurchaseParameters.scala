package typings
package facebookDashPixelLib.facebookNs.PixelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseParameters extends js.Object {
  var content_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var content_name: js.UndefOr[java.lang.String] = js.undefined
  var content_type: js.UndefOr[java.lang.String] = js.undefined
  var currency: java.lang.String
  var num_items: js.UndefOr[scala.Double] = js.undefined
  var order_id: js.UndefOr[java.lang.String] = js.undefined
  var value: scala.Double
}

object PurchaseParameters {
  @scala.inline
  def apply(
    currency: java.lang.String,
    value: scala.Double,
    content_ids: js.Array[java.lang.String] = null,
    content_name: java.lang.String = null,
    content_type: java.lang.String = null,
    num_items: scala.Int | scala.Double = null,
    order_id: java.lang.String = null
  ): PurchaseParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("value")(value)
    if (content_ids != null) __obj.updateDynamic("content_ids")(content_ids)
    if (content_name != null) __obj.updateDynamic("content_name")(content_name)
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (num_items != null) __obj.updateDynamic("num_items")(num_items.asInstanceOf[js.Any])
    if (order_id != null) __obj.updateDynamic("order_id")(order_id)
    __obj.asInstanceOf[PurchaseParameters]
  }
}

