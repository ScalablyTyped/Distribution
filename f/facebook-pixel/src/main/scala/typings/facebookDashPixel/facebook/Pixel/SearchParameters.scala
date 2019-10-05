package typings.facebookDashPixel.facebook.Pixel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchParameters extends js.Object {
  var content_category: js.UndefOr[String] = js.undefined
  var content_ids: js.UndefOr[js.Array[String]] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var search_string: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object SearchParameters {
  @scala.inline
  def apply(
    content_category: String = null,
    content_ids: js.Array[String] = null,
    currency: String = null,
    search_string: String = null,
    value: Int | Double = null
  ): SearchParameters = {
    val __obj = js.Dynamic.literal()
    if (content_category != null) __obj.updateDynamic("content_category")(content_category)
    if (content_ids != null) __obj.updateDynamic("content_ids")(content_ids)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (search_string != null) __obj.updateDynamic("search_string")(search_string)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParameters]
  }
}

