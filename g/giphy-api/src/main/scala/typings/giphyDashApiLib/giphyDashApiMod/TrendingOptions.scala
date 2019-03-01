package typings
package giphyDashApiLib.giphyDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrendingOptions extends BaseOptions {
  var limit: js.UndefOr[scala.Double] = js.undefined
}

object TrendingOptions {
  @scala.inline
  def apply(
    rating: giphyDashApiLib.Rating,
    fmt: giphyDashApiLib.Format = null,
    limit: scala.Int | scala.Double = null
  ): TrendingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rating")(rating)
    if (fmt != null) __obj.updateDynamic("fmt")(fmt)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrendingOptions]
  }
}

