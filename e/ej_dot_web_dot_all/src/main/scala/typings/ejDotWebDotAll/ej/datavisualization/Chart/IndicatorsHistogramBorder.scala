package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorsHistogramBorder extends js.Object {
  /** Color of the histogram border in MACD indicator.
    * @Default {#9999ff}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Controls the width of histogram border line in MACD indicator.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IndicatorsHistogramBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): IndicatorsHistogramBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorsHistogramBorder]
  }
}

