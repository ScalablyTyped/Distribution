package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddProtectedRangeResponse extends js.Object {
  var protectedRange: js.UndefOr[ProtectedRange] = js.undefined
}

object AddProtectedRangeResponse {
  @scala.inline
  def apply(protectedRange: ProtectedRange = null): AddProtectedRangeResponse = {
    val __obj = js.Dynamic.literal()
    if (protectedRange != null) __obj.updateDynamic("protectedRange")(protectedRange)
    __obj.asInstanceOf[AddProtectedRangeResponse]
  }
}

