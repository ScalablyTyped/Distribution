package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates all cells in a range with new data.
  */
@js.native
trait Schema$UpdateCellsRequest extends js.Object {
  /**
    * The fields of CellData that should be updated. At least one field must be
    * specified. The root is the CellData; &#39;row.values.&#39; should not be
    * specified. A single `&quot;*&quot;` can be used as short-hand for listing
    * every field.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The range to write data to.  If the data in rows does not cover the
    * entire requested range, the fields matching those set in fields will be
    * cleared.
    */
  var range: js.UndefOr[Schema$GridRange] = js.native
  /**
    * The data to write.
    */
  var rows: js.UndefOr[js.Array[Schema$RowData]] = js.native
  /**
    * The coordinate to start writing data at. Any number of rows and columns
    * (including a different number of columns per row) may be written.
    */
  var start: js.UndefOr[Schema$GridCoordinate] = js.native
}

object Schema$UpdateCellsRequest {
  @scala.inline
  def apply(
    fields: String = null,
    range: Schema$GridRange = null,
    rows: js.Array[Schema$RowData] = null,
    start: Schema$GridCoordinate = null
  ): Schema$UpdateCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateCellsRequest]
  }
}

