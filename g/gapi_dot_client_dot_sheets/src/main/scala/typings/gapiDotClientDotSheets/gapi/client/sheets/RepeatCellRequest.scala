package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatCellRequest extends js.Object {
  /** The data to write. */
  var cell: js.UndefOr[CellData] = js.undefined
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `cell` is implied and should not be specified.
    * A single `"&#42;"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  /** The range to repeat the cell in. */
  var range: js.UndefOr[GridRange] = js.undefined
}

object RepeatCellRequest {
  @scala.inline
  def apply(cell: CellData = null, fields: String = null, range: GridRange = null): RepeatCellRequest = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[RepeatCellRequest]
  }
}

