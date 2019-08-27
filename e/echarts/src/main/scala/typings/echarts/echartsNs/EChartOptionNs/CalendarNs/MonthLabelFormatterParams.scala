package typings.echarts.echartsNs.EChartOptionNs.CalendarNs

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
    M: Int | Double = null,
    MM: Int | Double = null,
    nameMap: String | Double | (js.Array[String | Double]) = null,
    yy: Int | Double = null,
    yyyy: Int | Double = null
  ): MonthLabelFormatterParams = {
    val __obj = js.Dynamic.literal()
    if (M != null) __obj.updateDynamic("M")(M.asInstanceOf[js.Any])
    if (MM != null) __obj.updateDynamic("MM")(MM.asInstanceOf[js.Any])
    if (nameMap != null) __obj.updateDynamic("nameMap")(nameMap.asInstanceOf[js.Any])
    if (yy != null) __obj.updateDynamic("yy")(yy.asInstanceOf[js.Any])
    if (yyyy != null) __obj.updateDynamic("yyyy")(yyyy.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthLabelFormatterParams]
  }
}

