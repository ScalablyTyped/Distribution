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

