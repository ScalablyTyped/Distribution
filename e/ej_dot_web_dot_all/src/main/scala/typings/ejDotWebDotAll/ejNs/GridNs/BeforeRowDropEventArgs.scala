package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeRowDropEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the dragged record details
    */
  var draggedRecords: js.UndefOr[js.Any] = js.undefined
  /** Returns the drop details
    */
  var dropDetails: js.UndefOr[js.Any] = js.undefined
  /** Returns the targeted row.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the targeted row index.
    */
  var targetIndex: js.UndefOr[js.Any] = js.undefined
}

object BeforeRowDropEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    draggedRecords: js.Any = null,
    dropDetails: js.Any = null,
    target: js.Any = null,
    targetIndex: js.Any = null
  ): BeforeRowDropEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (draggedRecords != null) __obj.updateDynamic("draggedRecords")(draggedRecords)
    if (dropDetails != null) __obj.updateDynamic("dropDetails")(dropDetails)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetIndex != null) __obj.updateDynamic("targetIndex")(targetIndex)
    __obj.asInstanceOf[BeforeRowDropEventArgs]
  }
}

