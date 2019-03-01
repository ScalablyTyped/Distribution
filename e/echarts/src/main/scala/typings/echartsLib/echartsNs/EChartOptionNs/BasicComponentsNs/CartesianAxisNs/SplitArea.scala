package typings
package echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait SplitArea extends js.Object {
  var areaStyle: js.UndefOr[echartsLib.Anon_ColorOpacity] = js.undefined
  var interval: js.UndefOr[scala.Double | js.Function] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

object SplitArea {
  @scala.inline
  def apply(
    areaStyle: echartsLib.Anon_ColorOpacity = null,
    interval: scala.Double | js.Function = null,
    show: js.UndefOr[scala.Boolean] = js.undefined
  ): SplitArea = {
    val __obj = js.Dynamic.literal()
    if (areaStyle != null) __obj.updateDynamic("areaStyle")(areaStyle)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[SplitArea]
  }
}

