package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorsUpperLine extends js.Object {
  /** Fill color of the upper line in indicators
    * @Default {#ff9933}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Width of the upper line in indicators.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IndicatorsUpperLine {
  @scala.inline
  def apply(fill: String = null, width: js.UndefOr[Double] = js.undefined): IndicatorsUpperLine = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorsUpperLine]
  }
}

