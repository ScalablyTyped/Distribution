package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmergeCellsRequest extends js.Object {
  var range: js.UndefOr[GridRange] = js.undefined
}

object UnmergeCellsRequest {
  @scala.inline
  def apply(range: GridRange = null): UnmergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[UnmergeCellsRequest]
  }
}

