package typings.ejWebAll.ej.SunburstChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipBorder extends js.Object {
  /** Border color of the tooltip.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border width of the tooltip.
    * @Default {5}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object TooltipBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): TooltipBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipBorder]
  }
}

