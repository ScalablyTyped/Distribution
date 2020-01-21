package typings.echarts

import typings.echarts.echarts.EChartOption.LineStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineStyle extends js.Object {
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  /**
    * Set this to false to prevent the splitLine from showing
    *
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object AnonLineStyle {
  @scala.inline
  def apply(lineStyle: LineStyle = null, show: js.UndefOr[Boolean] = js.undefined): AnonLineStyle = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineStyle]
  }
}

