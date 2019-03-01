package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorsHistogramBorder extends js.Object {
  /** Color of the histogram border in MACD indicator.
    * @Default {#9999ff}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Controls the width of histogram border line in MACD indicator.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object IndicatorsHistogramBorder {
  @scala.inline
  def apply(color: java.lang.String = null, width: scala.Int | scala.Double = null): IndicatorsHistogramBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorsHistogramBorder]
  }
}

