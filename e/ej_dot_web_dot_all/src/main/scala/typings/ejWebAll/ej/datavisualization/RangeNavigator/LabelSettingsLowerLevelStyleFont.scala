package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsLowerLevelStyleFont extends js.Object {
  /** Specifies the color of labels. Label text render in this specified color.
    * @Default {black}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the font family of labels. Label text render in this specified font family.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Specifies the font style of labels. Label text render in this specified font style.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  /** Specifies the font weight of labels. Label text render in this specified font weight.
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  /** Specifies the opacity of labels. Label text render in this specified opacity.
    * @Default {12px}
    */
  var opacity: js.UndefOr[String] = js.undefined
  /** Specifies the size of labels. Label text render in this specified size.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object LabelSettingsLowerLevelStyleFont {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontStyle: String = null,
    fontWeight: String = null,
    opacity: String = null,
    size: String = null
  ): LabelSettingsLowerLevelStyleFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSettingsLowerLevelStyleFont]
  }
}

