package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsHigherLevelGridLineStyle extends js.Object {
  /** Specifies the color of grid lines in higher level.
    * @Default {#B5B5B5}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the dashArray of grid lines in higher level.
    * @Default {20 5 0}
    */
  var dashArray: js.UndefOr[String] = js.undefined
  /** Specifies the width of grid lines in higher level.
    * @Default {#B5B5B5}
    */
  var width: js.UndefOr[String] = js.undefined
}

object LabelSettingsHigherLevelGridLineStyle {
  @scala.inline
  def apply(color: String = null, dashArray: String = null, width: String = null): LabelSettingsHigherLevelGridLineStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSettingsHigherLevelGridLineStyle]
  }
}

