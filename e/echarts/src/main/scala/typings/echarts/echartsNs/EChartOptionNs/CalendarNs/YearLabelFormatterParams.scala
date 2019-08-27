package typings.echarts.echartsNs.EChartOptionNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YearLabelFormatterParams extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var nameMap: js.UndefOr[String | Double | (js.Array[String | Double])] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object YearLabelFormatterParams {
  @scala.inline
  def apply(
    end: Int | Double = null,
    nameMap: String | Double | (js.Array[String | Double]) = null,
    start: Int | Double = null
  ): YearLabelFormatterParams = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (nameMap != null) __obj.updateDynamic("nameMap")(nameMap.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[YearLabelFormatterParams]
  }
}

