package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendItemStyleBorder extends js.Object {
  /** Border color of the legend items.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border width of the legend items.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object LegendItemStyleBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): LegendItemStyleBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendItemStyleBorder]
  }
}

