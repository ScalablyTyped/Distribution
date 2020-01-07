package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data about each cell in a row.
  */
@js.native
trait Schema$RowData extends js.Object {
  /**
    * The values in the row, one per column.
    */
  var values: js.UndefOr[js.Array[Schema$CellData]] = js.native
}

object Schema$RowData {
  @scala.inline
  def apply(values: js.Array[Schema$CellData] = null): Schema$RowData = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RowData]
  }
}

