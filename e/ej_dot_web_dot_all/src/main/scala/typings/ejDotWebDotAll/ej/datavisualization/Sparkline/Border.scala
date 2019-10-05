package typings.ejDotWebDotAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  /** Border color of the sparkline.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Width of the Sparkline border.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Border {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): Border = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

