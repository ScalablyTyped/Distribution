package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes the requested sheet.
  */
@js.native
trait Schema$DeleteSheetRequest extends js.Object {
  /**
    * The ID of the sheet to delete.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object Schema$DeleteSheetRequest {
  @scala.inline
  def apply(sheetId: Int | Double = null): Schema$DeleteSheetRequest = {
    val __obj = js.Dynamic.literal()
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteSheetRequest]
  }
}

