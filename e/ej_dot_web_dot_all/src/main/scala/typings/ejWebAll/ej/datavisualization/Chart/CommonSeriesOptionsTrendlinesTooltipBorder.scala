package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsTrendlinesTooltipBorder extends js.Object {
  /** Border color of the trendline tooltip.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border width of the trendline tooltip.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CommonSeriesOptionsTrendlinesTooltipBorder {
  @scala.inline
  def apply(color: String = null, width: js.UndefOr[Double] = js.undefined): CommonSeriesOptionsTrendlinesTooltipBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsTrendlinesTooltipBorder]
  }
}

