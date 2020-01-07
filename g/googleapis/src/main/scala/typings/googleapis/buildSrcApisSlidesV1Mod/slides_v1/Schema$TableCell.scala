package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties and contents of each table cell.
  */
@js.native
trait Schema$TableCell extends js.Object {
  /**
    * Column span of the cell.
    */
  var columnSpan: js.UndefOr[Double] = js.native
  /**
    * The location of the cell within the table.
    */
  var location: js.UndefOr[Schema$TableCellLocation] = js.native
  /**
    * Row span of the cell.
    */
  var rowSpan: js.UndefOr[Double] = js.native
  /**
    * The properties of the table cell.
    */
  var tableCellProperties: js.UndefOr[Schema$TableCellProperties] = js.native
  /**
    * The text content of the cell.
    */
  var text: js.UndefOr[Schema$TextContent] = js.native
}

object Schema$TableCell {
  @scala.inline
  def apply(
    columnSpan: Int | Double = null,
    location: Schema$TableCellLocation = null,
    rowSpan: Int | Double = null,
    tableCellProperties: Schema$TableCellProperties = null,
    text: Schema$TextContent = null
  ): Schema$TableCell = {
    val __obj = js.Dynamic.literal()
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (tableCellProperties != null) __obj.updateDynamic("tableCellProperties")(tableCellProperties.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableCell]
  }
}

