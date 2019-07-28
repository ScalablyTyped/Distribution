package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTrendlinesTooltipBorder extends js.Object {
  /** Specify the Border color of the  trendline tooltip.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border width of the trendline tooltip.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SeriesTrendlinesTooltipBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): SeriesTrendlinesTooltipBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTrendlinesTooltipBorder]
  }
}

