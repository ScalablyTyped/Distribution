package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCell extends js.Object {
  /** Column span of the cell. */
  var columnSpan: js.UndefOr[Double] = js.undefined
  /** The location of the cell within the table. */
  var location: js.UndefOr[TableCellLocation] = js.undefined
  /** Row span of the cell. */
  var rowSpan: js.UndefOr[Double] = js.undefined
  /** The properties of the table cell. */
  var tableCellProperties: js.UndefOr[TableCellProperties] = js.undefined
  /** The text content of the cell. */
  var text: js.UndefOr[TextContent] = js.undefined
}

object TableCell {
  @scala.inline
  def apply(
    columnSpan: Int | Double = null,
    location: TableCellLocation = null,
    rowSpan: Int | Double = null,
    tableCellProperties: TableCellProperties = null,
    text: TextContent = null
  ): TableCell = {
    val __obj = js.Dynamic.literal()
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (tableCellProperties != null) __obj.updateDynamic("tableCellProperties")(tableCellProperties.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCell]
  }
}

