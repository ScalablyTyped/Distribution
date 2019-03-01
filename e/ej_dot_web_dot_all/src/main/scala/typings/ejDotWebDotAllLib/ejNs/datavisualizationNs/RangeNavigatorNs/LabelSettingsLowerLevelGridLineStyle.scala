package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsLowerLevelGridLineStyle extends js.Object {
  /** Specifies the color of grid lines in lower level.
    * @Default {#B5B5B5}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the dashArray of gridLines in lowerLevel.
    * @Default {20 5 0}
    */
  var dashArray: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width of grid lines in lower level.
    * @Default {#B5B5B5}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object LabelSettingsLowerLevelGridLineStyle {
  @scala.inline
  def apply(color: java.lang.String = null, dashArray: java.lang.String = null, width: java.lang.String = null): LabelSettingsLowerLevelGridLineStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[LabelSettingsLowerLevelGridLineStyle]
  }
}

