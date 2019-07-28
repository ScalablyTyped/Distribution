package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTooltipBorder extends js.Object {
  /** Border Color of the tooltip.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border Width of the tooltip.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SeriesTooltipBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): SeriesTooltipBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTooltipBorder]
  }
}

