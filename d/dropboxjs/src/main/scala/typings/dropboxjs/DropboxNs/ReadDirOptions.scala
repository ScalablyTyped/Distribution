package typings.dropboxjs.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadDirOptions extends js.Object {
  var contentHash: js.UndefOr[String] = js.undefined
  var deleted: js.UndefOr[Boolean] = js.undefined
  var httpCache: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[js.Any] = js.undefined
  var removed: js.UndefOr[Boolean] = js.undefined
  var versionTag: js.UndefOr[String] = js.undefined
}

object ReadDirOptions {
  @scala.inline
  def apply(
    contentHash: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    httpCache: js.UndefOr[Boolean] = js.undefined,
    limit: js.Any = null,
    removed: js.UndefOr[Boolean] = js.undefined,
    versionTag: String = null
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

