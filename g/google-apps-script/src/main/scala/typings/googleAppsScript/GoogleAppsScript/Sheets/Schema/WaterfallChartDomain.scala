package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallChartDomain extends js.Object {
  var data: js.UndefOr[ChartData] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object WaterfallChartDomain {
  @scala.inline
  def apply(data: ChartData = null, reversed: js.UndefOr[Boolean] = js.undefined): WaterfallChartDomain = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterfallChartDomain]
  }
}

