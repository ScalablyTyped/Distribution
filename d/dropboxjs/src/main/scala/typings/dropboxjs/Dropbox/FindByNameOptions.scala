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
    limit: js.UndefOr[Double] = js.undefined,
    removed: js.UndefOr[Boolean] = js.undefined
  ): FindByNameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(httpCache)) __obj.updateDynamic("httpCache")(httpCache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindByNameOptions]
  }
}

