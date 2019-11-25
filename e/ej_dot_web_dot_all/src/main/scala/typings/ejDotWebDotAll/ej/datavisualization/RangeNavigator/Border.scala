package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  /** Border color of rangenavigator. When enable the scrollbar, the default color will be set as &quot;#B4B4B4&quot;.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Opacity of the rangeNavigator border.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Width of the RangeNavigator border.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Border {
  @scala.inline
  def apply(color: String = null, opacity: Int | Double = null, width: Int | Double = null): Border = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

