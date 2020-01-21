package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertRangeRequest extends js.Object {
  var range: js.UndefOr[GridRange] = js.undefined
  var shiftDimension: js.UndefOr[String] = js.undefined
}

object InsertRangeRequest {
  @scala.inline
  def apply(range: GridRange = null, shiftDimension: String = null): InsertRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (shiftDimension != null) __obj.updateDynamic("shiftDimension")(shiftDimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertRangeRequest]
  }
}

