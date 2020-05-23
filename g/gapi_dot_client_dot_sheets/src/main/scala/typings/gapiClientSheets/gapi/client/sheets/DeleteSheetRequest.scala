package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSheetRequest extends js.Object {
  /** The ID of the sheet to delete. */
  var sheetId: js.UndefOr[Double] = js.undefined
}

object DeleteSheetRequest {
  @scala.inline
  def apply(sheetId: js.UndefOr[Double] = js.undefined): DeleteSheetRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSheetRequest]
  }
}

