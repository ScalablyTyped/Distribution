package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Directory Site Settings
  */
@js.native
trait Schema$DirectorySiteSettings extends js.Object {
  /**
    * Whether this directory site has disabled active view creatives.
    */
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  /**
    * Directory site Ad Manager settings.
    */
  var dfpSettings: js.UndefOr[Schema$DfpSettings] = js.native
  /**
    * Whether this site accepts in-stream video ads.
    */
  var instreamVideoPlacementAccepted: js.UndefOr[Boolean] = js.native
  /**
    * Whether this site accepts interstitial ads.
    */
  var interstitialPlacementAccepted: js.UndefOr[Boolean] = js.native
}

object Schema$DirectorySiteSettings {
  @scala.inline
  def apply(
    activeViewOptOut: js.UndefOr[Boolean] = js.undefined,
    dfpSettings: Schema$DfpSettings = null,
    instreamVideoPlacementAccepted: js.UndefOr[Boolean] = js.undefined,
    interstitialPlacementAccepted: js.UndefOr[Boolean] = js.undefined
  ): Schema$DirectorySiteSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeViewOptOut)) __obj.updateDynamic("activeViewOptOut")(activeViewOptOut.asInstanceOf[js.Any])
    if (dfpSettings != null) __obj.updateDynamic("dfpSettings")(dfpSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(instreamVideoPlacementAccepted)) __obj.updateDynamic("instreamVideoPlacementAccepted")(instreamVideoPlacementAccepted.asInstanceOf[js.Any])
    if (!js.isUndefined(interstitialPlacementAccepted)) __obj.updateDynamic("interstitialPlacementAccepted")(interstitialPlacementAccepted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DirectorySiteSettings]
  }
}

