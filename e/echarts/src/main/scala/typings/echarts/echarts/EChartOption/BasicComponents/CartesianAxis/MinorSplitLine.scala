package typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typings.echarts.echarts.EChartOption.LineStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait MinorSplitLine extends js.Object {
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object MinorSplitLine {
  @scala.inline
  def apply(lineStyle: LineStyle = null, show: js.UndefOr[Boolean] = js.undefined): MinorSplitLine = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinorSplitLine]
  }
}

