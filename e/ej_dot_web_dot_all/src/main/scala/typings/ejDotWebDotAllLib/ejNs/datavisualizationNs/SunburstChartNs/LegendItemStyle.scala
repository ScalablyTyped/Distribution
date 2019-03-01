package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendItemStyle extends js.Object {
  /** Height of the shape in legend items.
    * @Default {10}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Width of the shape in legend items.
    * @Default {10}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object LegendItemStyle {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null, width: scala.Int | scala.Double = null): LegendItemStyle = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendItemStyle]
  }
}

