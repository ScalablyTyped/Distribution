package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrosshairLine extends js.Object {
  /** Color of the crosshair line.
    * @Default {transparent}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the crosshair line.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CrosshairLine {
  @scala.inline
  def apply(color: java.lang.String = null, width: scala.Int | scala.Double = null): CrosshairLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairLine]
  }
}

