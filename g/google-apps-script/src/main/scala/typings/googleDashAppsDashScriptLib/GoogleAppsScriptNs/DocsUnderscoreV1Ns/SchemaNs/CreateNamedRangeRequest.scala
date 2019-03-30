package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNamedRangeRequest extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
}

object CreateNamedRangeRequest {
  @scala.inline
  def apply(name: java.lang.String = null, range: Range = null): CreateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[CreateNamedRangeRequest]
  }
}

