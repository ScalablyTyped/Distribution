package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellLocation extends js.Object {
  var columnIndex: js.UndefOr[Double] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
  var tableStartLocation: js.UndefOr[Location] = js.undefined
}

object TableCellLocation {
  @scala.inline
  def apply(
    columnIndex: js.UndefOr[Double] = js.undefined,
    rowIndex: js.UndefOr[Double] = js.undefined,
    tableStartLocation: Location = null
  ): TableCellLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (tableStartLocation != null) __obj.updateDynamic("tableStartLocation")(tableStartLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellLocation]
  }
}

