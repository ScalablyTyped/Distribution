package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryOptions extends js.Object {
  var httpCache: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
}

object HistoryOptions {
  @scala.inline
  def apply(httpCache: js.UndefOr[Boolean] = js.undefined, limit: Int | Double = null): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(httpCache)) __obj.updateDynamic("httpCache")(httpCache)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryOptions]
  }
}

