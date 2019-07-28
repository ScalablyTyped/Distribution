package typings.ejDotWebDotAll.ejNs.GanttNs

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
    if (!js.isUndefined(canDrop)) __obj.updateDynamic("canDrop")(canDrop)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (draggedRow != null) __obj.updateDynamic("draggedRow")(draggedRow)
    if (draggedRowIndex != null) __obj.updateDynamic("draggedRowIndex")(draggedRowIndex.asInstanceOf[js.Any])
    if (dropPosition != null) __obj.updateDynamic("dropPosition")(dropPosition)
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (!js.isUndefined(roundOffDuration)) __obj.updateDynamic("roundOffDuration")(roundOffDuration)
    if (targetRow != null) __obj.updateDynamic("targetRow")(targetRow)
    if (targetRowIndex != null) __obj.updateDynamic("targetRowIndex")(targetRowIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowDragEventArgs]
  }
}

