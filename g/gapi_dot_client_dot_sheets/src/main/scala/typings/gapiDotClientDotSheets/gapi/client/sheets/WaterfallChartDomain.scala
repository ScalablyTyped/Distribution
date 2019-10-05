package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallChartDomain extends js.Object {
  /** The data of the WaterfallChartDomain. */
  var data: js.UndefOr[ChartData] = js.undefined
  /** True to reverse the order of the domain values (horizontal axis). */
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object WaterfallChartDomain {
  @scala.inline
  def apply(data: ChartData = null, reversed: js.UndefOr[Boolean] = js.undefined): WaterfallChartDomain = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[WaterfallChartDomain]
  }
}

