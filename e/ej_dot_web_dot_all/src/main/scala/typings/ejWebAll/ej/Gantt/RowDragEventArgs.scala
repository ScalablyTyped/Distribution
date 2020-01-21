package typings.ejWebAll.ej.Gantt

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
  /** Returns the drop position value on current target row.
    */
  var dropPosition: js.UndefOr[String] = js.undefined
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Duration is rounded off when it is set true.
    */
  var roundOffDuration: js.UndefOr[Boolean] = js.undefined
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
    draggedRowIndex: Int | Double = null,
    dropPosition: String = null,
    model: js.Any = null,
    requestType: String = null,
    roundOffDuration: js.UndefOr[Boolean] = js.undefined,
    targetRow: js.Any = null,
    targetRowIndex: Int | Double = null,
    `type`: String = null
  ): RowDragEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canDrop)) __obj.updateDynamic("canDrop")(canDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (draggedRow != null) __obj.updateDynamic("draggedRow")(draggedRow.asInstanceOf[js.Any])
    if (draggedRowIndex != null) __obj.updateDynamic("draggedRowIndex")(draggedRowIndex.asInstanceOf[js.Any])
    if (dropPosition != null) __obj.updateDynamic("dropPosition")(dropPosition.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (!js.isUndefined(roundOffDuration)) __obj.updateDynamic("roundOffDuration")(roundOffDuration.asInstanceOf[js.Any])
    if (targetRow != null) __obj.updateDynamic("targetRow")(targetRow.asInstanceOf[js.Any])
    if (targetRowIndex != null) __obj.updateDynamic("targetRowIndex")(targetRowIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDragEventArgs]
  }
}

