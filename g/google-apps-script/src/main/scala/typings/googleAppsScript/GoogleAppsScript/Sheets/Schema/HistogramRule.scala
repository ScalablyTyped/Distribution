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
  def apply(end: Int | Double = null, interval: Int | Double = null, start: Int | Double = null): HistogramRule = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramRule]
  }
}

