package typings.fsTreeDiff.entryMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultEntry extends BaseEntry {
  var mode: js.UndefOr[Double] = js.undefined
  var mtime: js.UndefOr[Double | Date] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object DefaultEntry {
  @scala.inline
  def apply(
    isDirectory: () => Boolean,
    relativePath: String,
    mode: js.UndefOr[Double] = js.undefined,
    mtime: Double | Date = null,
    size: js.UndefOr[Double] = js.undefined
  ): DefaultEntry = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), relativePath = relativePath.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultEntry]
  }
}

