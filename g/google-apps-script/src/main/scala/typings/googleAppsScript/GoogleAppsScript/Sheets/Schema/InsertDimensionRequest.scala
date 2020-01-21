package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertDimensionRequest extends js.Object {
  var inheritFromBefore: js.UndefOr[Boolean] = js.undefined
  var range: js.UndefOr[DimensionRange] = js.undefined
}

object InsertDimensionRequest {
  @scala.inline
  def apply(inheritFromBefore: js.UndefOr[Boolean] = js.undefined, range: DimensionRange = null): InsertDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inheritFromBefore)) __obj.updateDynamic("inheritFromBefore")(inheritFromBefore.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertDimensionRequest]
  }
}

