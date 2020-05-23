package typings.ejWebAll.ej.datavisualization.SunburstChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Margin extends js.Object {
  /** Spacing for the bottom margin of the chart area. Setting positive value decreases the height of the chart area from the bottom.
    * @Default {10}
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /** Spacing for the left margin of chart area. Setting positive value decreases the width of the chart area from left side.
    * @Default {10}
    */
  var left: js.UndefOr[Double] = js.undefined
  /** Spacing for the right margin of chart area. Setting positive value decreases the width of the chart area from right side.
    * @Default {10}
    */
  var right: js.UndefOr[Double] = js.undefined
  /** Spacing for the top margin of chart area. Setting positive value decreases the height of the chart area from the top.
    * @Default {10}
    */
  var top: js.UndefOr[Double] = js.undefined
}

object Margin {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): Margin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Margin]
  }
}

