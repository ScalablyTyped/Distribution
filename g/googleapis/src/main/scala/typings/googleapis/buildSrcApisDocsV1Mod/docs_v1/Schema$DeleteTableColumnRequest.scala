package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a column from a table.
  */
@js.native
trait Schema$DeleteTableColumnRequest extends js.Object {
  /**
    * The reference table cell location from which the column will be deleted.
    * The column this cell spans will be deleted. If this is a merged cell that
    * spans multiple columns, all columns that the cell spans will be deleted.
    * If no columns remain in the table after this deletion, the whole table is
    * deleted.
    */
  var tableCellLocation: js.UndefOr[Schema$TableCellLocation] = js.native
}

object Schema$DeleteTableColumnRequest {
  @scala.inline
  def apply(tableCellLocation: Schema$TableCellLocation = null): Schema$DeleteTableColumnRequest = {
    val __obj = js.Dynamic.literal()
    if (tableCellLocation != null) __obj.updateDynamic("tableCellLocation")(tableCellLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteTableColumnRequest]
  }
}

