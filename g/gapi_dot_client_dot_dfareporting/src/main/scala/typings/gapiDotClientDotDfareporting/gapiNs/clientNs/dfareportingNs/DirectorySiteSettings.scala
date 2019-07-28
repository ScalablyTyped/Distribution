package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySiteSettings extends js.Object {
  /** Whether this directory site has disabled active view creatives. */
  var activeViewOptOut: js.UndefOr[Boolean] = js.undefined
  /** Directory site DFP settings. */
  var dfpSettings: js.UndefOr[DfpSettings] = js.undefined
  /** Whether this site accepts in-stream video ads. */
  var instreamVideoPlacementAccepted: js.UndefOr[Boolean] = js.undefined
  /** Whether this site accepts interstitial ads. */
  var interstitialPlacementAccepted: js.UndefOr[Boolean] = js.undefined
  /** Whether this directory site has disabled Nielsen OCR reach ratings. */
  var nielsenOcrOptOut: js.UndefOr[Boolean] = js.undefined
  /** Whether this directory site has disabled generation of Verification ins tags. */
  var verificationTagOptOut: js.UndefOr[Boolean] = js.undefined
  /** Whether this directory site has disabled active view for in-stream video creatives. This is a read-only field. */
  var videoActiveViewOptOut: js.UndefOr[Boolean] = js.undefined
}

object DirectorySiteSettings {
  @scala.inline
  def apply(
    activeViewOptOut: js.UndefOr[Boolean] = js.undefined,
    dfpSettings: DfpSettings = null,
    instreamVideoPlacementAccepted: js.UndefOr[Boolean] = js.undefined,
    interstitialPlacementAccepted: js.UndefOr[Boolean] = js.undefined,
    nielsenOcrOptOut: js.UndefOr[Boolean] = js.undefined,
    verificationTagOptOut: js.UndefOr[Boolean] = js.undefined,
    videoActiveViewOptOut: js.UndefOr[Boolean] = js.undefined
  ): DirectorySiteSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeViewOptOut)) __obj.updateDynamic("activeViewOptOut")(activeViewOptOut)
    if (dfpSettings != null) __obj.updateDynamic("dfpSettings")(dfpSettings)
    if (!js.isUndefined(instreamVideoPlacementAccepted)) __obj.updateDynamic("instreamVideoPlacementAccepted")(instreamVideoPlacementAccepted)
    if (!js.isUndefined(interstitialPlacementAccepted)) __obj.updateDynamic("interstitialPlacementAccepted")(interstitialPlacementAccepted)
    if (!js.isUndefined(nielsenOcrOptOut)) __obj.updateDynamic("nielsenOcrOptOut")(nielsenOcrOptOut)
    if (!js.isUndefined(verificationTagOptOut)) __obj.updateDynamic("verificationTagOptOut")(verificationTagOptOut)
    if (!js.isUndefined(videoActiveViewOptOut)) __obj.updateDynamic("videoActiveViewOptOut")(videoActiveViewOptOut)
    __obj.asInstanceOf[DirectorySiteSettings]
  }
}

