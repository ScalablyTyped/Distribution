package typings.gapiDotClientDotAdsense.gapi.client.adsense

import typings.gapiDotClientDotAdsense.Anon_Background
import typings.gapiDotClientDotAdsense.Anon_Family
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdStyle extends js.Object {
  /**
    * The colors which are included in the style. These are represented as six hexadecimal characters, similar to HTML color codes, but without the leading
    * hash.
    */
  var colors: js.UndefOr[Anon_Background] = js.undefined
  /** The style of the corners in the ad (deprecated: never populated, ignored). */
  var corners: js.UndefOr[String] = js.undefined
  /** The font which is included in the style. */
  var font: js.UndefOr[Anon_Family] = js.undefined
  /** Kind this is, in this case adsense#adStyle. */
  var kind: js.UndefOr[String] = js.undefined
}

object AdStyle {
  @scala.inline
  def apply(
    colors: Anon_Background = null,
    corners: String = null,
    font: Anon_Family = null,
    kind: String = null
  ): AdStyle = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (corners != null) __obj.updateDynamic("corners")(corners.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdStyle]
  }
}

