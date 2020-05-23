package typings.giphyApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends BaseOptions {
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var q: String
}

object SearchOptions {
  @scala.inline
  def apply(
    q: String,
    rating: Rating,
    fmt: Format = null,
    limit: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined
  ): SearchOptions = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any])
    if (fmt != null) __obj.updateDynamic("fmt")(fmt.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

