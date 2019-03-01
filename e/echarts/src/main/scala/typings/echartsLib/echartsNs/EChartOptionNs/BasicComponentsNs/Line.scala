package typings
package echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait Line extends js.Object {
  var lineStyle: js.UndefOr[echartsLib.Anon_Color] = js.undefined
  var onZero: js.UndefOr[scala.Boolean] = js.undefined
  var onZeroAxisIndex: js.UndefOr[scala.Double] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var symbol: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var symbolOffset: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var symbolSize: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Line {
  @scala.inline
  def apply(
    lineStyle: echartsLib.Anon_Color = null,
    onZero: js.UndefOr[scala.Boolean] = js.undefined,
    onZeroAxisIndex: scala.Int | scala.Double = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    symbol: java.lang.String | js.Array[java.lang.String] = null,
    symbolOffset: js.Array[scala.Double] = null,
    symbolSize: js.Array[scala.Double] = null
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

