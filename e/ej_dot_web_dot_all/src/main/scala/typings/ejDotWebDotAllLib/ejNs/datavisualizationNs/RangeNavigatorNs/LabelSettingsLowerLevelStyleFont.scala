package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsLowerLevelStyleFont extends js.Object {
  /** Specifies the color of labels. Label text render in this specified color.
    * @Default {black}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the font family of labels. Label text render in this specified font family.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the font style of labels. Label text render in this specified font style.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the font weight of labels. Label text render in this specified font weight.
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the opacity of labels. Label text render in this specified opacity.
    * @Default {12px}
    */
  var opacity: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the size of labels. Label text render in this specified size.
    * @Default {12px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object LabelSettingsLowerLevelStyleFont {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontStyle: java.lang.String = null,
    fontWeight: java.lang.String = null,
    opacity: java.lang.String = null,
    size: java.lang.String = null
  ): LabelSettingsLowerLevelStyleFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[LabelSettingsLowerLevelStyleFont]
  }
}

