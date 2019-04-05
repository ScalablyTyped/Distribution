package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var alpha: js.UndefOr[stdLib.Number] = js.undefined
  var blue: js.UndefOr[stdLib.Number] = js.undefined
  var green: js.UndefOr[stdLib.Number] = js.undefined
  var red: js.UndefOr[stdLib.Number] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    alpha: stdLib.Number = null,
    blue: stdLib.Number = null,
    green: stdLib.Number = null,
    red: stdLib.Number = null
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha)
    if (blue != null) __obj.updateDynamic("blue")(blue)
    if (green != null) __obj.updateDynamic("green")(green)
    if (red != null) __obj.updateDynamic("red")(red)
    __obj.asInstanceOf[Color]
  }
}

