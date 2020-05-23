package typings.dropboxjs.Dropbox

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
    if (contentHash != null) __obj.updateDynamic("contentHash")(contentHash.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(httpCache)) __obj.updateDynamic("httpCache")(httpCache.get.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed.get.asInstanceOf[js.Any])
    if (versionTag != null) __obj.updateDynamic("versionTag")(versionTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadDirOptions]
  }
}

