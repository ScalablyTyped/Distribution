package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSheetRequest extends js.Object {
  /** The ID of the sheet to delete. */
  var sheetId: js.UndefOr[Double] = js.undefined
}

object DeleteSheetRequest {
  @scala.inline
  def apply(sheetId: Int | Double = null): DeleteSheetRequest = {
    val __obj = js.Dynamic.literal()
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSheetRequest]
  }
}

