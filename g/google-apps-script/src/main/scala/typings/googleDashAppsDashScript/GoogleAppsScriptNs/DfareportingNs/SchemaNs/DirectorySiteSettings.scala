package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySiteSettings extends js.Object {
  var activeViewOptOut: js.UndefOr[Boolean] = js.undefined
  var dfpSettings: js.UndefOr[DfpSettings] = js.undefined
  var instreamVideoPlacementAccepted: js.UndefOr[Boolean] = js.undefined
  var interstitialPlacementAccepted: js.UndefOr[Boolean] = js.undefined
}

object DirectorySiteSettings {
  @scala.inline
  def apply(
    activeViewOptOut: js.UndefOr[Boolean] = js.undefined,
    dfpSettings: DfpSettings = null,
    instreamVideoPlacementAccepted: js.UndefOr[Boolean] = js.undefined,
    interstitialPlacementAccepted: js.UndefOr[Boolean] = js.undefined
  ): DirectorySiteSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeViewOptOut)) __obj.updateDynamic("activeViewOptOut")(activeViewOptOut)
    if (dfpSettings != null) __obj.updateDynamic("dfpSettings")(dfpSettings)
    if (!js.isUndefined(instreamVideoPlacementAccepted)) __obj.updateDynamic("instreamVideoPlacementAccepted")(instreamVideoPlacementAccepted)
    if (!js.isUndefined(interstitialPlacementAccepted)) __obj.updateDynamic("interstitialPlacementAccepted")(interstitialPlacementAccepted)
    __obj.asInstanceOf[DirectorySiteSettings]
  }
}

