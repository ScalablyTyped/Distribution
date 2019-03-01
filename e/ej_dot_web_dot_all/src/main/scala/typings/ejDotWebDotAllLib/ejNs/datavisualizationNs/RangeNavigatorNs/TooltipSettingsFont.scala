package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipSettingsFont extends js.Object {
  /** Specifies the color of text in tooltip. Tooltip text render in the specified color.
    * @Default {#FFFFFF}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the font family of text in tooltip. Tooltip text render in the specified font family.
    * @Default {Segoe UI}
    */
  var family: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the font style of text in tooltip. Tooltip text render in the specified font style.
    * @Default {ej.datavisualization.RangeNavigator.fontStyle.Normal}
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the opacity of text in tooltip. Tooltip text render in the specified opacity.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the size of text in tooltip. Tooltip text render in the specified size.
    * @Default {10px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the weight of text in tooltip. Tooltip text render in the specified weight.
    * @Default {ej.datavisualization.RangeNavigator.weight.Regular}
    */
  var weight: js.UndefOr[java.lang.String] = js.undefined
}

object TooltipSettingsFont {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    family: java.lang.String = null,
    fontStyle: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    size: java.lang.String = null,
    weight: java.lang.String = null
  ): TooltipSettingsFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (family != null) __obj.updateDynamic("family")(family)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[TooltipSettingsFont]
  }
}

