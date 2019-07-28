package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeColorPair extends js.Object {
  var color: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.RgbColor] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ThemeColorPair {
  @scala.inline
  def apply(
    color: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.RgbColor = null,
    `type`: String = null
  ): ThemeColorPair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ThemeColorPair]
  }
}

