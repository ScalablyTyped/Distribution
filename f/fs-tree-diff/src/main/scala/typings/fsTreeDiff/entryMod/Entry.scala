package typings.fsTreeDiff.entryMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends DefaultEntry

object Entry {
  @scala.inline
  def apply(
    isDirectory: () => Boolean,
    relativePath: String,
    mode: Int | Double = null,
    mtime: Double | Date = null,
    size: Int | Double = null
  ): Entry = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), relativePath = relativePath.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
}

