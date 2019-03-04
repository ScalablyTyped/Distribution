package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRow extends js.Object {
  // Height of a row.
  var row_height: Dimension
  // Properties and contents of each cell.
  //
  // Cells that span multiple columns are represented only once with a
  // column_span greater than 1. As a result, the length of this
  // collection does not always match the number of columns of the entire table.
  var table_cells: js.Array[TableCell]
  // Properties of the row.
  var table_row_properties: TableRowProperties
}

object TableRow {
  @scala.inline
  def apply(row_height: Dimension, table_cells: js.Array[TableCell], table_row_properties: TableRowProperties): TableRow = {
    val __obj = js.Dynamic.literal(row_height = row_height, table_cells = table_cells, table_row_properties = table_row_properties)
  
    __obj.asInstanceOf[TableRow]
  }
}

