package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallChartDomain extends js.Object {
  var data: js.UndefOr[ChartData] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
}

object WaterfallChartDomain {
  @scala.inline
  def apply(data: ChartData = null, reversed: js.UndefOr[scala.Boolean] = js.undefined): WaterfallChartDomain = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[WaterfallChartDomain]
  }
}

