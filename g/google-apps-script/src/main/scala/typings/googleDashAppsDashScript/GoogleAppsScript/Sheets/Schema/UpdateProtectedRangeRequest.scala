package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProtectedRangeRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var protectedRange: js.UndefOr[ProtectedRange] = js.undefined
}

object UpdateProtectedRangeRequest {
  @scala.inline
  def apply(fields: String = null, protectedRange: ProtectedRange = null): UpdateProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (protectedRange != null) __obj.updateDynamic("protectedRange")(protectedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProtectedRangeRequest]
  }
}

