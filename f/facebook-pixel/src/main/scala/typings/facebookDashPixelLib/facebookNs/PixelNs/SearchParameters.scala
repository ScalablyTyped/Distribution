package typings
package facebookDashPixelLib.facebookNs.PixelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchParameters extends js.Object {
  var content_category: js.UndefOr[java.lang.String] = js.undefined
  var content_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var search_string: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object SearchParameters {
  @scala.inline
  def apply(
    content_category: java.lang.String = null,
    content_ids: js.Array[java.lang.String] = null,
    currency: java.lang.String = null,
    search_string: java.lang.String = null,
    value: scala.Int | scala.Double = null
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

