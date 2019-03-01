package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCell extends js.Object {
  // Column span of the cell.
  var column_span: scala.Double
  // The location of the cell within the table.
  var location: TableCellLocation
  // Row span of the cell.
  var row_span: scala.Double
  // The properties of the table cell.
  var table_cell_properties: TableCellProperties
  // The text content of the cell.
  var text: TextContent
}

object TableCell {
  @scala.inline
  def apply(
    column_span: scala.Double,
    location: TableCellLocation,
    row_span: scala.Double,
    table_cell_properties: TableCellProperties,
    text: TextContent
  ): TableCell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column_span")(column_span)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("row_span")(row_span)
    __obj.updateDynamic("table_cell_properties")(table_cell_properties)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TableCell]
  }
}

