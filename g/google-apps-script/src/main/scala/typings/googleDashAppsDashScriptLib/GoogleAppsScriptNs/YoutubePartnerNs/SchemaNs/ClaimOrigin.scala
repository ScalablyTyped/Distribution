package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimOrigin extends js.Object {
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object ClaimOrigin {
  @scala.inline
  def apply(source: java.lang.String = null): ClaimOrigin = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ClaimOrigin]
  }
}

