package typings
package facebookDashPixelLib.facebookNs.PixelNs.DPANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddToCartParameters
  extends facebookDashPixelLib.facebookNs.PixelNs.AddToCartParameters {
  @JSName("content_ids")
  var content_ids_AddToCartParameters: js.Array[java.lang.String]
  @JSName("content_type")
  var content_type_AddToCartParameters: java.lang.String
}

object AddToCartParameters {
  @scala.inline
  def apply(
    content_ids: js.Array[java.lang.String],
    content_type: java.lang.String,
    content_name: java.lang.String = null,
    currency: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): AddToCartParameters = {
    val __obj = js.Dynamic.literal(content_ids = content_ids, content_type = content_type)
    if (content_name != null) __obj.updateDynamic("content_name")(content_name)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToCartParameters]
  }
}

