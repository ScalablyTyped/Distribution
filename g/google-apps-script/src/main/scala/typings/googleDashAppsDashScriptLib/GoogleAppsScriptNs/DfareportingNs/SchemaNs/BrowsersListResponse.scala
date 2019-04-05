package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowsersListResponse extends js.Object {
  var browsers: js.UndefOr[js.Array[Browser]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object BrowsersListResponse {
  @scala.inline
  def apply(browsers: js.Array[Browser] = null, kind: java.lang.String = null): BrowsersListResponse = {
    val __obj = js.Dynamic.literal()
    if (browsers != null) __obj.updateDynamic("browsers")(browsers)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[BrowsersListResponse]
  }
}

