package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  /** Border color of rangenavigator. When enable the scrollbar, the default color will be set as &quot;#B4B4B4&quot;.
    * @Default {transparent}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity of the rangeNavigator border.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Width of the RangeNavigator border.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Border {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Border = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

