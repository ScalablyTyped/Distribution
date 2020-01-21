package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendBorder extends js.Object {
  /** Border color of the legend.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border width of the legend.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object LegendBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): LegendBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendBorder]
  }
}

