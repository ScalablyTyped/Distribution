package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts cells into a range, shifting the existing cells over or down.
  */
@js.native
trait Schema$InsertRangeRequest extends js.Object {
  /**
    * The range to insert new cells into.
    */
  var range: js.UndefOr[Schema$GridRange] = js.native
  /**
    * The dimension which will be shifted when inserting cells. If ROWS,
    * existing cells will be shifted down. If COLUMNS, existing cells will be
    * shifted right.
    */
  var shiftDimension: js.UndefOr[String] = js.native
}

object Schema$InsertRangeRequest {
  @scala.inline
  def apply(range: Schema$GridRange = null, shiftDimension: String = null): Schema$InsertRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (shiftDimension != null) __obj.updateDynamic("shiftDimension")(shiftDimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InsertRangeRequest]
  }
}

