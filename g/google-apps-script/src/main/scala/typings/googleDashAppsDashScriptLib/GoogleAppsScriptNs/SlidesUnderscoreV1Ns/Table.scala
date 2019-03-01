package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  // Number of columns in the table.
  var columns: scala.Double
  // Properties of horizontal cell borders.
  //
  // A table's horizontal cell borders are represented as a grid. The grid has
  // one more row than the number of rows in the table and the same number of
  // columns as the table. For example, if the table is 3 x 3, its horizontal
  // borders will be represented as a grid with 4 rows and 3 columns.
  var horizontal_border_rows: js.Array[TableBorderRow]
  // Number of rows in the table.
  var rows: scala.Double
  // Properties of each column.
  var table_columns: js.Array[TableColumnProperties]
  // Properties and contents of each row.
  //
  // Cells that span multiple rows are contained in only one of these rows and
  // have a row_span greater than 1.
  var table_rows: js.Array[TableRow]
  // Properties of vertical cell borders.
  //
  // A table's vertical cell borders are represented as a grid. The grid has the
  // same number of rows as the table and one more column than the number of
  // columns in the table. For example, if the table is 3 x 3, its vertical
  // borders will be represented as a grid with 3 rows and 4 columns.
  var vertical_border_rows: js.Array[TableBorderRow]
}

object Table {
  @scala.inline
  def apply(
    columns: scala.Double,
    horizontal_border_rows: js.Array[TableBorderRow],
    rows: scala.Double,
    table_columns: js.Array[TableColumnProperties],
    table_rows: js.Array[TableRow],
    vertical_border_rows: js.Array[TableBorderRow]
  ): Table = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("horizontal_border_rows")(horizontal_border_rows)
    __obj.updateDynamic("rows")(rows)
    __obj.updateDynamic("table_columns")(table_columns)
    __obj.updateDynamic("table_rows")(table_rows)
    __obj.updateDynamic("vertical_border_rows")(vertical_border_rows)
    __obj.asInstanceOf[Table]
  }
}

