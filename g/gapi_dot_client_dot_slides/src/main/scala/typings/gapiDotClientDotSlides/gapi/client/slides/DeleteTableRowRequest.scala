package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTableRowRequest extends js.Object {
  /**
    * The reference table cell location from which a row will be deleted.
    *
    * The row this cell spans will be deleted. If this is a merged cell, multiple
    * rows will be deleted. If no rows remain in the table after this deletion,
    * the whole table is deleted.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  /** The table to delete rows from. */
  var tableObjectId: js.UndefOr[String] = js.undefined
}

object DeleteTableRowRequest {
  @scala.inline
  def apply(cellLocation: TableCellLocation = null, tableObjectId: String = null): DeleteTableRowRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId)
    __obj.asInstanceOf[DeleteTableRowRequest]
  }
}

