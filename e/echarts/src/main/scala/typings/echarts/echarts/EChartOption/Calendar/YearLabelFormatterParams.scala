package typings.echarts.echarts.EChartOption.Calendar

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
    end: js.UndefOr[Double] = js.undefined,
    nameMap: String | Double | (js.Array[String | Double]) = null,
    start: js.UndefOr[Double] = js.undefined
  ): YearLabelFormatterParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (nameMap != null) __obj.updateDynamic("nameMap")(nameMap.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[YearLabelFormatterParams]
  }
}

