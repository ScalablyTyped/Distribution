package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridData extends js.Object {
  /**
    * Metadata about the requested columns in the grid, starting with the column
    * in start_column.
    */
  var columnMetadata: js.UndefOr[js.Array[DimensionProperties]] = js.undefined
  /**
    * The data in the grid, one entry per row,
    * starting with the row in startRow.
    * The values in RowData will correspond to columns starting
    * at start_column.
    */
  var rowData: js.UndefOr[js.Array[RowData]] = js.undefined
  /**
    * Metadata about the requested rows in the grid, starting with the row
    * in start_row.
    */
  var rowMetadata: js.UndefOr[js.Array[DimensionProperties]] = js.undefined
  /** The first column this GridData refers to, zero-based. */
  var startColumn: js.UndefOr[Double] = js.undefined
  /** The first row this GridData refers to, zero-based. */
  var startRow: js.UndefOr[Double] = js.undefined
}

object GridData {
  @scala.inline
  def apply(
    columnMetadata: js.Array[DimensionProperties] = null,
    rowData: js.Array[RowData] = null,
    rowMetadata: js.Array[DimensionProperties] = null,
    startColumn: Int | Double = null,
    startRow: Int | Double = null
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

