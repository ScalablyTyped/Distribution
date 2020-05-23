package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyle extends js.Object {
  var lineStyle: js.UndefOr[typings.echarts.echarts.EChartOption.LineStyle] = js.undefined
  /**
    * Set this to false to prevent the splitLine from showing
    *
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object LineStyle {
  @scala.inline
  def apply(
    lineStyle: typings.echarts.echarts.EChartOption.LineStyle = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

