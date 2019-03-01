package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadDirOptions extends js.Object {
  var contentHash: js.UndefOr[java.lang.String] = js.undefined
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var httpCache: js.UndefOr[scala.Boolean] = js.undefined
  var limit: js.UndefOr[js.Any] = js.undefined
  var removed: js.UndefOr[scala.Boolean] = js.undefined
  var versionTag: js.UndefOr[java.lang.String] = js.undefined
}

object ReadDirOptions {
  @scala.inline
  def apply(
    contentHash: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    httpCache: js.UndefOr[scala.Boolean] = js.undefined,
    limit: js.Any = null,
    removed: js.UndefOr[scala.Boolean] = js.undefined,
    versionTag: java.lang.String = null
  ): ReadDirOptions = {
    val __obj = js.Dynamic.literal()
    if (contentHash != null) __obj.updateDynamic("contentHash")(contentHash)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (!js.isUndefined(httpCache)) __obj.updateDynamic("httpCache")(httpCache)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed)
    if (versionTag != null) __obj.updateDynamic("versionTag")(versionTag)
    __obj.asInstanceOf[ReadDirOptions]
  }
}

