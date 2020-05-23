package typings.gapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClientAdsensehost.anon.Background
import typings.gapiClientAdsensehost.anon.Family
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdStyle extends js.Object {
  /** The colors included in the style. These are represented as six hexadecimal characters, similar to HTML color codes, but without the leading hash. */
  var colors: js.UndefOr[Background] = js.undefined
  /** The style of the corners in the ad (deprecated: never populated, ignored). */
  var corners: js.UndefOr[String] = js.undefined
  /** The font which is included in the style. */
  var font: js.UndefOr[Family] = js.undefined
  /** Kind this is, in this case adsensehost#adStyle. */
  var kind: js.UndefOr[String] = js.undefined
}

object AdStyle {
  @scala.inline
  def apply(colors: Background = null, corners: String = null, font: Family = null, kind: String = null): AdStyle = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (corners != null) __obj.updateDynamic("corners")(corners.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdStyle]
  }
}

