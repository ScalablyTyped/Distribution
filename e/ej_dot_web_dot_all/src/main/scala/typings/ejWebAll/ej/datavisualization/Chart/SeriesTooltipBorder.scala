package typings.ejWebAll.ej.datavisualization.Chart

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
  def apply(color: String = null, width: js.UndefOr[Double] = js.undefined): SeriesTooltipBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTooltipBorder]
  }
}

