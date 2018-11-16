package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DirectorySiteSettings extends js.Object {
  /** Whether this directory site has disabled active view creatives. */
  var activeViewOptOut: js.UndefOr[scala.Boolean] = js.undefined
  /** Directory site DFP settings. */
  var dfpSettings: js.UndefOr[DfpSettings] = js.undefined
  /** Whether this site accepts in-stream video ads. */
  var instreamVideoPlacementAccepted: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this site accepts interstitial ads. */
  var interstitialPlacementAccepted: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this directory site has disabled Nielsen OCR reach ratings. */
  var nielsenOcrOptOut: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this directory site has disabled generation of Verification ins tags. */
  var verificationTagOptOut: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this directory site has disabled active view for in-stream video creatives. This is a read-only field. */
  var videoActiveViewOptOut: js.UndefOr[scala.Boolean] = js.undefined
}

