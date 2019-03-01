package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRange extends js.Object {
  // The column span of the table range.
  var column_span: scala.Double
  // The starting location of the table range.
  var location: TableCellLocation
  // The row span of the table range.
  var row_span: scala.Double
}

object TableRange {
  @scala.inline
  def apply(column_span: scala.Double, location: TableCellLocation, row_span: scala.Double): TableRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column_span")(column_span)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("row_span")(row_span)
    __obj.asInstanceOf[TableRange]
  }
}

