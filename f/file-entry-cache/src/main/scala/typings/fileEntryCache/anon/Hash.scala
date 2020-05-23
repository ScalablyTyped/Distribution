package typings.fileEntryCache.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  val hash: js.UndefOr[String] = js.undefined
  val mtime: js.UndefOr[Double] = js.undefined
  val size: js.UndefOr[Double] = js.undefined
}

object Hash {
  @scala.inline
  def apply(
    hash: String = null,
    mtime: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined
  ): Hash = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(mtime)) __obj.updateDynamic("mtime")(mtime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
}

