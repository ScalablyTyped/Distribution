package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteCompanionSetting extends js.Object {
  var companionsDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var enabledSizes: js.UndefOr[js.Array[Size]] = js.undefined
  var imageOnly: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object SiteCompanionSetting {
  @scala.inline
  def apply(
    companionsDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    enabledSizes: js.Array[Size] = null,
    imageOnly: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null
  ): SiteCompanionSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(companionsDisabled)) __obj.updateDynamic("companionsDisabled")(companionsDisabled)
    if (enabledSizes != null) __obj.updateDynamic("enabledSizes")(enabledSizes)
    if (!js.isUndefined(imageOnly)) __obj.updateDynamic("imageOnly")(imageOnly)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[SiteCompanionSetting]
  }
}

