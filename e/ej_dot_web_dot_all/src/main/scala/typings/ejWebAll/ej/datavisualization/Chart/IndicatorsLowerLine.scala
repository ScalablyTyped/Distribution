package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorsLowerLine extends js.Object {
  /** Color of lower line.
    * @Default {#008000}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Width of the lower line.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IndicatorsLowerLine {
  @scala.inline
  def apply(fill: String = null, width: js.UndefOr[Double] = js.undefined): IndicatorsLowerLine = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorsLowerLine]
  }
}

