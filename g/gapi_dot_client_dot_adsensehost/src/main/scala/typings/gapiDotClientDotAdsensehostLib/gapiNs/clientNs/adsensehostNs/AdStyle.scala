package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdStyle extends js.Object {
  /** The colors included in the style. These are represented as six hexadecimal characters, similar to HTML color codes, but without the leading hash. */
  var colors: js.UndefOr[gapiDotClientDotAdsensehostLib.Anon_Background] = js.undefined
  /** The style of the corners in the ad (deprecated: never populated, ignored). */
  var corners: js.UndefOr[java.lang.String] = js.undefined
  /** The font which is included in the style. */
  var font: js.UndefOr[gapiDotClientDotAdsensehostLib.Anon_Family] = js.undefined
  /** Kind this is, in this case adsensehost#adStyle. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AdStyle {
  @scala.inline
  def apply(
    colors: gapiDotClientDotAdsensehostLib.Anon_Background = null,
    corners: java.lang.String = null,
    font: gapiDotClientDotAdsensehostLib.Anon_Family = null,
    kind: java.lang.String = null
  ): AdStyle = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (corners != null) __obj.updateDynamic("corners")(corners)
    if (font != null) __obj.updateDynamic("font")(font)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AdStyle]
  }
}

