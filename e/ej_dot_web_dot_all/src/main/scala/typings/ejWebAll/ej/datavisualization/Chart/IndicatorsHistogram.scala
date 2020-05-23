package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorsHistogram extends js.Object {
  /** Options to customize the histogram border in MACD indicator.
    */
  var border: js.UndefOr[IndicatorsHistogramBorder] = js.undefined
  /** Color of histogram columns in MACD indicator.
    * @Default {#ccccff}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Opacity of histogram columns in MACD indicator.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object IndicatorsHistogram {
  @scala.inline
  def apply(
    border: IndicatorsHistogramBorder = null,
    fill: String = null,
    opacity: js.UndefOr[Double] = js.undefined
  ): IndicatorsHistogram = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorsHistogram]
  }
}

