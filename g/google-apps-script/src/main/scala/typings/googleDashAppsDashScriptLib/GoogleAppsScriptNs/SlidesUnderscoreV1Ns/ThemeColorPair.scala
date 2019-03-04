package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeColorPair extends js.Object {
  // The concrete color corresponding to the theme color type above.
  var color: RgbColor
  // The type of the theme color.
  var `type`: ThemeColorType
}

object ThemeColorPair {
  @scala.inline
  def apply(color: RgbColor, `type`: ThemeColorType): ThemeColorPair = {
    val __obj = js.Dynamic.literal(color = color)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ThemeColorPair]
  }
}

