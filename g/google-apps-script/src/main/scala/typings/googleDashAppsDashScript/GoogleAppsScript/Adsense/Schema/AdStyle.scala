package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdStyle extends js.Object {
  var colors: js.UndefOr[AdStyleColors] = js.undefined
  var corners: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[AdStyleFont] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object AdStyle {
  @scala.inline
  def apply(
    colors: AdStyleColors = null,
    corners: String = null,
    font: AdStyleFont = null,
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

