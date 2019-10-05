package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

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
    if (range != null) __obj.updateDynamic("range")(range)
    if (shiftDimension != null) __obj.updateDynamic("shiftDimension")(shiftDimension)
    __obj.asInstanceOf[InsertRangeRequest]
  }
}

