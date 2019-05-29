package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var alpha: js.UndefOr[scala.Double] = js.undefined
  var blue: js.UndefOr[scala.Double] = js.undefined
  var green: js.UndefOr[scala.Double] = js.undefined
  var red: js.UndefOr[scala.Double] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    alpha: scala.Int | scala.Double = null,
    blue: scala.Int | scala.Double = null,
    green: scala.Int | scala.Double = null,
    red: scala.Int | scala.Double = null
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

