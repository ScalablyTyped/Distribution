package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Margin extends js.Object {
  /** Spacing for the bottom margin of the chart area. Setting positive value decreases the height of the chart area from the bottom.
    * @Default {10}
    */
  var bottom: js.UndefOr[scala.Double] = js.undefined
  /** Spacing for the left margin of chart area. Setting positive value decreases the width of the chart area from left side.
    * @Default {10}
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /** Spacing for the right margin of chart area. Setting positive value decreases the width of the chart area from right side.
    * @Default {10}
    */
  var right: js.UndefOr[scala.Double] = js.undefined
  /** Spacing for the top margin of chart area. Setting positive value decreases the height of the chart area from the top.
    * @Default {10}
    */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object Margin {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): Margin = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Margin]
  }
}

