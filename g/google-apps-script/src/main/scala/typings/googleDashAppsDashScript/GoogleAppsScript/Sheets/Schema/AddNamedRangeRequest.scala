package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddNamedRangeRequest extends js.Object {
  var namedRange: js.UndefOr[NamedRange] = js.undefined
}

object AddNamedRangeRequest {
  @scala.inline
  def apply(namedRange: NamedRange = null): AddNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (namedRange != null) __obj.updateDynamic("namedRange")(namedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddNamedRangeRequest]
  }
}

