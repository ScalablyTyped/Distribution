package typings.ejDotWebDotAll.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the column data which is resized
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the index of the column being resized.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /** Returns the control model values.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns resized column width after resized.
    */
  var newWidth: js.UndefOr[Double] = js.undefined
  /** Returns resized column width before resizing
    */
  var oldWidth: js.UndefOr[Double] = js.undefined
  /** Returns the event Type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ColumnResizedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    column: js.Any = null,
    columnIndex: Int | Double = null,
    model: js.Any = null,
    newWidth: Int | Double = null,
    oldWidth: Int | Double = null,
    `type`: String = null
  ): ColumnResizedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (column != null) __obj.updateDynamic("column")(column)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (newWidth != null) __obj.updateDynamic("newWidth")(newWidth.asInstanceOf[js.Any])
    if (oldWidth != null) __obj.updateDynamic("oldWidth")(oldWidth.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnResizedEventArgs]
  }
}

