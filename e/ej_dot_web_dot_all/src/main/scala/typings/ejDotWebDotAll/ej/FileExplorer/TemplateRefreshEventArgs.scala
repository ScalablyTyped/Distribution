package typings.ejDotWebDotAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateRefreshEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the cell object.
    */
  var cell: js.UndefOr[Model] = js.undefined
  /** Returns the column object.
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the current row data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model of FileExplorer.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the current row index.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TemplateRefreshEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cell: Model = null,
    column: js.Any = null,
    data: js.Any = null,
    model: js.Any = null,
    rowIndex: Int | Double = null,
    `type`: String = null
  ): TemplateRefreshEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateRefreshEventArgs]
  }
}

