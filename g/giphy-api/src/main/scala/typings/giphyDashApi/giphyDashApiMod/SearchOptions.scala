package typings.giphyDashApi.giphyDashApiMod

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
    limit: Int | Double = null,
    offset: Int | Double = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any])
    if (fmt != null) __obj.updateDynamic("fmt")(fmt.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

