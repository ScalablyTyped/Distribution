package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNamedRangeRequest extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var namedRangeId: js.UndefOr[java.lang.String] = js.undefined
}

object DeleteNamedRangeRequest {
  @scala.inline
  def apply(name: java.lang.String = null, namedRangeId: java.lang.String = null): DeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId)
    __obj.asInstanceOf[DeleteNamedRangeRequest]
  }
}

