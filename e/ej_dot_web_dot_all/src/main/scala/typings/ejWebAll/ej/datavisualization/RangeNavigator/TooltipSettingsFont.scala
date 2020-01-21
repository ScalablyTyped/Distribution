package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipSettingsFont extends js.Object {
  /** Specifies the color of text in tooltip. Tooltip text render in the specified color.
    * @Default {#FFFFFF}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the font family of text in tooltip. Tooltip text render in the specified font family.
    * @Default {Segoe UI}
    */
  var family: js.UndefOr[String] = js.undefined
  /** Specifies the font style of text in tooltip. Tooltip text render in the specified font style.
    * @Default {ej.datavisualization.RangeNavigator.fontStyle.Normal}
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  /** Specifies the opacity of text in tooltip. Tooltip text render in the specified opacity.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the size of text in tooltip. Tooltip text render in the specified size.
    * @Default {10px}
    */
  var size: js.UndefOr[String] = js.undefined
  /** Specifies the weight of text in tooltip. Tooltip text render in the specified weight.
    * @Default {ej.datavisualization.RangeNavigator.weight.Regular}
    */
  var weight: js.UndefOr[String] = js.undefined
}

object TooltipSettingsFont {
  @scala.inline
  def apply(
    color: String = null,
    family: String = null,
    fontStyle: String = null,
    opacity: Int | Double = null,
    size: String = null,
    weight: String = null
  ): TooltipSettingsFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipSettingsFont]
  }
}

