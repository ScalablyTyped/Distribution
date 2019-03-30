package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeColorPair extends js.Object {
  var color: js.UndefOr[RgbColor] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ThemeColorPair {
  @scala.inline
  def apply(color: RgbColor = null, `type`: java.lang.String = null): ThemeColorPair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ThemeColorPair]
  }
}

