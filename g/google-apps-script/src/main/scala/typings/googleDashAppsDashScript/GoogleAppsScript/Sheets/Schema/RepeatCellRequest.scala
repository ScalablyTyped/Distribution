package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatCellRequest extends js.Object {
  var cell: js.UndefOr[CellData] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
}

object RepeatCellRequest {
  @scala.inline
  def apply(cell: CellData = null, fields: String = null, range: GridRange = null): RepeatCellRequest = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatCellRequest]
  }
}

