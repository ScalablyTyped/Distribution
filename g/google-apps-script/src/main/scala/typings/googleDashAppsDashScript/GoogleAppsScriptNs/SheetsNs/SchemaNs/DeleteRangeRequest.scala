package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRangeRequest extends js.Object {
  var range: js.UndefOr[GridRange] = js.undefined
  var shiftDimension: js.UndefOr[String] = js.undefined
}

object DeleteRangeRequest {
  @scala.inline
  def apply(range: GridRange = null, shiftDimension: String = null): DeleteRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range)
    if (shiftDimension != null) __obj.updateDynamic("shiftDimension")(shiftDimension)
    __obj.asInstanceOf[DeleteRangeRequest]
  }
}

