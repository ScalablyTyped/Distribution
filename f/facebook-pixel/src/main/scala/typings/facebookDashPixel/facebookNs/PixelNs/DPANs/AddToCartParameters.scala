package typings.facebookDashPixel.facebookNs.PixelNs.DPANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddToCartParameters
  extends typings.facebookDashPixel.facebookNs.PixelNs.AddToCartParameters {
  @JSName("content_ids")
  var content_ids_AddToCartParameters: js.Array[String]
  @JSName("content_type")
  var content_type_AddToCartParameters: String
}

object AddToCartParameters {
  @scala.inline
  def apply(
    content_ids: js.Array[String],
    content_type: String,
    content_name: String = null,
    currency: String = null,
    value: Int | Double = null
  ): AddToCartParameters = {
    val __obj = js.Dynamic.literal(content_ids = content_ids, content_type = content_type)
    if (content_name != null) __obj.updateDynamic("content_name")(content_name)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToCartParameters]
  }
}

