package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellLocation extends js.Object {
  /** The 0-based column index. */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /** The 0-based row index. */
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object TableCellLocation {
  @scala.inline
  def apply(columnIndex: Int | Double = null, rowIndex: Int | Double = null): TableCellLocation = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellLocation]
  }
}

