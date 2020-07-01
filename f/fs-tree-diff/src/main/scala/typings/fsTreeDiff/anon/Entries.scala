package typings.fsTreeDiff.anon

import typings.fsTreeDiff.entryMod.BaseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entries[T /* <: BaseEntry */] extends js.Object {
  var entries: js.UndefOr[js.Array[T]] = js.undefined
  var sortAndExpand: js.UndefOr[Boolean] = js.undefined
}

object Entries {
  @scala.inline
  def apply[/* <: typings.fsTreeDiff.entryMod.BaseEntry */ T](entries: js.Array[T] = null, sortAndExpand: js.UndefOr[Boolean] = js.undefined): Entries[T] = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (!js.isUndefined(sortAndExpand)) __obj.updateDynamic("sortAndExpand")(sortAndExpand.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries[T]]
  }
}

