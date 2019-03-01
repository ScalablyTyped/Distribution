package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDeselectedEventArgs extends js.Object {
  /** Returns corresponding column object (JSON).
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the Deselected column index value.
    */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the Deselected column header element.
    */
  var headerCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ColumnDeselectedEventArgs {
  @scala.inline
  def apply(
    column: js.Any = null,
    columnIndex: scala.Int | scala.Double = null,
    headerCell: js.Any = null,
    model: js.Any = null,
    `type`: java.lang.String = null
  ): ColumnDeselectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (headerCell != null) __obj.updateDynamic("headerCell")(headerCell)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnDeselectedEventArgs]
  }
}

