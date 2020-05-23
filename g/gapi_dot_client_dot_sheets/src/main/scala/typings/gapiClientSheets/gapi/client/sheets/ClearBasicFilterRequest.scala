package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearBasicFilterRequest extends js.Object {
  /** The sheet ID on which the basic filter should be cleared. */
  var sheetId: js.UndefOr[Double] = js.undefined
}

object ClearBasicFilterRequest {
  @scala.inline
  def apply(sheetId: js.UndefOr[Double] = js.undefined): ClearBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearBasicFilterRequest]
  }
}

