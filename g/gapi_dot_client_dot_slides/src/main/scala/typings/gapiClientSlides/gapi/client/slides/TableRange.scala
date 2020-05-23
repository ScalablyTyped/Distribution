package typings.gapiClientSlides.gapi.client.slides

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
  def apply(
    columnSpan: js.UndefOr[Double] = js.undefined,
    location: TableCellLocation = null,
    rowSpan: js.UndefOr[Double] = js.undefined
  ): TableRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnSpan)) __obj.updateDynamic("columnSpan")(columnSpan.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRange]
  }
}

