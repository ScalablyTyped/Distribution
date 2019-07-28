package typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs

import typings.echarts.Anon_ColorDashed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait SplitLine extends js.Object {
  var interval: js.UndefOr[Double | js.Function] = js.undefined
  var lineStyle: js.UndefOr[Anon_ColorDashed] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object SplitLine {
  @scala.inline
  def apply(
    interval: Double | js.Function = null,
    lineStyle: Anon_ColorDashed = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): SplitLine = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[SplitLine]
  }
}

