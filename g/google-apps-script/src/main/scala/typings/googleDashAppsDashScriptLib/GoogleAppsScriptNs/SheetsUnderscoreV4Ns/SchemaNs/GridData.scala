package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridData extends js.Object {
  var columnMetadata: js.UndefOr[js.Array[DimensionProperties]] = js.undefined
  var rowData: js.UndefOr[js.Array[RowData]] = js.undefined
  var rowMetadata: js.UndefOr[js.Array[DimensionProperties]] = js.undefined
  var startColumn: js.UndefOr[scala.Double] = js.undefined
  var startRow: js.UndefOr[scala.Double] = js.undefined
}

object GridData {
  @scala.inline
  def apply(
    columnMetadata: js.Array[DimensionProperties] = null,
    rowData: js.Array[RowData] = null,
    rowMetadata: js.Array[DimensionProperties] = null,
    startColumn: scala.Int | scala.Double = null,
    startRow: scala.Int | scala.Double = null
  ): GridData = {
    val __obj = js.Dynamic.literal()
    if (columnMetadata != null) __obj.updateDynamic("columnMetadata")(columnMetadata)
    if (rowData != null) __obj.updateDynamic("rowData")(rowData)
    if (rowMetadata != null) __obj.updateDynamic("rowMetadata")(rowMetadata)
    if (startColumn != null) __obj.updateDynamic("startColumn")(startColumn.asInstanceOf[js.Any])
    if (startRow != null) __obj.updateDynamic("startRow")(startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridData]
  }
}

