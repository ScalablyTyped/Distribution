package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts an empty row into a table.
  */
@js.native
trait Schema$InsertTableRowRequest extends js.Object {
  /**
    * Whether to insert new row below the reference cell location.  - `True`:
    * insert below the cell. - `False`: insert above the cell.
    */
  var insertBelow: js.UndefOr[Boolean] = js.native
  /**
    * The reference table cell location from which rows will be inserted.  A
    * new row will be inserted above (or below) the row where the reference
    * cell is. If the reference cell is a merged cell, a new row will be
    * inserted above (or below) the merged cell.
    */
  var tableCellLocation: js.UndefOr[Schema$TableCellLocation] = js.native
}

object Schema$InsertTableRowRequest {
  @scala.inline
  def apply(
    insertBelow: js.UndefOr[Boolean] = js.undefined,
    tableCellLocation: Schema$TableCellLocation = null
  ): Schema$InsertTableRowRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertBelow)) __obj.updateDynamic("insertBelow")(insertBelow.asInstanceOf[js.Any])
    if (tableCellLocation != null) __obj.updateDynamic("tableCellLocation")(tableCellLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InsertTableRowRequest]
  }
}

