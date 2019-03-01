package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellLocation extends js.Object {
  // The 0-based column index.
  var column_index: scala.Double
  // The 0-based row index.
  var row_index: scala.Double
}

object TableCellLocation {
  @scala.inline
  def apply(column_index: scala.Double, row_index: scala.Double): TableCellLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column_index")(column_index)
    __obj.updateDynamic("row_index")(row_index)
    __obj.asInstanceOf[TableCellLocation]
  }
}

