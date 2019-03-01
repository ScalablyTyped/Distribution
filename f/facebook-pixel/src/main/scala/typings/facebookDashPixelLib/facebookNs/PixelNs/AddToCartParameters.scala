package typings
package facebookDashPixelLib.facebookNs.PixelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddToCartParameters extends js.Object {
  var content_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var content_name: js.UndefOr[java.lang.String] = js.undefined
  var content_type: js.UndefOr[java.lang.String] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object AddToCartParameters {
  @scala.inline
  def apply(
    content_ids: js.Array[java.lang.String] = null,
    content_name: java.lang.String = null,
    content_type: java.lang.String = null,
    currency: java.lang.String = null,
    value: scala.Int | scala.Double = null
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

