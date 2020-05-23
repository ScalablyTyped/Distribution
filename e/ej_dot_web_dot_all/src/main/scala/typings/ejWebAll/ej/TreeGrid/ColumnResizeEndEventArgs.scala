package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizeEndEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the column data in which the resizing started
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the column index in which the resizing started
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /** Returns the column width difference, before and after the resizing
    */
  var extra: js.UndefOr[Double] = js.undefined
  /** Returns the control model values.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the new column width after resized
    */
  var newWidth: js.UndefOr[Double] = js.undefined
  /** Returns column width before dragging
    */
  var oldWidth: js.UndefOr[Double] = js.undefined
  /** Returns initial column element object.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the event Type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ColumnResizeEndEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    column: js.Any = null,
    columnIndex: js.UndefOr[Double] = js.undefined,
    extra: js.UndefOr[Double] = js.undefined,
    model: js.Any = null,
    newWidth: js.UndefOr[Double] = js.undefined,
    oldWidth: js.UndefOr[Double] = js.undefined,
    target: js.Any = null,
    `type`: String = null
  ): ColumnResizeEndEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(extra)) __obj.updateDynamic("extra")(extra.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(newWidth)) __obj.updateDynamic("newWidth")(newWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oldWidth)) __obj.updateDynamic("oldWidth")(oldWidth.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnResizeEndEventArgs]
  }
}

