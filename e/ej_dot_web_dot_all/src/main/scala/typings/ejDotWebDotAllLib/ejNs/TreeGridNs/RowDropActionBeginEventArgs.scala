package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDropActionBeginEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the multiple dragged row collection for multiple reorder
    */
  var draggedRecords: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the row which we start to drag.
    */
  var draggedRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index which we start to drag.
    */
  var draggedRowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the drop position.
    */
  var dropPosition: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the TreeGrid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the row which we are dropped to row.
    */
  var targetRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index which we are dropped to row.
    */
  var targetRowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object RowDropActionBeginEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    draggedRecords: js.Array[_] = null,
    draggedRow: js.Any = null,
    draggedRowIndex: scala.Int | scala.Double = null,
    dropPosition: java.lang.String = null,
    model: js.Any = null,
    targetRow: js.Any = null,
    targetRowIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): RowDropActionBeginEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (draggedRecords != null) __obj.updateDynamic("draggedRecords")(draggedRecords)
    if (draggedRow != null) __obj.updateDynamic("draggedRow")(draggedRow)
    if (draggedRowIndex != null) __obj.updateDynamic("draggedRowIndex")(draggedRowIndex.asInstanceOf[js.Any])
    if (dropPosition != null) __obj.updateDynamic("dropPosition")(dropPosition)
    if (model != null) __obj.updateDynamic("model")(model)
    if (targetRow != null) __obj.updateDynamic("targetRow")(targetRow)
    if (targetRowIndex != null) __obj.updateDynamic("targetRowIndex")(targetRowIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowDropActionBeginEventArgs]
  }
}

