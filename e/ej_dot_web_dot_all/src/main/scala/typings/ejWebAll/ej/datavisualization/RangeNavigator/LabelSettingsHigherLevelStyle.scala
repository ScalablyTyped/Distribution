package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsHigherLevelStyle extends js.Object {
  /** Options for customizing the font properties.
    */
  var font: js.UndefOr[LabelSettingsHigherLevelStyleFont] = js.undefined
  /** Specifies the horizontal text alignment of the text in label.
    * @Default {middle}
    */
  var horizontalAlignment: js.UndefOr[String] = js.undefined
}

object LabelSettingsHigherLevelStyle {
  @scala.inline
  def apply(font: LabelSettingsHigherLevelStyleFont = null, horizontalAlignment: String = null): LabelSettingsHigherLevelStyle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSettingsHigherLevelStyle]
  }
}

