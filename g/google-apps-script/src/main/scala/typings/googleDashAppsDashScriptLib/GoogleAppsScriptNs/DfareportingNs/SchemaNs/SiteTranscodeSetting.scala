package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteTranscodeSetting extends js.Object {
  var enabledVideoFormats: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object SiteTranscodeSetting {
  @scala.inline
  def apply(enabledVideoFormats: js.Array[scala.Double] = null, kind: java.lang.String = null): SiteTranscodeSetting = {
    val __obj = js.Dynamic.literal()
    if (enabledVideoFormats != null) __obj.updateDynamic("enabledVideoFormats")(enabledVideoFormats)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[SiteTranscodeSetting]
  }
}

