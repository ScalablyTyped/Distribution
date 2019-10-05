package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

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
    columnIndex: Int | Double = null,
    rowIndex: Int | Double = null,
    tableStartLocation: Location = null
  ): TableCellLocation = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (tableStartLocation != null) __obj.updateDynamic("tableStartLocation")(tableStartLocation)
    __obj.asInstanceOf[TableCellLocation]
  }
}

