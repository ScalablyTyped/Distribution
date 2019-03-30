package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySiteSettings extends js.Object {
  var activeViewOptOut: js.UndefOr[scala.Boolean] = js.undefined
  var dfpSettings: js.UndefOr[DfpSettings] = js.undefined
  var instreamVideoPlacementAccepted: js.UndefOr[scala.Boolean] = js.undefined
  var interstitialPlacementAccepted: js.UndefOr[scala.Boolean] = js.undefined
}

object DirectorySiteSettings {
  @scala.inline
  def apply(
    activeViewOptOut: js.UndefOr[scala.Boolean] = js.undefined,
    dfpSettings: DfpSettings = null,
    instreamVideoPlacementAccepted: js.UndefOr[scala.Boolean] = js.undefined,
    interstitialPlacementAccepted: js.UndefOr[scala.Boolean] = js.undefined
  ): DirectorySiteSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeViewOptOut)) __obj.updateDynamic("activeViewOptOut")(activeViewOptOut)
    if (dfpSettings != null) __obj.updateDynamic("dfpSettings")(dfpSettings)
    if (!js.isUndefined(instreamVideoPlacementAccepted)) __obj.updateDynamic("instreamVideoPlacementAccepted")(instreamVideoPlacementAccepted)
    if (!js.isUndefined(interstitialPlacementAccepted)) __obj.updateDynamic("interstitialPlacementAccepted")(interstitialPlacementAccepted)
    __obj.asInstanceOf[DirectorySiteSettings]
  }
}

