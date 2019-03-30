package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteContentRangeRequest extends js.Object {
  var range: js.UndefOr[Range] = js.undefined
}

object DeleteContentRangeRequest {
  @scala.inline
  def apply(range: Range = null): DeleteContentRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[DeleteContentRangeRequest]
  }
}

