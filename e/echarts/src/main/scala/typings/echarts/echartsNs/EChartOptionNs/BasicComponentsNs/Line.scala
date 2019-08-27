package typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs

import typings.echarts.echartsNs.EChartOptionNs.LineStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait Line extends js.Object {
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  var onZero: js.UndefOr[Boolean] = js.undefined
  var onZeroAxisIndex: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var symbol: js.UndefOr[String | js.Array[String]] = js.undefined
  var symbolOffset: js.UndefOr[js.Array[Double]] = js.undefined
  var symbolSize: js.UndefOr[js.Array[Double]] = js.undefined
}

object Line {
  @scala.inline
  def apply(
    lineStyle: LineStyle = null,
    onZero: js.UndefOr[Boolean] = js.undefined,
    onZeroAxisIndex: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined,
    symbol: String | js.Array[String] = null,
    symbolOffset: js.Array[Double] = null,
    symbolSize: js.Array[Double] = null
  ): Line = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (!js.isUndefined(onZero)) __obj.updateDynamic("onZero")(onZero)
    if (onZeroAxisIndex != null) __obj.updateDynamic("onZeroAxisIndex")(onZeroAxisIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (symbolOffset != null) __obj.updateDynamic("symbolOffset")(symbolOffset)
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize)
    __obj.asInstanceOf[Line]
  }
}

