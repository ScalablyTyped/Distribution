package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDragEventArgs extends js.Object {
  /** Returns that we can drop over that record or not.
    */
  var canDrop: js.UndefOr[Boolean] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the row which we start to drag.
    */
  var draggedRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index which we start to drag.
    */
  var draggedRowIndex: js.UndefOr[Double] = js.undefined
  /** Returns the drop position details such as insertAbove,insertBelow,insertAsChild and invalidPosition
    */
  var dropPosition: js.UndefOr[String] = js.undefined
  /** Returns the TreeGrid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the row on which we are dragging.
    */
  var targetRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index on which we are dragging.
    */
  var targetRowIndex: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object RowDragEventArgs {
  @scala.inline
  def apply(
    canDrop: js.UndefOr[Boolean] = js.undefined,
    cancel: js.UndefOr[Boolean] = js.undefined,
    draggedRow: js.Any = null,
    draggedRowIndex: js.UndefOr[Double] = js.undefined,
    dropPosition: String = null,
    model: js.Any = null,
    requestType: String = null,
    targetRow: js.Any = null,
    targetRowIndex: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): RowDragEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canDrop)) __obj.updateDynamic("canDrop")(canDrop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (draggedRow != null) __obj.updateDynamic("draggedRow")(draggedRow.asInstanceOf[js.Any])
    if (!js.isUndefined(draggedRowIndex)) __obj.updateDynamic("draggedRowIndex")(draggedRowIndex.get.asInstanceOf[js.Any])
    if (dropPosition != null) __obj.updateDynamic("dropPosition")(dropPosition.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (targetRow != null) __obj.updateDynamic("targetRow")(targetRow.asInstanceOf[js.Any])
    if (!js.isUndefined(targetRowIndex)) __obj.updateDynamic("targetRowIndex")(targetRowIndex.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDragEventArgs]
  }
}

