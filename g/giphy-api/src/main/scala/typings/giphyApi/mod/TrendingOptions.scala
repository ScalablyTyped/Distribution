package typings.giphyApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrendingOptions extends BaseOptions {
  var limit: js.UndefOr[Double] = js.undefined
}

object TrendingOptions {
  @scala.inline
  def apply(rating: Rating, fmt: Format = null, limit: js.UndefOr[Double] = js.undefined): TrendingOptions = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    if (fmt != null) __obj.updateDynamic("fmt")(fmt.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrendingOptions]
  }
}

