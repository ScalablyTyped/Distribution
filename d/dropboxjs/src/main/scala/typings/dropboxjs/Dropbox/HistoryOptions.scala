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
  def apply(httpCache: js.UndefOr[Boolean] = js.undefined, limit: js.UndefOr[Double] = js.undefined): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(httpCache)) __obj.updateDynamic("httpCache")(httpCache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryOptions]
  }
}

