package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbColor extends js.Object {
  var blue: js.UndefOr[stdLib.Number] = js.undefined
  var green: js.UndefOr[stdLib.Number] = js.undefined
  var red: js.UndefOr[stdLib.Number] = js.undefined
}

object RgbColor {
  @scala.inline
  def apply(blue: stdLib.Number = null, green: stdLib.Number = null, red: stdLib.Number = null): RgbColor = {
    val __obj = js.Dynamic.literal()
    if (blue != null) __obj.updateDynamic("blue")(blue)
    if (green != null) __obj.updateDynamic("green")(green)
    if (red != null) __obj.updateDynamic("red")(red)
    __obj.asInstanceOf[RgbColor]
  }
}

