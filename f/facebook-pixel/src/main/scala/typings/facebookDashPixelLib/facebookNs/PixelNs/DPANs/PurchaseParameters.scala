package typings
package facebookDashPixelLib.facebookNs.PixelNs.DPANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseParameters
  extends facebookDashPixelLib.facebookNs.PixelNs.PurchaseParameters {
  @JSName("content_ids")
  var content_ids_PurchaseParameters: js.Array[java.lang.String]
  @JSName("content_type")
  var content_type_PurchaseParameters: java.lang.String
}

object PurchaseParameters {
  @scala.inline
  def apply(
    content_ids: js.Array[java.lang.String],
    content_type: java.lang.String,
    currency: java.lang.String,
    value: scala.Double,
    content_name: java.lang.String = null,
    num_items: scala.Int | scala.Double = null,
    order_id: java.lang.String = null
  ): PurchaseParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content_ids")(content_ids)
    __obj.updateDynamic("content_type")(content_type)
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("value")(value)
    if (content_name != null) __obj.updateDynamic("content_name")(content_name)
    if (num_items != null) __obj.updateDynamic("num_items")(num_items.asInstanceOf[js.Any])
    if (order_id != null) __obj.updateDynamic("order_id")(order_id)
    __obj.asInstanceOf[PurchaseParameters]
  }
}

