package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.googleapis.Anon_Background
import typings.googleapis.Anon_FamilySize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AdStyle extends js.Object {
  /**
    * The colors which are included in the style. These are represented as six
    * hexadecimal characters, similar to HTML color codes, but without the
    * leading hash.
    */
  var colors: js.UndefOr[Anon_Background] = js.native
  /**
    * The style of the corners in the ad (deprecated: never populated,
    * ignored).
    */
  var corners: js.UndefOr[String] = js.native
  /**
    * The font which is included in the style.
    */
  var font: js.UndefOr[Anon_FamilySize] = js.native
  /**
    * Kind this is, in this case adsense#adStyle.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AdStyle {
  @scala.inline
  def apply(
    colors: Anon_Background = null,
    corners: String = null,
    font: Anon_FamilySize = null,
    kind: String = null
  ): Schema$AdStyle = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (corners != null) __obj.updateDynamic("corners")(corners.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AdStyle]
  }
}

