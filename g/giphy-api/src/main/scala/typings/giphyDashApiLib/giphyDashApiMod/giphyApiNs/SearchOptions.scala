package typings
package giphyDashApiLib.giphyDashApiMod.giphyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions
  extends giphyDashApiLib.giphyDashApiMod.BaseOptions {
  var limit: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var q: java.lang.String
}

object SearchOptions {
  @scala.inline
  def apply(
    q: java.lang.String,
    rating: giphyDashApiLib.Rating,
    fmt: giphyDashApiLib.Format = null,
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("q")(q)
    __obj.updateDynamic("rating")(rating)
    if (fmt != null) __obj.updateDynamic("fmt")(fmt)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

