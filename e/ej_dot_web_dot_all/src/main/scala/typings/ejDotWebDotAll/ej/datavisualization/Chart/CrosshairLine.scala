package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrosshairLine extends js.Object {
  /** Color of the crosshair line.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Width of the crosshair line.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CrosshairLine {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): CrosshairLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairLine]
  }
}

