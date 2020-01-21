package typings.giphyApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrendingOptions extends BaseOptions {
  var limit: js.UndefOr[Double] = js.undefined
}

object TrendingOptions {
  @scala.inline
  def apply(rating: Rating, fmt: Format = null, limit: Int | Double = null): TrendingOptions = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    if (fmt != null) __obj.updateDynamic("fmt")(fmt.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrendingOptions]
  }
}

