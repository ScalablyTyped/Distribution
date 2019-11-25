package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNamedRangeResponse extends js.Object {
  var namedRangeId: js.UndefOr[String] = js.undefined
}

object CreateNamedRangeResponse {
  @scala.inline
  def apply(namedRangeId: String = null): CreateNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNamedRangeResponse]
  }
}

