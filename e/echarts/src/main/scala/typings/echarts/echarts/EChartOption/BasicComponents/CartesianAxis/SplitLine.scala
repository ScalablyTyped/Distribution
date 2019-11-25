package typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typings.echarts.echarts.EChartOption.LineStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait SplitLine extends js.Object {
  var interval: js.UndefOr[Double | js.Function] = js.undefined
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object SplitLine {
  @scala.inline
  def apply(
    interval: Double | js.Function = null,
    lineStyle: LineStyle = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): SplitLine = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitLine]
  }
}

