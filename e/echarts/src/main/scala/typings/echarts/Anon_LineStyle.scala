package typings.echarts

import typings.echarts.echartsNs.EChartOptionNs.LineStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineStyle extends js.Object {
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  /**
    * Set this to false to prevent the splitLine from showing
    *
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object Anon_LineStyle {
  @scala.inline
  def apply(lineStyle: LineStyle = null, show: js.UndefOr[Boolean] = js.undefined): Anon_LineStyle = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_LineStyle]
  }
}

