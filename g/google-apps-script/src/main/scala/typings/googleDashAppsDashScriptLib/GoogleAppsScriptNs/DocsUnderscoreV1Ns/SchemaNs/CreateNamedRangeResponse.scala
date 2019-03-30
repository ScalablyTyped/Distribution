package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNamedRangeResponse extends js.Object {
  var namedRangeId: js.UndefOr[java.lang.String] = js.undefined
}

object CreateNamedRangeResponse {
  @scala.inline
  def apply(namedRangeId: java.lang.String = null): CreateNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId)
    __obj.asInstanceOf[CreateNamedRangeResponse]
  }
}

