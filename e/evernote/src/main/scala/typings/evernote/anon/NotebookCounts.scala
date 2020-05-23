package typings.evernote.anon

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotebookCounts extends js.Object {
  var notebookCounts: js.UndefOr[Map[typings.evernote.mod.Types.Guid, Double]] = js.undefined
  var tagCounts: js.UndefOr[Map[typings.evernote.mod.Types.Guid, Double]] = js.undefined
  var trashCount: js.UndefOr[Double] = js.undefined
}

object NotebookCounts {
  @scala.inline
  def apply(
    notebookCounts: Map[typings.evernote.mod.Types.Guid, Double] = null,
    tagCounts: Map[typings.evernote.mod.Types.Guid, Double] = null,
    trashCount: js.UndefOr[Double] = js.undefined
  ): NotebookCounts = {
    val __obj = js.Dynamic.literal()
    if (notebookCounts != null) __obj.updateDynamic("notebookCounts")(notebookCounts.asInstanceOf[js.Any])
    if (tagCounts != null) __obj.updateDynamic("tagCounts")(tagCounts.asInstanceOf[js.Any])
    if (!js.isUndefined(trashCount)) __obj.updateDynamic("trashCount")(trashCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookCounts]
  }
}

