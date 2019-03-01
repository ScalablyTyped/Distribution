package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindByNameOptions extends js.Object {
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var httpCache: js.UndefOr[scala.Boolean] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var removed: js.UndefOr[scala.Boolean] = js.undefined
}

object FindByNameOptions {
  @scala.inline
  def apply(
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    httpCache: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    removed: js.UndefOr[scala.Boolean] = js.undefined
  ): FindByNameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (!js.isUndefined(httpCache)) __obj.updateDynamic("httpCache")(httpCache)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed)
    __obj.asInstanceOf[FindByNameOptions]
  }
}

