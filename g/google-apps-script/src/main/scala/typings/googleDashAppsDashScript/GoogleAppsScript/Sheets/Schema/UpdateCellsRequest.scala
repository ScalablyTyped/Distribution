package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCellsRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
  var rows: js.UndefOr[js.Array[RowData]] = js.undefined
  var start: js.UndefOr[GridCoordinate] = js.undefined
}

object UpdateCellsRequest {
  @scala.inline
  def apply(
    fields: String = null,
    range: GridRange = null,
    rows: js.Array[RowData] = null,
    start: GridCoordinate = null
  ): UpdateCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (range != null) __obj.updateDynamic("range")(range)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[UpdateCellsRequest]
  }
}

