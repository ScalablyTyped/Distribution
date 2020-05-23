package typings.gapiClientSlides.gapi.client.slides

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
  def apply(columnIndex: js.UndefOr[Double] = js.undefined, rowIndex: js.UndefOr[Double] = js.undefined): TableCellLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellLocation]
  }
}

