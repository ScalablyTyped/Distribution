package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorStyleSettingsSelectionSettingsBorder extends js.Object {
  /** To set the border color to the selection.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** To set the border width to the selection.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object NavigatorStyleSettingsSelectionSettingsBorder {
  @scala.inline
  def apply(color: java.lang.String = null, width: scala.Int | scala.Double = null): NavigatorStyleSettingsSelectionSettingsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStyleSettingsSelectionSettingsBorder]
  }
}

