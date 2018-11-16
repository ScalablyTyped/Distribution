package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

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
  var startColumn: js.UndefOr[scala.Double] = js.undefined
  /** The first row this GridData refers to, zero-based. */
  var startRow: js.UndefOr[scala.Double] = js.undefined
}

