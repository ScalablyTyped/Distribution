package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdStyle extends js.Object {
  var colors: js.UndefOr[AdStyleColors] = js.undefined
  var corners: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[AdStyleFont] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AdStyle {
  @scala.inline
  def apply(
    colors: AdStyleColors = null,
    corners: java.lang.String = null,
    font: AdStyleFont = null,
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

