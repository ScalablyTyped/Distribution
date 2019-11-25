package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsHigherLevelStyleFont extends js.Object {
  /** Specifies the label font color. Labels render with the specified font color.
    * @Default {black}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the label font family. Labels render with the specified font family.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Specifies the label font style. Labels render with the specified font style.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  /** Specifies the label font weight. Labels render with the specified font weight.
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  /** Specifies the label opacity. Labels render with the specified opacity.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the label font size. Labels render with the specified font size.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object LabelSettingsHigherLevelStyleFont {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontStyle: String = null,
    fontWeight: String = null,
    opacity: Int | Double = null,
    size: String = null
  ): LabelSettingsHigherLevelStyleFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSettingsHigherLevelStyleFont]
  }
}

