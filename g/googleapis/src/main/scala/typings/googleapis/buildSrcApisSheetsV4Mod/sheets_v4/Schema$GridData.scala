package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data in the grid, as well as metadata about the dimensions.
  */
@js.native
trait Schema$GridData extends js.Object {
  /**
    * Metadata about the requested columns in the grid, starting with the
    * column in start_column.
    */
  var columnMetadata: js.UndefOr[js.Array[Schema$DimensionProperties]] = js.native
  /**
    * The data in the grid, one entry per row, starting with the row in
    * startRow. The values in RowData will correspond to columns starting at
    * start_column.
    */
  var rowData: js.UndefOr[js.Array[Schema$RowData]] = js.native
  /**
    * Metadata about the requested rows in the grid, starting with the row in
    * start_row.
    */
  var rowMetadata: js.UndefOr[js.Array[Schema$DimensionProperties]] = js.native
  /**
    * The first column this GridData refers to, zero-based.
    */
  var startColumn: js.UndefOr[Double] = js.native
  /**
    * The first row this GridData refers to, zero-based.
    */
  var startRow: js.UndefOr[Double] = js.native
}

object Schema$GridData {
  @scala.inline
  def apply(
    columnMetadata: js.Array[Schema$DimensionProperties] = null,
    rowData: js.Array[Schema$RowData] = null,
    rowMetadata: js.Array[Schema$DimensionProperties] = null,
    startColumn: Int | Double = null,
    startRow: Int | Double = null
  ): Schema$GridData = {
    val __obj = js.Dynamic.literal()
    if (columnMetadata != null) __obj.updateDynamic("columnMetadata")(columnMetadata.asInstanceOf[js.Any])
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (rowMetadata != null) __obj.updateDynamic("rowMetadata")(rowMetadata.asInstanceOf[js.Any])
    if (startColumn != null) __obj.updateDynamic("startColumn")(startColumn.asInstanceOf[js.Any])
    if (startRow != null) __obj.updateDynamic("startRow")(startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GridData]
  }
}

