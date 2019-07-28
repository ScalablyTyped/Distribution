package typings.ejDotWebDotAll.ejNs.SparklineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipBorder extends js.Object {
  /** Border color of the tooltip.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border width of the tooltip.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object TooltipBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): TooltipBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipBorder]
  }
}

