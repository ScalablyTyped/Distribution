package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait InsertRangeRequest extends js.Object {
  /** The range to insert new cells into. */
  var range: js.UndefOr[GridRange] = js.undefined
  /**
    * The dimension which will be shifted when inserting cells.
    * If ROWS, existing cells will be shifted down.
    * If COLUMNS, existing cells will be shifted right.
    */
  var shiftDimension: js.UndefOr[String] = js.undefined
}

object InsertRangeRequest {
  @scala.inline
  def apply(range: GridRange = null, shiftDimension: String = null): InsertRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (shiftDimension != null) __obj.updateDynamic("shiftDimension")(shiftDimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertRangeRequest]
  }
}

