package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsStyle extends js.Object {
  /** Options for customizing the font of labels in range navigator.
    */
  var font: js.UndefOr[LabelSettingsStyleFont] = js.undefined
  /** Specifies the horizontalAlignment of the label in RangeNavigator
    * @Default {middle}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.undefined
}

object LabelSettingsStyle {
  @scala.inline
  def apply(font: LabelSettingsStyleFont = null, horizontalAlignment: HorizontalAlignment | String = null): LabelSettingsStyle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSettingsStyle]
  }
}

