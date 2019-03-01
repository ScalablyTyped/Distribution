package typings
package googleDashAppsDashScriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rgbcolor extends js.Object {
  // An opaque RGB color.
  var rgb_color: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.RgbColor
  // An opaque theme color.
  var theme_color: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ThemeColorType
}

object Anon_Rgbcolor {
  @scala.inline
  def apply(
    rgb_color: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.RgbColor,
    theme_color: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ThemeColorType
  ): Anon_Rgbcolor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rgb_color")(rgb_color)
    __obj.updateDynamic("theme_color")(theme_color)
    __obj.asInstanceOf[Anon_Rgbcolor]
  }
}

