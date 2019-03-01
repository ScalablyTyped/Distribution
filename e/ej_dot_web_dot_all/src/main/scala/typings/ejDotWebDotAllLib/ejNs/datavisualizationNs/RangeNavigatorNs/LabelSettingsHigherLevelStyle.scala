package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

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
  var horizontalAlignment: js.UndefOr[java.lang.String] = js.undefined
}

object LabelSettingsHigherLevelStyle {
  @scala.inline
  def apply(font: LabelSettingsHigherLevelStyleFont = null, horizontalAlignment: java.lang.String = null): LabelSettingsHigherLevelStyle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    __obj.asInstanceOf[LabelSettingsHigherLevelStyle]
  }
}

