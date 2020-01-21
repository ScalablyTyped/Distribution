package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRangeRequest extends js.Object {
  /** The range of cells to delete. */
  var range: js.UndefOr[GridRange] = js.undefined
  /**
    * The dimension from which deleted cells will be replaced with.
    * If ROWS, existing cells will be shifted upward to
    * replace the deleted cells. If COLUMNS, existing cells
    * will be shifted left to replace the deleted cells.
    */
  var shiftDimension: js.UndefOr[String] = js.undefined
}

object DeleteRangeRequest {
  @scala.inline
  def apply(range: GridRange = null, shiftDimension: String = null): DeleteRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (shiftDimension != null) __obj.updateDynamic("shiftDimension")(shiftDimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRangeRequest]
  }
}

