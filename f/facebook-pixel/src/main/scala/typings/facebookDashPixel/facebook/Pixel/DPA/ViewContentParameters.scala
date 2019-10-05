package typings.facebookDashPixel.facebook.Pixel.DPA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewContentParameters
  extends typings.facebookDashPixel.facebook.Pixel.ViewContentParameters {
  @JSName("content_ids")
  var content_ids_ViewContentParameters: js.Array[String]
  @JSName("content_type")
  var content_type_ViewContentParameters: String
}

object ViewContentParameters {
  @scala.inline
  def apply(
    content_ids: js.Array[String],
    content_type: String,
    content_category: String = null,
    content_name: String = null,
    currency: String = null,
    value: Int | Double = null
  ): ViewContentParameters = {
    val __obj = js.Dynamic.literal(content_ids = content_ids, content_type = content_type)
    if (content_category != null) __obj.updateDynamic("content_category")(content_category)
    if (content_name != null) __obj.updateDynamic("content_name")(content_name)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewContentParameters]
  }
}

