package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallChartColumnStyle extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object WaterfallChartColumnStyle {
  @scala.inline
  def apply(color: Color = null, label: java.lang.String = null): WaterfallChartColumnStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[WaterfallChartColumnStyle]
  }
}

