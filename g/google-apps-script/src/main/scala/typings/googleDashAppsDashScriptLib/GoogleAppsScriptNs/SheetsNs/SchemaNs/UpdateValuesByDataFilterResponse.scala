package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateValuesByDataFilterResponse extends js.Object {
  var dataFilter: js.UndefOr[DataFilter] = js.undefined
  var updatedCells: js.UndefOr[scala.Double] = js.undefined
  var updatedColumns: js.UndefOr[scala.Double] = js.undefined
  var updatedData: js.UndefOr[ValueRange] = js.undefined
  var updatedRange: js.UndefOr[java.lang.String] = js.undefined
  var updatedRows: js.UndefOr[scala.Double] = js.undefined
}

object UpdateValuesByDataFilterResponse {
  @scala.inline
  def apply(
    dataFilter: DataFilter = null,
    updatedCells: scala.Int | scala.Double = null,
    updatedColumns: scala.Int | scala.Double = null,
    updatedData: ValueRange = null,
    updatedRange: java.lang.String = null,
    updatedRows: scala.Int | scala.Double = null
  ): UpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(dataFilter)
    if (updatedCells != null) __obj.updateDynamic("updatedCells")(updatedCells.asInstanceOf[js.Any])
    if (updatedColumns != null) __obj.updateDynamic("updatedColumns")(updatedColumns.asInstanceOf[js.Any])
    if (updatedData != null) __obj.updateDynamic("updatedData")(updatedData)
    if (updatedRange != null) __obj.updateDynamic("updatedRange")(updatedRange)
    if (updatedRows != null) __obj.updateDynamic("updatedRows")(updatedRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateValuesByDataFilterResponse]
  }
}

