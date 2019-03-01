package typings
package facebookDashPixelLib.facebookNs.PixelNs.DPANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewContentParameters
  extends facebookDashPixelLib.facebookNs.PixelNs.ViewContentParameters {
  @JSName("content_ids")
  var content_ids_ViewContentParameters: js.Array[java.lang.String]
  @JSName("content_type")
  var content_type_ViewContentParameters: java.lang.String
}

object ViewContentParameters {
  @scala.inline
  def apply(
    content_ids: js.Array[java.lang.String],
    content_type: java.lang.String,
    content_category: java.lang.String = null,
    content_name: java.lang.String = null,
    currency: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): ViewContentParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content_ids")(content_ids)
    __obj.updateDynamic("content_type")(content_type)
    if (content_category != null) __obj.updateDynamic("content_category")(content_category)
    if (content_name != null) __obj.updateDynamic("content_name")(content_name)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewContentParameters]
  }
}

