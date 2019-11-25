package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNamedRangeRequest extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var namedRangeId: js.UndefOr[String] = js.undefined
}

object DeleteNamedRangeRequest {
  @scala.inline
  def apply(name: String = null, namedRangeId: String = null): DeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNamedRangeRequest]
  }
}

