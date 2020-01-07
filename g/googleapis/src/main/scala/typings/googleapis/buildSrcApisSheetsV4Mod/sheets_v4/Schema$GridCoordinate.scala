package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A coordinate in a sheet. All indexes are zero-based.
  */
@js.native
trait Schema$GridCoordinate extends js.Object {
  /**
    * The column index of the coordinate.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * The row index of the coordinate.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  /**
    * The sheet this coordinate is on.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object Schema$GridCoordinate {
  @scala.inline
  def apply(columnIndex: Int | Double = null, rowIndex: Int | Double = null, sheetId: Int | Double = null): Schema$GridCoordinate = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GridCoordinate]
  }
}

