package typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typings.echarts.echarts.EChartOption.LineStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait MinorTick extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var splitNumber: js.UndefOr[Double] = js.undefined
}

object MinorTick {
  @scala.inline
  def apply(
    length: js.UndefOr[Double] = js.undefined,
    lineStyle: LineStyle = null,
    show: js.UndefOr[Boolean] = js.undefined,
    splitNumber: js.UndefOr[Double] = js.undefined
  ): MinorTick = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(splitNumber)) __obj.updateDynamic("splitNumber")(splitNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinorTick]
  }
}

