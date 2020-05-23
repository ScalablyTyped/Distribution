package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramRule extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object HistogramRule {
  @scala.inline
  def apply(
    end: js.UndefOr[Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): HistogramRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramRule]
  }
}

