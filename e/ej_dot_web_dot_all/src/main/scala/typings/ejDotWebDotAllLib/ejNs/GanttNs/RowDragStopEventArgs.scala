package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDragStopEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the row which we start to drag.
    */
  var draggedRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index which we start to drag.
    */
  var draggedRowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
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

object RowDragStopEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    draggedRow: js.Any = null,
    draggedRowIndex: scala.Int | scala.Double = null,
    model: js.Any = null,
    requestType: java.lang.String = null,
    targetRow: js.Any = null,
    targetRowIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): RowDragStopEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (draggedRow != null) __obj.updateDynamic("draggedRow")(draggedRow)
    if (draggedRowIndex != null) __obj.updateDynamic("draggedRowIndex")(draggedRowIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (targetRow != null) __obj.updateDynamic("targetRow")(targetRow)
    if (targetRowIndex != null) __obj.updateDynamic("targetRowIndex")(targetRowIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowDragStopEventArgs]
  }
}

