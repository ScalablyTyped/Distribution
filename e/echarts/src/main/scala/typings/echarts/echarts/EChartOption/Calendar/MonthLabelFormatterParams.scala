package typings.echarts.echarts.EChartOption.Calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthLabelFormatterParams extends js.Object {
  var M: js.UndefOr[Double] = js.undefined
  var MM: js.UndefOr[Double] = js.undefined
  var nameMap: js.UndefOr[String | Double | (js.Array[String | Double])] = js.undefined
  var yy: js.UndefOr[Double] = js.undefined
  var yyyy: js.UndefOr[Double] = js.undefined
}

object MonthLabelFormatterParams {
  @scala.inline
  def apply(
    M: js.UndefOr[Double] = js.undefined,
    MM: js.UndefOr[Double] = js.undefined,
    nameMap: String | Double | (js.Array[String | Double]) = null,
    yy: js.UndefOr[Double] = js.undefined,
    yyyy: js.UndefOr[Double] = js.undefined
  ): MonthLabelFormatterParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(M)) __obj.updateDynamic("M")(M.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MM)) __obj.updateDynamic("MM")(MM.get.asInstanceOf[js.Any])
    if (nameMap != null) __obj.updateDynamic("nameMap")(nameMap.asInstanceOf[js.Any])
    if (!js.isUndefined(yy)) __obj.updateDynamic("yy")(yy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yyyy)) __obj.updateDynamic("yyyy")(yyyy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthLabelFormatterParams]
  }
}

