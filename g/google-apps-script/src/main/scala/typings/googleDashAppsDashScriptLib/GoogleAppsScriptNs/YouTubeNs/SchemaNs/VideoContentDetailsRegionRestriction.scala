package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoContentDetailsRegionRestriction extends js.Object {
  var allowed: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var blocked: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object VideoContentDetailsRegionRestriction {
  @scala.inline
  def apply(allowed: js.Array[java.lang.String] = null, blocked: js.Array[java.lang.String] = null): VideoContentDetailsRegionRestriction = {
    val __obj = js.Dynamic.literal()
    if (allowed != null) __obj.updateDynamic("allowed")(allowed)
    if (blocked != null) __obj.updateDynamic("blocked")(blocked)
    __obj.asInstanceOf[VideoContentDetailsRegionRestriction]
  }
}

