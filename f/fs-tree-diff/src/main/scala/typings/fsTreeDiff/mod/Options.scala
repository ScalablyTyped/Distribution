package typings.fsTreeDiff.mod

import typings.fsTreeDiff.entryMod.BaseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var entries: js.UndefOr[js.Array[BaseEntry]] = js.undefined
  var sortAndExpand: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(entries: js.Array[BaseEntry] = null, sortAndExpand: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (!js.isUndefined(sortAndExpand)) __obj.updateDynamic("sortAndExpand")(sortAndExpand.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

