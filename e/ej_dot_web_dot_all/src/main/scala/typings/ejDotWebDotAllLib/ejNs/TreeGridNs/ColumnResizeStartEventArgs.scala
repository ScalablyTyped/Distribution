package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizeStartEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the column data in which the resizing started
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the column index in which the resizing started
    */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the control model values.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns column width before dragging
    */
  var oldWidth: js.UndefOr[scala.Double] = js.undefined
  /** Returns initial column element object.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the event Type.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ColumnResizeStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    column: js.Any = null,
    columnIndex: scala.Int | scala.Double = null,
    model: js.Any = null,
    oldWidth: scala.Int | scala.Double = null,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): ColumnResizeStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (column != null) __obj.updateDynamic("column")(column)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (oldWidth != null) __obj.updateDynamic("oldWidth")(oldWidth.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnResizeStartEventArgs]
  }
}

