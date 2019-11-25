package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorsTooltipBorder extends js.Object {
  /** Border color of indicator tooltip.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border width of indicator tooltip.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IndicatorsTooltipBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): IndicatorsTooltipBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorsTooltipBorder]
  }
}

