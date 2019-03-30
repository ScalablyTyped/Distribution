package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNamedRangeRequest extends js.Object {
  var namedRangeId: js.UndefOr[java.lang.String] = js.undefined
}

object DeleteNamedRangeRequest {
  @scala.inline
  def apply(namedRangeId: java.lang.String = null): DeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId)
    __obj.asInstanceOf[DeleteNamedRangeRequest]
  }
}

