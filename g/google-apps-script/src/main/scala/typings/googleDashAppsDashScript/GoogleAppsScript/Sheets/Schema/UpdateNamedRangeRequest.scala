package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateNamedRangeRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var namedRange: js.UndefOr[NamedRange] = js.undefined
}

object UpdateNamedRangeRequest {
  @scala.inline
  def apply(fields: String = null, namedRange: NamedRange = null): UpdateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (namedRange != null) __obj.updateDynamic("namedRange")(namedRange)
    __obj.asInstanceOf[UpdateNamedRangeRequest]
  }
}

