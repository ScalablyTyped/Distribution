package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesAlternateGridBandEven extends js.Object {
  /** Fill color for the even grid bands.
    * @Default {transparent}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity of the even grid band.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object AxesAlternateGridBandEven {
  @scala.inline
  def apply(fill: java.lang.String = null, opacity: scala.Int | scala.Double = null): AxesAlternateGridBandEven = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesAlternateGridBandEven]
  }
}

