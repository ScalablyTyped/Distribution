package typings.fsTreeDiff

import typings.fsTreeDiff.entryMod.BaseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntries[T /* <: BaseEntry */] extends js.Object {
  var entries: js.UndefOr[js.Array[T]] = js.undefined
  var sortAndExpand: js.UndefOr[Boolean] = js.undefined
}

object AnonEntries {
  @scala.inline
  def apply[T /* <: BaseEntry */](entries: js.Array[T] = null, sortAndExpand: js.UndefOr[Boolean] = js.undefined): AnonEntries[T] = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (!js.isUndefined(sortAndExpand)) __obj.updateDynamic("sortAndExpand")(sortAndExpand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntries[T]]
  }
}

