package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

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
  /**
    * Whether this directory site has disabled Nielsen OCR reach ratings.
    */
  var nielsenOcrOptOut: js.UndefOr[Boolean] = js.native
  /**
    * Whether this directory site has disabled generation of Verification ins
    * tags.
    */
  var verificationTagOptOut: js.UndefOr[Boolean] = js.native
  /**
    * Whether this directory site has disabled active view for in-stream video
    * creatives. This is a read-only field.
    */
  var videoActiveViewOptOut: js.UndefOr[Boolean] = js.native
}

object Schema$DirectorySiteSettings {
  @scala.inline
  def apply(
    activeViewOptOut: js.UndefOr[Boolean] = js.undefined,
    dfpSettings: Schema$DfpSettings = null,
    instreamVideoPlacementAccepted: js.UndefOr[Boolean] = js.undefined,
    interstitialPlacementAccepted: js.UndefOr[Boolean] = js.undefined,
    nielsenOcrOptOut: js.UndefOr[Boolean] = js.undefined,
    verificationTagOptOut: js.UndefOr[Boolean] = js.undefined,
    videoActiveViewOptOut: js.UndefOr[Boolean] = js.undefined
  ): Schema$DirectorySiteSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeViewOptOut)) __obj.updateDynamic("activeViewOptOut")(activeViewOptOut.asInstanceOf[js.Any])
    if (dfpSettings != null) __obj.updateDynamic("dfpSettings")(dfpSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(instreamVideoPlacementAccepted)) __obj.updateDynamic("instreamVideoPlacementAccepted")(instreamVideoPlacementAccepted.asInstanceOf[js.Any])
    if (!js.isUndefined(interstitialPlacementAccepted)) __obj.updateDynamic("interstitialPlacementAccepted")(interstitialPlacementAccepted.asInstanceOf[js.Any])
    if (!js.isUndefined(nielsenOcrOptOut)) __obj.updateDynamic("nielsenOcrOptOut")(nielsenOcrOptOut.asInstanceOf[js.Any])
    if (!js.isUndefined(verificationTagOptOut)) __obj.updateDynamic("verificationTagOptOut")(verificationTagOptOut.asInstanceOf[js.Any])
    if (!js.isUndefined(videoActiveViewOptOut)) __obj.updateDynamic("videoActiveViewOptOut")(videoActiveViewOptOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DirectorySiteSettings]
  }
}

