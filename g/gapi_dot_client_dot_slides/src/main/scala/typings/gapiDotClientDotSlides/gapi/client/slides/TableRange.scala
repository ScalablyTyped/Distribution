package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRange extends js.Object {
  /** The column span of the table range. */
  var columnSpan: js.UndefOr[Double] = js.undefined
  /** The starting location of the table range. */
  var location: js.UndefOr[TableCellLocation] = js.undefined
  /** The row span of the table range. */
  var rowSpan: js.UndefOr[Double] = js.undefined
}

object TableRange {
  @scala.inline
  def apply(columnSpan: Int | Double = null, location: TableCellLocation = null, rowSpan: Int | Double = null): TableRange = {
    val __obj = js.Dynamic.literal()
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRange]
  }
}

