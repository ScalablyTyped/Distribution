package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindByNameOptions extends js.Object {
  var deleted: js.UndefOr[Boolean] = js.undefined
  var httpCache: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var removed: js.UndefOr[Boolean] = js.undefined
}

object FindByNameOptions {
  @scala.inline
  def apply(
    deleted: js.UndefOr[Boolean] = js.undefined,
    httpCache: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    removed: js.UndefOr[Boolean] = js.undefined
  ): FindByNameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (!js.isUndefined(httpCache)) __obj.updateDynamic("httpCache")(httpCache.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindByNameOptions]
  }
}

