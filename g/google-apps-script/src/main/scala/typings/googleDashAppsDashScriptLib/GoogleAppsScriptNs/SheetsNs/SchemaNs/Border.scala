package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Border {
  @scala.inline
  def apply(color: Color = null, style: java.lang.String = null, width: scala.Int | scala.Double = null): Border = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

