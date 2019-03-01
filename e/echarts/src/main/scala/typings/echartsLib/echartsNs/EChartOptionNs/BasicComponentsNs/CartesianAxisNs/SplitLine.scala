package typings
package echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait SplitLine extends js.Object {
  var interval: js.UndefOr[scala.Double | js.Function] = js.undefined
  var lineStyle: js.UndefOr[echartsLib.Anon_ColorDashed] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

object SplitLine {
  @scala.inline
  def apply(
    interval: scala.Double | js.Function = null,
    lineStyle: echartsLib.Anon_ColorDashed = null,
    show: js.UndefOr[scala.Boolean] = js.undefined
  ): SplitLine = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[SplitLine]
  }
}

