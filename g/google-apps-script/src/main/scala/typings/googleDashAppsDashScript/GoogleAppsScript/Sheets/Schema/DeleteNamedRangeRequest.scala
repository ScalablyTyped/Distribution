package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNamedRangeRequest extends js.Object {
  var namedRangeId: js.UndefOr[String] = js.undefined
}

object DeleteNamedRangeRequest {
  @scala.inline
  def apply(namedRangeId: String = null): DeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId)
    __obj.asInstanceOf[DeleteNamedRangeRequest]
  }
}

