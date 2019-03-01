package typings
package facebookDashPixelLib.facebookNs.PixelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateCheckoutParameters extends js.Object {
  var content_category: js.UndefOr[java.lang.String] = js.undefined
  var content_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var content_name: js.UndefOr[java.lang.String] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var num_items: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object InitiateCheckoutParameters {
  @scala.inline
  def apply(
    content_category: java.lang.String = null,
    content_ids: js.Array[java.lang.String] = null,
    content_name: java.lang.String = null,
    currency: java.lang.String = null,
    num_items: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): InitiateCheckoutParameters = {
    val __obj = js.Dynamic.literal()
    if (content_category != null) __obj.updateDynamic("content_category")(content_category)
    if (content_ids != null) __obj.updateDynamic("content_ids")(content_ids)
    if (content_name != null) __obj.updateDynamic("content_name")(content_name)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (num_items != null) __obj.updateDynamic("num_items")(num_items.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateCheckoutParameters]
  }
}

