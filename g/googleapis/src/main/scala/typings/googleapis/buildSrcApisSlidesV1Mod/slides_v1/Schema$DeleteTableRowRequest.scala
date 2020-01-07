package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a row from a table.
  */
@js.native
trait Schema$DeleteTableRowRequest extends js.Object {
  /**
    * The reference table cell location from which a row will be deleted.  The
    * row this cell spans will be deleted. If this is a merged cell, multiple
    * rows will be deleted. If no rows remain in the table after this deletion,
    * the whole table is deleted.
    */
  var cellLocation: js.UndefOr[Schema$TableCellLocation] = js.native
  /**
    * The table to delete rows from.
    */
  var tableObjectId: js.UndefOr[String] = js.native
}

object Schema$DeleteTableRowRequest {
  @scala.inline
  def apply(cellLocation: Schema$TableCellLocation = null, tableObjectId: String = null): Schema$DeleteTableRowRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteTableRowRequest]
  }
}

