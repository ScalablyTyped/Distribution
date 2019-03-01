package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendLocation extends js.Object {
  /** X value or horizontal offset to position the legend in chart.
    * @Default {0}
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** Y value or vertical offset to position the legend.
    * @Default {0}
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object LegendLocation {
  @scala.inline
  def apply(x: scala.Int | scala.Double = null, y: scala.Int | scala.Double = null): LegendLocation = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendLocation]
  }
}

